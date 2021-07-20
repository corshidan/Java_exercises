package com.company;

public class Main {

    public static void main(String[] args) {


        numberToWords(0);
        System.out.println(reverse(0));
        System.out.println(getDigitCount(-2));

    }


    public static void numberToWords (int number) {
        if (number==0){
            System.out.println("Zero");
        }
        if (number<0) {
            System.out.println("Invalid Value");
        }else {
        int diff = getDigitCount(number) - getDigitCount(reverse(number));

        number=reverse(number);
            while (number>0) {
            int digit = number % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            number /= 10;
            }
            for (int i=0 ; i<diff ; i++) {
                System.out.println("Zero");
            }



        }
    }

    public static int reverse (int number) {
        int reverse=0;
        int newNumber= number;

        if (number < 0) {
            newNumber = number * (-1);
        }


        while (newNumber>0) {
            int digit = newNumber % 10;
            reverse *= 10;
            reverse += digit;
            newNumber = newNumber / 10;

        }
        if (number<0) {
            return reverse*(-1);
        } else return reverse;
    }

    public static int getDigitCount (int number){
        int count=0;
        if (number < 0) {
            return -1;
        }
        if (number==0){
            return 1;
        }

        while (number>0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
