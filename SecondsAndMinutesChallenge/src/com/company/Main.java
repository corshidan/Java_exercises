package com.company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        String result = getDurationString(200 , 5);
        System.out.println(result);
 //       System.out.println(getDurationString(500));

    }

    public static String getDurationString (int minutes , int seconds){
        if ((minutes<0) || (seconds<0) || (seconds >59)) {
           return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0"+ hoursString;
        }
        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0"+ minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0"+ secondsString;
        }
        return (hoursString + " " + minutesString + " "+ secondsString + " ");

    }
    public static String getDurationString (int seconds){
        if (seconds < 0){

            System.out.println("Invalid Value");
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes,seconds);
    }

}
