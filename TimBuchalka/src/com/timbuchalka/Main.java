package com.timbuchalka;

public class Main {

    public static void main(String[] args) {


        /**
         * This section uses the bank.java class
         * dont get confused if you see a bank_main.java
         * it has similar functionality but also has a main
         * built in so it can be run on its own.
         */
//        Bank myBank = new Bank();
//        System.out.println("first deposit 50");
//        myBank.deposit(50);
//        System.out.println("Now we will withdraw 25");
//        myBank.withdraw(25);
//        System.out.println("Then withdraw 100");
//        myBank.withdraw(100);


        /**
         *
         * This section of the code is dealing with constructors
         * and how they create an object. A default empty constructor exists in the Account.java
         * class. If called it will call the default constructor with the notation
         * this(<set values>) which calls the other constructor setting the default parameters.
         */
//        Account myAccount = new Account("Jonathan Dale",
//                "jonathan@email.com", 1234567);
//        System.out.println("myAccount created");
//        System.out.println("myAccount fields are: ");
//        System.out.println("customerName " + myAccount.getCustomerName());
//        System.out.println("customerPhoneNumber " + myAccount.getCustomerPhoneNumber());
//        System.out.println("customerEmail " + myAccount.getCustomerEmail());
//        System.out.println("customerBalance " + myAccount.getAccountBalance());
//        System.out.println("accoutnNumber " + myAccount.getAccountNumber());
//
//        System.out.println();
//        System.out.println("creating Account newAccount no field values now.....");
//        Account newAccount = new Account();
//        System.out.println("Account newAccount created......");
//        System.out.println("newAccount name " + newAccount.getCustomerName());
//        System.out.println("newAccount email " + newAccount.getCustomerEmail());
//        System.out.println("newAccount phoneNumber " + newAccount.getCustomerPhoneNumber());
//        System.out.println("newAccount balance " + newAccount.getAccountBalance());
//        System.out.println("newAccount accountNumber " + newAccount.getAccountNumber());

        /**
         * This section of the code is doing the same with constructors where
         * having an empty one can call the default and set the field values.
         */
//        System.out.println("Creating an empty VIPCustomer object now.......");
//        VipCustomer vp = new VipCustomer();
//        System.out.println("created the empty VIPCustomer object........");
//
//        System.out.println("now creating a new VipCustomer with only two values....");
//        VipCustomer vp2 = new VipCustomer("Jonathan Dale", 500.00);
//        System.out.println("vp2 name " + vp2.getName());
//        System.out.println("vp2 credit limit " + vp2.getCreditLimit());
//        System.out.println("vp2 email " + vp2.getCustomerEmailAddress());

        /**
         * This section of the code was to learn how to get intellij to create
         * constructors and getters so typing all of that was not necessary
         */
//        VipCustomer2 vp2 = new VipCustomer2();
//        System.out.println("name: " + vp2.getName());
//        System.out.println("credit limit: " + vp2.getCreditLimit());
//        System.out.println("email: " + vp2.customerEmail);

    }
}
