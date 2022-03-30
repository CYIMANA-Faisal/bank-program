package com.faisal;

public class Client extends UserAcount{
    String names;
    String phone;
    String email;
    double amountBalance;
    String previousTransactions;
    public Client(String names, String phone, String email) {
        super(names);
        amountBalance=0.0;
        this.names = names;
        this.phone = phone;
        this.email = email;
    }
    public String getPreviousTransactions() {
        return previousTransactions;
    }

    public void setPreviousTransactions(String previousTransactions) {
        this.previousTransactions = previousTransactions;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Client{" +
                "names='" + names + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public void withdraw(){
         if (validateUserAcount()) {
             System.out.println("How much do you want to withdraw? ");
             double amountToWithdraw = ioObject.nextDouble();
             if (amountBalance < amountToWithdraw) {
                 System.out.println("Ohhhh sorry you have insufficient funds");
                 System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
             } else {
                 amountBalance = amountBalance - amountToWithdraw;
                 setPreviousTransactions("withdrew: " + amountToWithdraw);
                 System.out.println("Successfully withdrew: " + amountToWithdraw + "from account number:" + getAccountNumber());
                 System.out.println("-------------------------");
             }
         }

    }
    public void deposit(){
        if(validateUserAcount()){
        System.out.println("How much do you want to deposit? ");
        double amountToDeposit = ioObject.nextDouble();
        amountBalance+=amountToDeposit;
        setPreviousTransactions("Deposit: "+amountToDeposit);
        System.out.println("You have successfully deposited "+amountToDeposit + " to account number: " + getAccountNumber() + "\nNow your new balance is :"+checkBalance());
        System.out.println("-------------------------");
         }

    }

    void printTransaction() {
        if (validateUserAcount()) {
            System.out.println("The previous transaction was " + getPreviousTransactions());
            System.out.println("-------------------------");
        }

    }
    public void printBalance(){
        if(validateUserAcount())
            System.out.println("Your balance is: "+checkBalance());
    }
    private double checkBalance() {
        return amountBalance;
    }
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
