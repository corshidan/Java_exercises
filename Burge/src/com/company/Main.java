package com.company;

public class Main {

    public static void main(String[] args) {

//	Burger burger = new Burger("Italian","Chicken",10,"Tim");
//
//	burger.addCarrot();
//	burger.addLetuce();
//	    System.out.println(burger.getName() + "`s burger costs "+ burger.getPrice() + " and it has " + burger.getAdditions());

	HealthyBurger healthyBurger = new HealthyBurger("pork",15,"Bob");

	healthyBurger.addCorn();
	healthyBurger.addCarrot();
	healthyBurger.addOlives();
        System.out.println(healthyBurger.getAdditions()+"        "+healthyBurger.getPrice());



    }
}
