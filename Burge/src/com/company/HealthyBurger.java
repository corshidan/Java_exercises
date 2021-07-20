package com.company;

public class HealthyBurger extends Burger {
    public HealthyBurger(String meatType, int price, String name) {
        super("Brown Rye", meatType, price, name);
    }
    public void addCorn () {
        setPrice(getPrice()+2);
        setAdditions(getAdditions()+" Corn");

    }

}
