package training.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] numbers = SortedArray.getIntegers();
        // int[] numbers = {2, 1, 3, 8, 34, 5, 4, 10};
        System.out.println(Arrays.toString(numbers));

        int[] sortedInts = SortedArray.sortIntegers(numbers);

        SortedArray.printArray(sortedInts);
    }
}