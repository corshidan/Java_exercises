package com.company;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        int count=0;

        for (int i=1; i<100; i++){
	    if(i%3==0 && i%5==0){

            sum = sum + i;
            count++;

            System.out.println("The number divided by both 3 and 5 is "+ i);
        }
	    if (count==5){
	        break;

        }
	}
        System.out.println("The sum of numbers divisible by both 3 and 5 is " + sum );
    }
}
