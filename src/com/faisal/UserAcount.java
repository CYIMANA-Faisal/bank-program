package com.faisal;

import java.util.Scanner;

public class UserAcount {
    private int accountNumber;

    private String userPassword;
    public  Scanner ioObject = new Scanner(System.in);
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public UserAcount(String userName) {
        this.createAccount(userName);
    }
    public void createAccount(String userName){
        accountNumber = (int)((Math.random() * 100000) + 20);
        System.out.println("Enter the password you want to use: ");
        userPassword=ioObject.nextLine();
        System.out.println("Hello " + userName + "\nYour account number is: " + accountNumber);
        System.out.println("-------------------------");
    }
    public  boolean validateUserAcount(){
        System.out.println("Enter your password: ");
        String password=new Scanner(System.in).nextLine();
        if(!password.equals(this.userPassword)){
            System.out.println("Invalid password!");
            return false;
        }
        return true;
    }


//    public UserAcount() {
//
//    }
}