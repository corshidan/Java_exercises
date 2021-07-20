
package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] mainArray = getArray(4);
        printArray(mainArray);
        mainArray = sortArray(mainArray);
        printArray(mainArray);

    }

    public static void printArray(int[] bullshit){
        System.out.println("The elements of the array are: ");
        for (int i=0;i<bullshit.length;i++){
            System.out.println("Element # " +i+ " is " + bullshit[i]);
        }
    }

    public static int[] getArray(int elements) {
        int[] firstArray = new int[elements];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Please input element #" + i);
            firstArray[i] = scan.nextInt();
        }
        return firstArray;
    }

    public static int[] sortArray (int[] a){
        int[] b = new int[a.length];

        for (int i=0; i<a.length;i++) {
            b[i] = a[i];
        }
        boolean flag=true;
        int temp;
        while(flag) {
            flag = false;
            for (int i=0;i<b.length-1;i++){
                System.out.println("comparing " + b[i] + " to " + b[i+1]);
                if(b[i]<b[i+1]){
                    System.out.println("because " + b[i] + " is smaller than " + b[i+1] + " we switch them ");
                    temp = b[i];
                    b[i] = b[i+1];
                    b[i+1] = temp;
                    flag=true;
                }
            }
        }
        return b;
    }
}

