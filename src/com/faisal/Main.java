package com.faisal;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static Scanner ioObject = new Scanner(System.in);
    public static String accountHolder = "";
    public static double amount = 0;
    public static String userPassword="";
    public static int accountNumber;
    public static String previousTransactions;

    public static void createAccount(){

        System.out.println("Enter your name to create account: ");
        accountHolder = ioObject.nextLine();
        accountNumber = (int)((Math.random() * 100000) + 20);
        System.out.println("Enter the password you want to use: ");
        userPassword=ioObject.nextLine();
        System.out.println("Hello " + accountHolder + "\nYour account number is: " + Integer.toString(accountNumber));
        System.out.println("-------------------------");
    }
    public  static boolean validateUser(){

        System.out.println("Enter your password: ");
       String password=new Scanner(System.in).nextLine();
     if(!password.equals(userPassword)){
         System.out.println("Invalid password!");
         return false;
     }
     return true;
    }


    public static void withdraw(){

        System.out.println("How much do you want to withdraw? ");
        double amountToWithdraw = ioObject.nextDouble();
        if(amount < amountToWithdraw){
            System.out.println("Ohhhh sorry you have insufficient funds");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
        }else{
            amount = amount - amountToWithdraw;
            previousTransaction("withdrew: " + Double.toString(amountToWithdraw));
            System.out.println("Successfully withdrew: " + Double.toString(amountToWithdraw) + "from account number:" + Integer.toString(accountNumber));
            System.out.println("-------------------------");
        }
    }

    public static void printChoice(){
        System.out.println("=========================");
        System.out.println("Type\n1. To deposit\n2. To check balance\n3. To withdraw\n4. To check previous transaction\n5. To exit the program");
        System.out.println("=========================");
        System.out.println("What is your choice? ");
    }

    public static void deposit(){

        System.out.println("How much do you want to deposit? ");
        double amountToDeposit = ioObject.nextDouble();
        amount+=amountToDeposit;
        previousTransaction("Deposit: "+amountToDeposit);
        System.out.println("You have successfully deposited "+amountToDeposit + " to account number: " + Integer.toString(accountNumber) + "\nNow your new balance is :"+checkBalance());
        System.out.println("-------------------------");
    }

    static void printTransaction(){

        System.out.println("The previous transaction was " + previousTransactions);
        System.out.println("-------------------------");
    }
    public static void previousTransaction(String previousTransaction){
        previousTransactions=previousTransaction;
    }
    private static double checkBalance() {
        return amount;
    }

    public static void exitApp(){
        System.out.println("Are you sure you want to exit app? type Y to exit or N to deny ");
        Scanner input =new Scanner(System.in);
        String answer= input.next();
        switch (answer){
            case "Y":
            case "y":
                System.out.println("Exiting.....");
                System.exit(1);
            case "N":
            case "n":
                return;
            default:
                System.out.println("Invalid input");
                return;
        }
    }

    public static void main(String[] args) {
        System.out.println("####################\n\nWELCOME TO THE CMU BANK\n\n####################");
        createAccount();
        while(true){
            printChoice();
            int choice = ioObject.nextInt();
            switch (choice){
                case 1:
                    if(! validateUser())
                        break;
                    deposit();
                    break;
                case 2:
                    if(! validateUser())
                        break;
                    System.out.println("Your balance is: " + Double.toString(checkBalance()));
                    break;
                case 3:
                    if(! validateUser())
                        break;
                    withdraw();
                    break;
                case 4:
                    if(! validateUser())
                        break;
                    printTransaction();
                    break;
                case 5:
                    exitApp();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
