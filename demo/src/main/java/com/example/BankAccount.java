package com.example;

public class BankAccount {
    private int account_number;
    private double account_balance = 0;
    private String customer_name;
    private String email;
    private String phone_number;

    public BankAccount(){
        this(1232211, 10000.0, "John Smith", "john@gmail.com", "(713) 309-0612");
        System.out.println("New: " + this.account_number);
        System.out.println("New: " + this.account_balance);
        System.out.println("New: " + this.customer_name);
        System.out.println("New: " + this.email);
        System.out.println("New: " + this.phone_number);
    }

    public BankAccount(
        int account_number,
        double account_balance,
        String customer_name,
        String email,
        String phone_number)
    {
        this.account_number = account_number;
        this.account_balance = account_balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public BankAccount(

    ){

    }

    public int getAccount_number() {
        return this.account_number;
    }
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
    public double getAccount_balance() {
        return this.account_balance;
    }
    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }
    public String getCustomer_name() {
        return this.customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone_number() {
        return this.phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void getAccountInfo(){
        System.out.println("Customer Name: " + getCustomer_name());
        System.out.println("Account Number: " + getAccount_number());
    }

    public double deposite(double amount){
        double current_balance = this.getAccount_balance();
        double new_balance = (double) current_balance + amount;
        setAccount_balance(amount);
        return getAccount_balance();
    }

    public boolean withdraw(double amount) {
        double current_balance = getAccount_balance();
        if (amount > current_balance) {
            return false;
        } else {
            double new_balance = current_balance - amount;
            setAccount_balance(new_balance);
            return true;
        }
    }
}
