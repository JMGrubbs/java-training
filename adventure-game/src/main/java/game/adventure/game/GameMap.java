package game.adventure.game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GameMap {
    private Random random = new Random();
    private int xSize;
    private int ySize;
    private Map<String, MapLocation> locationData = new HashMap<>();
    private String[][] mapLayout;

    public GameMap(){
        this(10, 10);
    }

    public GameMap(int x, int y){
        this.xSize = x;
        this.ySize = y;
        this.mapLayout = new String[this.xSize][this.ySize];
    }

    public int getXSize(){
        return this.xSize;

    }

    public int getYSize(){
        return this.ySize;
    }

    public void populateMap() {
        String[] uniqueLocations = {"Town", "Loot", "Drag"};

        int numberOfLocations = Math.max(
            uniqueLocations.length,
            (this.xSize * this.ySize) / 40
        );

        while (locationData.size() < numberOfLocations) {
            int x = random.nextInt(this.xSize);
            int y = random.nextInt(this.ySize);
            String locationKey = getKeyFromCoords(x, y);
            if (!locationData.containsKey(locationKey)) {
                int randomLocationIndex = random.nextInt(uniqueLocations.length);
                String locationName = uniqueLocations[randomLocationIndex];
                this.setMapLocation(x, y, locationName, numberOfLocations);
            }
        }
    }

    private String getKeyFromCoords(int x, int y){
        String key = ""+x+","+y;
        return key;
    }

    public int getDistance(int x1, int y1, int x2, int y2) {
        return (int) Math.round(
            Math.hypot(x2 - x1, y2 - y1)
        );
    }

    private String getMapSymbol(MapLocation location){
        String symbol = switch (location.getName()) {
            case "Town" -> " T ";
            case "Loot" -> " $ ";
            case "Drag" -> " D ";
            default -> " ? ";
        };

        return symbol;
    }

    private void printTopMapBoarder(
        int submapLowerBoundX,
        int submapUpperBoundX
    ){
        System.out.println();
        System.out.println("=== ADVENTURE MAP ===");
        // Column headers
        System.out.print("    ");
        for (int x = submapLowerBoundX; x < submapUpperBoundX; x++) {
            System.out.printf("%-3d", x);
        }
        System.out.println();
        System.out.print("    ");
        for (int x = submapLowerBoundX; x < submapUpperBoundX; x++) {
            System.out.print("---");
        }
        System.out.println();
    }

    public void freindlyMap(){
        this.freindlyMap(null);
    }

    public void freindlyMap(Player player) {
        List<Integer> playerCurrentCoords = player.parseLocation();
        int playerVisionRange = player.getVisionRange();
        int playersCurrentX = playerCurrentCoords.get(0);
        int playersCurrentY = playerCurrentCoords.get(1);

        int submapUpperBoundX = playersCurrentX + playerVisionRange*2;
        int submapLowerBoundX = playersCurrentX - playerVisionRange*2;
        int submapUpperBoundY = playersCurrentY + playerVisionRange*2;
        int submapLowerBoundY = playersCurrentY - playerVisionRange*2;

        submapUpperBoundX = submapUpperBoundX > this.xSize ? this.xSize : submapUpperBoundX-1;
        submapLowerBoundX = submapLowerBoundX < 0 ? 0 : submapLowerBoundX;
        submapUpperBoundY = submapUpperBoundY > this.ySize ? this.ySize : submapUpperBoundY-1;
        submapLowerBoundY = submapLowerBoundY < 0 ? 0 : submapLowerBoundY;

        // prints stats to screen
        player.getPlayerStats();

        // prints the top map boarder
        this.printTopMapBoarder(submapLowerBoundX, submapUpperBoundX);

        for (int y = submapLowerBoundY; y < submapUpperBoundY; y++) {
            // Row header
            System.out.printf("%-3d|", y);

            for (int x = submapLowerBoundX; x < submapUpperBoundX; x++) {
                String locationKey = getKeyFromCoords(x, y);
                MapLocation location = locationData.get(locationKey);

                int locationDistance = getDistance(x, y, playersCurrentX, playersCurrentY);

                if (locationDistance > playerVisionRange) {
                    System.out.printf("[F]");
                } else if (player != null && locationKey.equals(player.getCurrentLocationKey())) {
                    System.out.printf(" P ");
                } else if (location != null) {
                    String symbol = this.getMapSymbol(location);
                    System.out.printf(symbol);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.print("|\n");
        }
        printMapHints(submapLowerBoundX, submapUpperBoundX);
    }

    public void printMapHints(int submapLowerBoundX, int submapUpperBoundX){
        System.out.print("    ");
        for (int x = submapLowerBoundX; x < submapUpperBoundX; x++) {
            System.out.print("---");
        }

        System.out.println();
        System.out.println("Legend:");
        System.out.println("  [T] Town");
        System.out.println("  [$] Loot");
        System.out.println("  [D] Dragon");
        System.out.println("  [ ] Empty");
        System.out.println("  [P] Player");
    }

    public Map<String, MapLocation> getLocationData() {
        return locationData;
    }

    public void setMapLocation(int x, int y, String name, int value){
        String locationKey = getKeyFromCoords(x, y);
        MapLocation locationValue = new MapLocation(name, value);
        this.locationData.put(locationKey, locationValue);
    }

    public void emptyMapLocation(int x, int y){
        String locationKey = getKeyFromCoords(x, y);
        this.locationData.put(locationKey, null);
    }

    public MapLocation getLocation(String key){
        return this.locationData.get(key);
    }

    public String getRandomLocation(){
        int y = random.nextInt(this.xSize);
        int x = random.nextInt(this.ySize);
        return this.getKeyFromCoords(x, y);
    }

    public Random getRandom() {
        return random;
    }

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }

    public String[][] getMapLayout() {
        return mapLayout;
    }
}
