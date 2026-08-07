package Bnk;

public class Account {
    // my variable
    protected String accountHolder;
    protected double balance;

    // my constructor
    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    // my method
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Attemp of Withdrawal denied: Insufficient funds.");
        }
        else {
            this.balance -= amount;
        }
    }

    // method to return the values from methods (balance)
    public double getBalance() {
        return this.balance;
    }

    // method to return the account or user 
    public String getAccountHolder() {
        return this.accountHolder;
    }
}
