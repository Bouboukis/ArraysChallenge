package com.georgioskachrimanis.javacourse;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] intArray = getIntegers(5);

        System.out.println("*****************************");
        System.out.println("You have entered these values:");
        printArray(intArray);
        System.out.println("*****************************");
        System.out.println("The Sorted array is: ");
        printArray(sortIntegers(intArray));
    }

    public static int[] getIntegers(int size) {
        int[] inputArray = new int[size];
        System.out.println("Please enter " + size + " integer values.\n");

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " of array is:" + array[i]);
        }

    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray;

        // You can use a for loop to do the coping for you, but with a little searching found this method.
        sortedArray = Arrays.copyOf(array, array.length);

        // Sorting algorithm, use for arrays up to 100 numbers after that bubble sorting is faster.
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i <sortedArray.length -1 ; i++) {
                if (sortedArray[i + 1] > sortedArray[i]){
                    temp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

}

