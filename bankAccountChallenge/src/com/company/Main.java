package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount oneBankAccount = new BankAccount();
//
//        oneBankAccount.setAccountNumber("666");
//        oneBankAccount.setBalance(1000);
//        oneBankAccount.setCustomerName("Dani");
//        System.out.println("Account number is " + oneBankAccount.getAccountNumber() + "; Balance is " + oneBankAccount.getBalance() + "; Customer name is " + oneBankAccount.getCustomerName());
//        oneBankAccount.depositFunds(300);
//        System.out.println("Balance=" + oneBankAccount.getBalance());
//        oneBankAccount.withdrawFunds(150);
//        System.out.println("Balance=" + oneBankAccount.getBalance());


        VipCustomer test = new VipCustomer();
        System.out.println("Customer name = " + test.getName());
        VipCustomer test2 = new VipCustomer("Bob",100.0);
        System.out.println("Customer name = " + test2.getName() + " E-mail = " + test2.getEmail());
        VipCustomer test3 = new VipCustomer("Dani" , 200.0, "dany@yahoo.com");
        System.out.println("Name " + test3.getName() + " Credit limit= " + test3.getCreditLimit() + " Email= " + test3.getEmail());


    }


}
