package com.timbuchalka;

public class VipCustomer {

    public String name;
    public Double creditLimit;
    public String customerEmailAddress;

    /** empty constructor that calls the one with the fields
     * and sets them to the default. */
    public VipCustomer() {
        this("Default Name", 500.00, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmailAddress = "default@eamil.com";
    }

    public VipCustomer(String name, double creditLimit, String email) {
        System.out.println("either the empty constructor or the full one was called..");
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmailAddress = email;

    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
}
