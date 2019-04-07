package com.Section8;

import java.util.Scanner;

public class MinElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);

    }

    private static int[] readIntegers(int count){

        int[] array = new int[count];

        for (int j = 0; j<array.length; j++){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[j] = number;

        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int j = 0; j<array.length; j++){
            int value = array[j];

            if (value < min){
                min = value;
            }
        }

        return min;
    }
}
