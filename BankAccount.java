package Bank;

public class BankAccount {
    // my  instance variable (located in heap memory. usable only by the methods in this class)
    private String accountHolder;
    private double balance;

    // my constructor 
    public BankAccount(String accountHolder) {
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
        throw new IllegalArgumentException("Account holder name cannot be null or empty.");
    }
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    // my methods
    // deposit method to add money to the account. returns true if deposit is successful, false otherwise
    public boolean deposit(double amount) {
        if (amount <= 0) { //ensures that every deposit amount is a positive number
            return false;
        } else {
            this.balance += amount;
            return true;
        }
    }

    // withdraw method to remove money from the account. returns true if withdrawal is successful, false otherwise
    public boolean withdraw(double amount) {
    if (amount <= 0 ) { //ensures that every withdrawal amount is a positive number
        return false; // withdrawal denied
    } else if (amount > this.balance){ // ensures that the withdrawal amount does not exceed the current balance
        return false;
    }
    this.balance -= amount;
    return true; // withdrawal succeeded. amount is deducted from balance
    }

    // method to return the values from methods (balance)
    public double getBalance() {
        return this.balance;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }
}
