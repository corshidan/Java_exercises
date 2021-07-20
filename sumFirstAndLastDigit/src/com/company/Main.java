package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(344));
    }
    public static int sumFirstAndLastDigit (int number) {
        int reverse=0;
        int newNumber= number;

        if (number < 0){
            return -1;
        }
        while (newNumber>0) {
            int digit = newNumber % 10;
            reverse *= 10;
            reverse += digit;
            newNumber = newNumber / 10;

        }
        int lastDigit = number % 10;
        int firstDigit = reverse % 10;
        int sum = lastDigit + firstDigit;
        return sum;

    }
}
