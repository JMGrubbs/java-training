package car.types;

import car.Car;

public class ElectricCar extends Car {
    private int batterySize;
    private double avgKmPerCharge;

    public ElectricCar() {
        super();
    }

    public ElectricCar(String description) {
        super(description);
    }

}
