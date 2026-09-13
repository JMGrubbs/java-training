package game.adventure.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private int health;
    private String name;
    private String currentLocation;

    public Player(String name, String currentLocation){
        this.name = name;
        this.currentLocation = currentLocation;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    public  List<Integer> parseLocation() {
        String[] locationArray = this.currentLocation.split(",");
        List<Integer> coordinates = new ArrayList<>();

        for (String value : locationArray) {
            coordinates.add(Integer.parseInt(value));
        }

        return coordinates;
    }
}
