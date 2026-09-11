package com.array;

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] newArray = getRandomArray(10);
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));


        int[] newArray2 = getRandomArray(10);
        System.out.println(Arrays.toString(newArray2));
        Arrays.fill(newArray2, 10);
        System.out.println(Arrays.toString(newArray2));

        int[] newArray3 = Arrays.copyOf(newArray2, newArray2.length);
        System.out.println(Arrays.toString(newArray3));

        int[] searchArray = getRandomArray(100);
        // System.out.println(Arrays.toString(searchArray));
        Arrays.sort(searchArray);
        // System.out.println(Arrays.toString(searchArray));
        if (Arrays.binarySearch(searchArray, 20) >= 0){
            System.out.println("Found the number");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equals");
        }
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i<len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}