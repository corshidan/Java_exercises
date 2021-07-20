package com.company;

public class Main {

    public static void main(String[] args) {
       // double x = calcFeetAndInchesToCentimeters(10,10);
        System.out.println(calcFeetAndInchesToCentimeters(10,10));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    public static double calcFeetAndInchesToCentimeters (double feet , double inches){
        if (feet >= 0 && (inches >=0 && inches <=12)){
            double centimeters = ((feet*12)*2.54)+(inches*2.54);
            return centimeters;
        } return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches >= 0){
            double feet = (int) inches / 12;
            inches = (int) inches % 12;
            double centimeters = calcFeetAndInchesToCentimeters(feet,inches);
            return centimeters;
        }return -1;
    }
}
