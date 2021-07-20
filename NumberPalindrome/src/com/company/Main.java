package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome (int number) {
        int reverse=0;


        if (number < 0) {
            number = number * (-1);
        }
        int newNumber= number;
        while (newNumber>0) {
            int digit = newNumber % 10;
            reverse *= 10;
            reverse += digit;
            newNumber = newNumber / 10;

        }
        return number==reverse;
        }
}
