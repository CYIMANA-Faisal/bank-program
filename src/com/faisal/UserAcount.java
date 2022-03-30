package com.faisal;

import java.util.Scanner;

public class UserAcount {
    private int accountNumber;
    private String previousTransactions;
    private String userPassword;
    public  Scanner ioObject = new Scanner(System.in);

    public UserAcount( String userPassword) {
        this.createAccount();
        this.userPassword = userPassword;
    }
    public void createAccount(){
        System.out.println("Enter your name to create account: ");
     String   accountHolder = ioObject.nextLine();
        accountNumber = (int)((Math.random() * 100000) + 20);
        this.accountNumber = accountNumber;
        System.out.println("Enter the password you want to use: ");
        userPassword=ioObject.nextLine();
        System.out.println("Hello " + accountHolder + "\nYour account number is: " + Integer.toString(accountNumber));
        System.out.println("-------------------------");
    }

//    public UserAcount() {
//
//    }
}