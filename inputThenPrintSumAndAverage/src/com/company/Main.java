package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int sum =0 ;
        int avg =0 ;
        int count= 0;

        boolean first = true;

        while (true) {

            System.out.println("Enter number #" + (count+1) );

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int numberEntered = scanner.nextInt();
                count++;
                sum += numberEntered;
                avg = sum / count;
                System.out.println(sum);


            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = "+ sum + " AVG = " + avg);
    }
}
