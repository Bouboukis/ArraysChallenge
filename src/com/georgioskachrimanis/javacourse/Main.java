package com.georgioskachrimanis.javacourse;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] intArray = SortedArray.getIntegers(5);

        System.out.println("*****************************");
        System.out.println("You have entered these values:");
        SortedArray.printArray(intArray);
        System.out.println("*****************************");
        System.out.println("The Sorted array is: ");
        SortedArray.printArray(SortedArray.sortIntegers(intArray));
    }


}

