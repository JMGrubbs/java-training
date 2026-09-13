package game.adventure.game;

import java.util.List;
import java.util.Random;

public class Game {
    private Random random = new Random();
    private GameMap map;
    private  Player player;

    public Game(){
        this.map = new GameMap(100, 100);
        map.populateMap();
        String randomLocation = map.getRandomLocation();
        this.player = new Player("John", randomLocation);
    }

    public void showMap(){
        map.freindlyMap(this.player);
    }

    public void moveLeft() {
        List<Integer> coords = this.player.parseLocation();

        int x = coords.get(0);
        int y = coords.get(1);

        x = x - 1;
        if (x < 0) {
            x = 0;
        }

        coords.set(0, x);

        String locationKey = x + "," + y;
        player.setCurrentLocation(locationKey);
    }

    public void moveDown() {
        List<Integer> coords = this.player.parseLocation();

        int x = coords.get(0);
        int y = coords.get(1);

        y = y + 1;
        if (y > map.getYSize()-1) {
            y = map.getYSize()-1;
        }

        coords.set(1, y);

        String locationKey = x + "," + y;
        player.setCurrentLocation(locationKey);
    }

    public void moveRight() {
        List<Integer> coords = this.player.parseLocation();

        int x = coords.get(0);
        int y = coords.get(1);

        x = x + 1;
        if (x > map.getXSize()-1) {
            x = map.getXSize()-1;
        }

        coords.set(0, x);

        String locationKey = x + "," + y;
        player.setCurrentLocation(locationKey);
    }

    public void moveUp() {
        List<Integer> coords = this.player.parseLocation();

        int x = coords.get(0);
        int y = coords.get(1);

        y = y - 1;
        if (y < 0) {
            y = 0;
        }

        coords.set(1, y);

        String locationKey = x + "," + y;
        player.setCurrentLocation(locationKey);
    }

    private void handlePlayerLocation(Player player) {
        MapLocation location = map.getLocationData().get(player.getCurrentLocationKey());

        if (location != null) {
            switch (location.getName()) {
                case "Loot" -> {
                    this.addMoney(player);
                    List<Integer> coords = player.parseLocation();
                    map.emptyMapLocation(coords.get(0), coords.get(1));
                }
                case "Drag" -> {
                    this.fightDrad(player);
                    List<Integer> coords = player.parseLocation();
                    map.emptyMapLocation(coords.get(0), coords.get(1));
                }
                case "Town" -> {
                    this.visitTown(player);
                }

                default -> System.out.println("?");
            }
        }
    }

    public void addMoney(Player player){
        int newMoney = random.nextInt(5);
        player.addMoney(newMoney);
    }

    public void fightDrad(Player player){
        System.out.println("Fighting Drag");
    };

    public void visitTown(Player player){
        System.out.println("Visiting Town");
    };


    public MapLocation getPlayerLocation(){

        MapLocation playerLocation = this.map.getLocation(player.getCurrentLocationKey());
        System.out.println(playerLocation);
        return playerLocation;
    }

    public void displayScreen(){
        this.handlePlayerLocation(player);
        this.showMap();
    }
}
