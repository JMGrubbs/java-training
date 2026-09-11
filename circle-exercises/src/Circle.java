public class Circle {
    private double radius;


    public Circle() {
        this(0);
    }


    public Circle(double radius) {
        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    public void getRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    public double getArea(){
        Double area = (this.radius * this.radius * Math.PI);
        return area;
    }
}
