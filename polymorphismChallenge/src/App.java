import car.*;

public class App {
    public static void main(String[] args) throws Exception {
        Car hybrid = Car.createCar("hybrid", "This is an HybridCar car.");

        System.out.println(hybrid);
        hybrid.startEngine();
        hybrid.drive();

        Car gas = Car.createCar("gas", "This is a GasPoweredCar car.");
        gas.startEngine();
        gas.drive();
    }
}
