package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int count;
        int minimulElement;
        System.out.println("How many values do you want your array to be ");
        count = scan.nextInt();
//        scan.nextLine();
        int[] array = readIntegers(count);
        minimulElement=findMin(array);
        System.out.println("The minimum element in the array you created is "+ minimulElement);
    }

    public static int findMin (int[] findHere){
        int min = findHere[0];
        for (int i=0; i<findHere.length;i++){
//            System.out.println(min + " and " +findHere[i]);
            if (min > findHere[i]){
                min = findHere[i];
            }
        }
        return min;
    }
    public static int[] readIntegers (int count){
        int[] array = new int[count];
        System.out.println("Please enter " + count + " elements.");
        for (int i=0; i<array.length;i++){
            array[i] = scan.nextInt();
        }
        return array;
    }
}
