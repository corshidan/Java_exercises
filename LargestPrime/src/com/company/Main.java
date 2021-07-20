package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime (int number) {
        int largestPrime=0;
        if (number<=1){
            return -1;
        }

        for (int i=2 ; i<=number ; i++){
            while (number%i==0) { //can only be a divisor of number if it is a prime,
                largestPrime = i; //largest is tested for re-assignment in every loop.
                number/=i; //move on to the next factor.
            }

        }return largestPrime;
    }
}

 /*   public static int getLargestPrime(int number) {
        int largestPrime = 0;

        if (number <= 0) {
            return -1;
        }else {

            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    if (isPrime(i)) {
                        largestPrime = i;
                    }
                }

            }
            return largestPrime;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 0) {
            return false;
        }

        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        } return true;

    }*/

