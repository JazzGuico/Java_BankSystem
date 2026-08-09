package Bank;

public class BankAccount {
    // my  instance variable (located in heap memory. usable only by the methods in this class)
    private String accountHolder;
    private double balance;

    // my constructor 
    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    // my method
    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
    if (amount > this.balance) {
        return false; // withdrawal denied
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
