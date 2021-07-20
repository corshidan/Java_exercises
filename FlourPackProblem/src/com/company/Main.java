package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1 ,0 ,4));
    }
    public static boolean canPack (int bigCount,int smallCount,int goal){
        int sum = (bigCount*5) + smallCount;
        int bigCount1 = bigCount * 5;

        if (sum<goal){
            return false;
        }

        if (sum % goal > 0){
            return true;
        }else return false;

    }
}
