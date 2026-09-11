package car;

import car.types.ElectricCar;
import car.types.GasPoweredCar;
import car.types.HybridCar;

public class Car {
    private String description;

    public Car(){
        this("No description");

    }

    public Car(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }


    public void startEngine(){
        System.out.println("Starting!....");
        this.runEngine();

    }

    public void drive(){
        System.out.println("Driving!....");

    }

    protected void runEngine(){
        System.out.println("Running!....");

    }

    public static Car createCar(String carType, String description) {
        return switch (carType) {
            case "hybrid" -> new HybridCar(description, 90, 60, 6);
            case "electric" -> new ElectricCar(description);
            default -> new GasPoweredCar(description, 4, 60);
        };
    }

    @Override
    public String toString() {
        return "Car [description=" + description + "]";
    }

}
