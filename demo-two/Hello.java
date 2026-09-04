public class Hello {
    public static void main(String[] args){
        System.out.print("Hello World");

        int myFirstNumber = 5;

        System.out.print("\n");

        System.out.print(myFirstNumber);

        System.out.print("\n");

        int myFirstAddition = myFirstNumber + 10;

        System.out.print(myFirstAddition);

        System.out.print("\n");

        double pounds = 204;
        double conversion = 0.45359237;
        double poundsKgConversion = pounds * conversion;

        System.out.print(poundsKgConversion);
        System.out.print("\n");

        Boolean isTrue = true;
        Boolean isFalse = false;

        System.out.print("Is true or false: " + isFalse + "/" + isTrue);

        System.out.print("\n");

        String myString = "Some odd string.";
        System.out.print(myString);
        System.out.print("\n");
        String myOtherString = "Some other string.";
        System.out.print(myOtherString);
        System.out.print("\n");
        System.out.print(myString + " " + myOtherString);
        System.out.print("\n");

    }
}

