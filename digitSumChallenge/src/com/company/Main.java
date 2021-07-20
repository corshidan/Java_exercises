package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of the digits is " + sumDigits(542) );
    }
    public static int sumDigits (int number){
        int sumOfDigits = 0;
        if (number<10) {
            return -1;
        }else {

            do {
                sumOfDigits = sumOfDigits + (number % 10);
                number /= 10;
            } while (number>0);
            return sumOfDigits;
        }
    }
}
