package game.adventure.game;


import java.util.Random;
import java.util.HashMap;
import java.util.Map;

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
            (this.xSize * this.ySize) / 4
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

    public void freindlyMap(){
        this.freindlyMap(null);

    }

    public void freindlyMap(Player player) {
        System.out.println();
        System.out.println("=== ADVENTURE MAP ===");
        // Column headers
        System.out.print("    ");
        for (int x = 0; x < xSize; x++) {
            System.out.printf("%-6d", x);
        }
        System.out.println();
        System.out.print("    ");
        for (int x = 0; x < xSize; x++) {
            System.out.print("------");
        }
        System.out.println();

        for (int y = 0; y < this.mapLayout.length; y++) {
            // Row header
            System.out.printf("%-3d|", y);

            for (int x = 0; x < this.mapLayout[y].length; x++) {
                String locationKey = getKeyFromCoords(x, y);
                MapLocation location = locationData.get(locationKey);


                if (player != null && locationKey.equals(player.getCurrentLocation())) {
                    System.out.printf("["+player.getName()+"]");
                } else if (location != null) {
                    String symbol = switch (location.getName()) {
                        case "Town" -> "[T]";
                        case "Loot" -> "[$]";
                        case "Drag" -> "[D]";
                        default -> "[?]";
                    };

                    System.out.printf("%-6s", symbol);
                } else {
                    System.out.printf("%-6s", "[ ]");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Legend:");
        System.out.println("  [T] Town");
        System.out.println("  [$] Loot");
        System.out.println("  [D] Dragon");
        System.out.println("  [ ] Empty");
        System.out.println("  [playerName] Empty");

    }

    public Map<String, MapLocation> getLocationData() {
        return locationData;
    }

    public void setMapLocation(int x, int y, String name, int value){
        String locationKey = getKeyFromCoords(x, y);
        MapLocation locationValue = new MapLocation(name, value);
        this.locationData.put(locationKey, locationValue);
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
