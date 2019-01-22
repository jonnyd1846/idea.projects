package com.timbuchalka;

import java.util.Scanner;

public class Bank_main {
    public static void main(String[] args) {
        int count = 0;

        Bank b = new Bank();
        b.setAccountNumber(12345);
        b.setBalance(100.00);
        b.setEmail("dalej@google.com");
        b.setName("Jonathan Dale");
        b.setPhoneNumber(5555555);


        System.out.println("The account number is " + b.getAccountNumber());
        System.out.println("The balance is " + b.getBalance());
        System.out.printf("The email is %s\n", b.getEmail());
        System.out.printf("The Name on the account is %s\n", b.getName());
        System.out.println("The phone number is " + b.getPhoneNumber());
//        System.out.println("The current balance is: " + b.getBalance());
        System.out.println("Do you want to make a transaction?");
        System.out.println("Enter yes or no");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        while (a.equals("yes")) {
            /** this should be changed for ease of use maybe like enter number 1. or 2. like this
             * sout(" Enter 1 for yes");
             * sout(" Enter 2 for no");
             * int userInput = s.nextInt();
             *
             * and then check weather the user actually entered valid input
             */
            count++;
            //if (a.equals("yes")) {
            System.out.println("Withdraw or Deposit?");
            String input = s.next();

            if (input.equals("deposit")) {
                System.out.println("How much?");
                int amount = s.nextInt();
                System.out.println("The current balance is " + b.getBalance());
                b.deposit(amount);
                System.out.println("The new balance is " + b.getBalance());
            } else {
                if (input.equals("withdraw"))
                    System.out.println("How much?");
                int amount = s.nextInt();
                System.out.println("The current balance is " + b.getBalance());
                b.withdraw(amount);
                System.out.println("The new balance is " + b.getBalance());
            }
            System.out.println("Another transaction?");
            a = s.next();
        }
        System.out.println("The final account balance is: " + b.getBalance());
        System.out.println("Total transactions made today: " + count);
        //else System.exit(0);
    }
}

