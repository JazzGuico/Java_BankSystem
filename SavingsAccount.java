package Bank;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    // constructor for SavingsAccount class
    public SavingsAccount(String accountHolder, double interestRate) { 
        super(accountHolder);
        this.interestRate = interestRate;
    }

    // method to apply interest to the savings account balance
    public void applyInterest() {
        double interestEarned = this.balance * this.interestRate;
        this.balance += interestEarned;
    }
}
