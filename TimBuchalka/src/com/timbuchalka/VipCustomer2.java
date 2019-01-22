package com.timbuchalka;

public class VipCustomer2 {

    public String name;
    public Double creditLimit;
    public String customerEmail;

    public VipCustomer2() {
        this("default name", 50000.00, "default@email.com");
    }

    public VipCustomer2(String name, Double creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    public VipCustomer2(String name, Double creditLimit, String customerEmail) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
