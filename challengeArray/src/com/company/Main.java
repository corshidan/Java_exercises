package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
    getArray(5);
    }

    public static int[] getArray (int elements){
        int[] firstArray = new int[elements]
        for (int i=0; i<firstArray.length;i++){
            System.out.println("Please input element #" + i);
            firstArray[i] = scan.nextInt();
        }

    }




}
