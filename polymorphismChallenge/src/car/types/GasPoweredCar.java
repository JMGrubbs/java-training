package car.types;

import car.Car;

public class GasPoweredCar extends Car {
    private int cylinders;
    private double avgKmPerLitre;


    public GasPoweredCar(String description) {
        this(description, 8, 80);
    }

    public GasPoweredCar(String description, int cylinders, double avgKmPerLitre) {
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public String toString() {
        return "GasPoweredCar [cylinders=" + cylinders + ", avgKmPerLitre=" + avgKmPerLitre + "]" + super.toString();
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving: GasPoweredCar");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Running GasPoweredCar Engine");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Starting GasPoweredCar");
    }
}
