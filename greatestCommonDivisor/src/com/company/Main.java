package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010 ,10));
    }
    public static int getGreatestCommonDivisor (int num1 , int num2){
        if (num1<10 || num2<10) {
            return -1;
        }
        int min=0;
        int max=0;
        int divisor=0;

        if (num1<num2){
            min=num1;
            max=num2;
        }else {
            min=num2;
            max=num1;
        }

        for (int i=1 ; i<=min; i++){
            if (min%i>0) {
                continue;
            }
            if (max%i>0) {
                continue;
            }

            if (i>divisor){
                divisor=i;
            }
        } return divisor;
    }
    public static boolean isPerfectNumber (int number){
        if (number<1) {
            return false;
        }
        int perfect=0;

        for (int i=1; i<number ; i++) {
            if (number % i == 0){
                perfect += i;
            }
        }

    }
}
