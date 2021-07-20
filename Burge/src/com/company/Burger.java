package com.company;

public class Burger {
    private String breadType ;
    private String meatType ;
    private int numberOfAdditions;
    private int price;
    private String additions=":";
    private String name;

    public Burger(String breadType, String meatType, int price, String name) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
        this.name = name;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAdditions(String additions) {
        this.additions = additions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getNumberOfAdditions() {
        return numberOfAdditions;
    }

    public int getPrice() {
        return price;
    }

    public String getAdditions() {
        return additions;
    }

    public String getName() {
        return name;
    }

    public void addLetuce () {
        this.numberOfAdditions++;
        this.price += 2;
        this.additions = this.additions+ " Lettuce";
    }
    public void addTomato () {
        this.numberOfAdditions++;
        this.price += 2;
        this.additions = this.additions+ " Tomato";
    }
    public void addCarrot () {
        this.numberOfAdditions++;
        this.price += 2;
        this.additions = this.additions+ " Carrots";
    }
    public void addOlives () {
        this.numberOfAdditions++;
        this.price += 2;
        this.additions = this.additions+ " Olives";
    }

}
