package game.adventure.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private String name;
    private String currentLocation;
    private int visionRange;
    private int money;
    private int power;
    private int maxHealth;
    private int currentHealth;
    private int maxEnergy;
    private int currentEnergy;

    public Player(String name, String currentLocation){
        this.name = name;
        this.currentLocation = currentLocation;
        this.maxHealth = 100;
        this.currentHealth = this.maxHealth;
        this.maxEnergy = 20;
        this.currentEnergy = this.maxEnergy;
        this.visionRange = 5;
        this.money = 0;
    }

    public String getCurrentLocationKey() {
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

    public void addMoney(){
        int newMoney = random.nextInt(5);
        this.addMoney(newMoney);
    }

    public void addMoney(int newMoney){
        this.money += newMoney;
    }

    public void getPlayerStats(){
        System.out.print(" | Player: "+ this.getName());
        System.out.print(" | Health: "+ this.getCurrentHealth());
        System.out.print(" | Power: "+this.getPower());
        System.out.print(" | Gold: "+this.getMoney());
        System.out.print(" | Energy: "+this.getCurrentEnergy());
    }

    // -----------------------------getters and setters--------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisionRange() {
        return visionRange;
    }

    public void setVisionRange(int visionRange) {
        this.visionRange = visionRange;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public void setCurrentEnergy(int currentEnergy) {
        this.currentEnergy = currentEnergy;
    }
}

