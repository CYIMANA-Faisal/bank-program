package com.faisal;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void printChoice(){
        System.out.println("=========================");
        System.out.println("Type\n1. To deposit\n2. To check balance\n3. To withdraw\n4. To check previous transaction\n5. To exit the program");
        System.out.println("=========================");
        System.out.println("What is your choice? ");
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
        }
    }

    public static void main(String[] args) {
        System.out.println("####################\n\nWELCOME TO THE CMU BANK\n\n####################");
        String names;
        String phone;
        String email;
        Scanner ioObject = new Scanner(System.in);
        System.out.println("Enter your name please!");
        names=ioObject.nextLine();
        System.out.println("Enter your phone number:");
        phone=ioObject.nextLine();
        System.out.println("Enter your email:");
        email=ioObject.nextLine();
        Client client1=new Client(names,phone,email);
        do {
            printChoice();
            int choice = ioObject.nextInt();
            switch (choice) {
                case 1 -> client1.deposit();
                case 2 -> client1.printBalance();
                case 3 -> client1.withdraw();
                case 4 -> client1.printTransaction();
                case 5 -> exitApp();
                default -> System.out.println("Invalid choice");
            }
        } while (true);
    }
}
