package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	    int[] array = {2,4,5,6,8};
//	    printArray(array);
        System.out.println(Arrays.toString(array));
	    reverseArray(array);
        System.out.println("******************");
//        printArray(array);
        System.out.println(Arrays.toString(array));


    }

    private static void reverseArray (int[] array) {
        for (int i=0; i<array.length/2;i++){
            int swap;
            swap = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = swap;
        }
    }
    private static void printArray (int[] array) {
        for (int i=0; i<array.length;i++){
            System.out.println("The array elements are " + array[i]);
        }
    }


}
