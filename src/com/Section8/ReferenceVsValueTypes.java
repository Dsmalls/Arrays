package com.Section8;

import java.util.Arrays;

public class ReferenceVsValueTypes {
    //Value type stores the value in its memory space, whereas reference type stores the address of the value
    // where it is stored. Primitive data types and struct are of the 'Value' type. Class objects, string, array,
    // delegates are reference types.

    public static void main(String[]args){
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);
        System.out.println("==========================================");

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);
        System.out.println("==========================================");

        int[] myIntArray = new int[5];// reference type example
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("==================================================");

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("===================================================");

        anotherArray = new int[] {4,5,6,7,8,};
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){

        array[0] = 2;
        array = new int[]{1,2,3,4,5};
    }
}
