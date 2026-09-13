package game.adventure.game;

public class MapLocation {
    private String name;
    private int value;

    public MapLocation(){
        this("No name", 0);
    }

    public MapLocation(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
}
