public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double cm = (double) inMetricsToCm(2, 6);
        System.out.println("CM: " + cm);
    }

    public static double inMetricsToCm(int inches){

        double cm = inMetricsToCm(0, inches);

        return cm;
    }

    public static double inMetricsToCm(int feet, int inches){

        int inches_from_feet = feet * 12;
        inches = inches + inches_from_feet;

        double cm = inches * 2.54;

        return cm;
    }
}
