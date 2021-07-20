package com.company;

public class Main {

    public static void main(String[] args) {
	int x =1 ;
	int y =2 ;
        System.out.println("before swap "+ x +" "+y);
	swap(x,y);
    }
    public static void swap(int a , int b){
        int tmp=a;
        a=b;
        b=tmp;
        System.out.println(a +" "+ b);
    }
}
