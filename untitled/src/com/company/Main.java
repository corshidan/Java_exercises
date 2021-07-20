package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int min =0 ;
        int max =0 ;
        int count=1;

        boolean first = true;

        while (true) {

            System.out.println("Enter number #" + count );

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int numberEntered = scanner.nextInt();
                count++;
                if (first){
                    first = false;
                    min=numberEntered;
                    max=numberEntered;
                }
                if (numberEntered<min){
                    min = numberEntered;
                } else if (numberEntered>max){
                    max = numberEntered;
                }
            } else {
                    break;
            }
            scanner.nextLine();
        }
        System.out.println("The min is "+ min + " and the max is " + max + ".");
    }
}
