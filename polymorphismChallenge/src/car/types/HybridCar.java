package car.types;

import car.Car;

public class HybridCar extends Car {

    private int batterySize;
    private double avgKmPerCharge;
    private int cylinders;

    public HybridCar(String description) {
        this(description, 100, 70, 4);

    }

    public HybridCar(String description, int batterySize, double avgKmPerCharge, int cylinders) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving: HybridCar");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Running HybridCar Engine");
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Straring HybridCar Engine");
    }

    @Override
    public String toString() {
        return "HybridCar [batterySize=" + batterySize + ", avgKmPerCharge=" + avgKmPerCharge + ", cylinders="
                + cylinders + "]" + super.toString();
    }

}
