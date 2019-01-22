package com.timbuchalka;

public class Account {

    private int accountNumber;
    private Double accountBalance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    /** Empty constructor will call the constructor with all the field values
     * to set each with the default. */
    public Account() {
        this(9999, 00.00,
                "Default Name", "Default email",
                0123456);
        System.out.println("empty constructor called default values set.");
    }

    /** constructor with all field values, called by the empty constructor */
    public Account(int accountNumber, Double accountBalance, String customerName,
                   String customerEmail, int customerPhoneNumber) {
        System.out.println("constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;

        System.out.println("values are set with the values passed in;");
        System.out.println("or the defaults if the parameters values were empty.");
    }

    public Account(int accountNumber, Double accountBalance) {
        System.out.println("constructor called with accountNumber and accountBalance");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        System.out.println("accountNumber " + this.getAccountNumber());
        System.out.println("accountBalance " + this.getAccountBalance());
    }

    public Account(String customerName, String customerEmail, int customerPhoneNumber) {
        this(12345, 100.00);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("constructor called with customerName, customerEmail, customerPhoneNumber");
        System.out.println("customerName " + this.getCustomerName());
        System.out.println("customerEmail " + this.getCustomerEmail());
        System.out.println("customerPhoneNumber " + this.getCustomerPhoneNumber());

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCoustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCoustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
