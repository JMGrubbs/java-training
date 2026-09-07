public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        switchFunction(1);
        switchFunction(2);
        switchFunction(3);
        switchFunction(4);
        switchFunction(5);

        enhancedSwitchFunction(1);
        enhancedSwitchFunction(2);
        enhancedSwitchFunction(3);
        enhancedSwitchFunction(4);
        enhancedSwitchFunction(5);
    }

    public static void switchFunction(int value) {
        int switchValue = value;
        switch (switchValue) {
            case 1:
                System.out.println("Value was:" + switchValue);

                break;
            case 2: case 3:
                System.out.println("Nothing here");
                break;
            case 4:
                System.out.println("Value was:" + switchValue);

            default:
                System.out.println("No cases hit");
                break;
        }

    }

    public static void enhancedSwitchFunction(int value) {
        int switchValue = value;
        switch (switchValue) {
            case 1 -> System.out.println("Value was:" + switchValue);
            case 2, 3 -> System.out.println("Nothing here");
            case 4 -> System.out.println("Value was:" + switchValue);
            default -> System.out.println("No cases hit");
        }

    }
}
