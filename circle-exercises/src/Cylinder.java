public class Cylinder extends Circle {
    private double height;


    public Cylinder(double height) {
        this(0, height);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + "]";
    }

    public double getVolume() {
        System.out.println("height = " + this.getHeight());
        System.out.println("Radius = " + this.getRadius());
        System.out.println("Area = " + this.getArea());
        double volume = this.getHeight() * this.getArea();
        return volume;
    }

}
