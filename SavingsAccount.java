package Bnk;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, double interestRate) {
        super(accountHolder);  // calls Account's constructor
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        this.balance += this.balance * this.interestRate;
    }
}
