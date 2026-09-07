package oop;
public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Red";
    private int doors = 4;
    private boolean convertable = false;


    public void describeCar(){
        System.out.println(this.isConvertable());
        System.out.println(this.getModel());
        System.out.println(this.getMake());
        System.out.println(this.getDoors());
        System.out.println(this.getColor());

    }


    public String getMake() {
        return make;
    }


    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getDoors() {
        return doors;
    }


    public void setDoors(int doors) {
        this.doors = doors;
    }


    public boolean isConvertable() {
        return convertable;
    }


    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }


}
