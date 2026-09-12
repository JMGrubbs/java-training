package training.java;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(){

        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        System.out.println("Press 'Q' to quit.");
        int[] numbers = new int[0];
        while (keepGoing) {
            System.out.println("Current Numbers: " + Arrays.toString(numbers));
            System.out.print("Enter number: ");
            String number = scanner.nextLine();
            if (number.equals("q") || number.equals("Q")) {
                keepGoing = false;
                break;
            }

            try {
                if (!keepGoing) {
                    scanner.close();
                } else {
                    int intNumber = Integer.parseInt(number);
                    int[] newNumbers = new int[numbers.length + 1];
                    newNumbers[newNumbers.length - 1] = intNumber;
                    for(int i = 0; i < numbers.length; i++){
                        newNumbers[i] = numbers[i];
                    }
                    numbers = newNumbers;
                }
            } catch (Exception e) {
                System.out.println("Enter a valid input");
                System.out.println(e);
            }
            System.out.println("-------------------------------------");
        }
        return numbers;
    }

    public static int[] sortIntegers(int[] ints){
        for (int el : ints){
            for(int i = 1; i<ints.length; i++){
                int currentInt = ints[i];
                int prevoiusInt = ints[i-1];
                if (currentInt > prevoiusInt) {
                    ints[i-1] = currentInt;
                    ints[i] = prevoiusInt;
                }
            }
        }
        return ints;
    }

    public static void printArray(int[] ints){
        for (int i = 0; i < ints.length; i++){
            System.out.println("Element " + i + " contents " + ints[i] + " \n" + //
                                "");
        }
    }
}
