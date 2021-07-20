package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real , double imaginary){
        this.real += real;
        this.imaginary += imaginary ;
    }
    public void add (ComplexNumber cnumber){
        this.real = this.real+cnumber.getReal();
        this.imaginary = this.imaginary+cnumber.getImaginary();
    }
    public void substract (double real , double imaginary){
        this.real = this.real-real;
        this.imaginary = this.imaginary-imaginary;
    }
    public void substract (ComplexNumber cnumber){
        this.real = this.real-cnumber.getReal();
        this.imaginary = this.imaginary-cnumber.getImaginary();
    }
}
