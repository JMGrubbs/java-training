public class App {
    public static void main(String[] args) throws Exception {
        Circle firstCircle = new Circle(12);

        System.out.println(firstCircle.getArea());

        Cylinder firstCylinder = new Cylinder(11, 5);
        System.out.println(firstCylinder.getVolume());

    }
}
