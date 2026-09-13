package game.adventure.game;

import java.util.List;

public class Game {
    private GameMap map;
    public  Player player;

    public Game(){
        this.map = new GameMap(15, 15);
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
}
