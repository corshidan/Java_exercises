package com.company;

public class BankAccount {

    private String accountNumber;
    private int balance = 0;
    private String customerName ;
    private String email;
    private String phoneNumber;

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber (){
        return this.accountNumber;
    }


    public void setBalance (int balance) {
        this.balance = balance;
    }
    public int getBalance () {
        return this.balance;
    }


    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName () {
        return this.customerName;
    }


    public void setEmail (String email) {
        this.email = email;
    }
    public String getEmail () {
        return this.email;
    }


    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    public void depositFunds (int funds) {
        this.balance += funds;
    }
    public void withdrawFunds (int funds) {
        if (this.balance >= funds) {
            this.balance -= funds;
        }

    }
}
