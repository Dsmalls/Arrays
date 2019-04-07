package com.Section8;

import java.util.Scanner;

public class Main {
    // The array, which stores a fixed-size sequential collection of elements of the same type. An array is
    // used to store collection of data, but it is often more useful to think of an array as a collection of
    // variables of the same type.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int j=0; j<myIntegers.length; j++){
            System.out.println("Element " + j + ", typed value was " + myIntegers[j]);
        }

        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int j=0; j<values.length; j++){
            values[j] = scanner.nextInt();
        }

        return  values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int j=0; j<array.length; j++){
            sum += array[j];
        }

        return (double) sum / (double)array.length;
    }
}

// array examples below
//        int[] myIntArray = new int[25];
//        for (int i=0; i<myIntArray.length; i++){ // this is the best way instead of doing hard coding
//            myIntArray[i] = i*10;
//        }
//        for (int i=0; i<myIntArray.length; i++){
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }
//       myIntArray[5] = 50;
//
//        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
//        double[] myDoubleArray = new double[10];
//        System.out.println("=========================================");
//
//        System.out.println(myIntArray2[0]);
//        System.out.println(myIntArray2[5]);
//        System.out.println(myIntArray2[9]);