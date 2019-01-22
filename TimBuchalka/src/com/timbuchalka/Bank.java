package com.timbuchalka;

import java.util.Scanner;

public class Bank {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public Bank() {
        System.out.println("Empty constructor called");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        System.out.println("The current balance is $" + balance);
        balance = balance + amount;
        System.out.println("After the transaction your balance " +
                "will be $" + balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Transaction rejected!");
            System.out.println("The requested amount $" + amount + " is more than "
                    + "total balance available $" + balance);
            System.out.println("You can only request a withdraw amount of $" +
                    balance + " or less.....");
            System.out.println("Please change the amount requested.");

            System.exit(0);
        } else {
        balance = balance - amount;
        System.out.println("New balance is $" + balance);
        }
    }

/**    public void changeAmount() {
        System.out.println("Deposit or withdraw?");
        Scanner s = new Scanner(System.in);
        }
 **/

//    public static void main(String[] args) {
//        int count = 0;
//
//        Bank b = new Bank();
//        b.setAccountNumber(12345);
//        b.setBalance(100.00);
//        b.setEmail("dalej@google.com");
//        b.setName("Jonathan Dale");
//        b.setPhoneNumber(5555555);
//
//        System.out.println("The account number is " + b.getAccountNumber());
//        System.out.println("The balance is " + b.getBalance());
//        System.out.printf("The email is %s\n", b.getEmail());
//        System.out.printf("The Name on the account is %s\n", b.getName());
//        System.out.println("The phone number is " + b.getPhoneNumber());
//
//        System.out.println("The current balance is: " + b.getBalance());
//        System.out.println("Do you want to make a transaction?");
//        System.out.println("Enter yes or no");
//        Scanner s = new Scanner(System.in);
//        String a = s.nextLine();
//        while (a.equals("yes")) {
//            /** this should be changed for ease of use maybe like enter number 1. or 2. like this
//             * sout(" Enter 1 for yes");
//             * sout(" Enter 2 for no");
//             * int userInput = s.nextInt();
//             *
//             * and then check weather the user actually entered valid input
//             */
//            count++;
//            //if (a.equals("yes")) {
//            System.out.println("Withdraw or Deposit?");
//            String input = s.next();
//
//            if (input.equals("deposit")) {
//                System.out.println("How much?");
//                int amount = s.nextInt();
//                System.out.println("The current balance is " + b.getBalance());
//                b.deposit(amount);
//                System.out.println("The new balance is " + b.getBalance());
//            } else {
//                if (input.equals("withdraw"))
//                    System.out.println("How much?");
//                int amount = s.nextInt();
//                System.out.println("The current balance is " + b.getBalance());
//                b.withdraw(amount);
//                System.out.println("The new balance is " + b.getBalance());
//            }
//            System.out.println("Another transaction?");
//            a = s.next();
//        }
//        System.out.println("The final account balance is: " + b.getBalance());
//        System.out.println("Total transactions made today: " + count);
//        //else System.exit(0);
//    }
}
