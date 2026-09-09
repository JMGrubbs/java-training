package com.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        BankAccount account1 = new BankAccount();

        double amount = 100000;
        double amount_due = 49999;

        account1.getAccount_balance();
        System.out.println("Current Account Balance: " +  account1.getAccount_balance());

        account1.deposite(amount);
        System.out.println("New Account Balance: " +  account1.getAccount_balance());
        account1.withdraw(amount_due);
        System.out.println("New Account Balance After Payment: " +  account1.getAccount_balance());

        BankAccount account2 = new BankAccount(102312, 10000, "Joe Shmoe", "joe@gmail.com", "(913) 912-3463");

        account2.getAccountInfo();
    }
}
