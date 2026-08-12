package Bank;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    // constructor for SavingsAccount class
    public SavingsAccount(String accountHolder, double interestRate, NotificationService notificationService) { 
        super(accountHolder, notificationService); // call to the superclass constructor
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
        this.interestRate = interestRate;
    }

    // method to apply interest to the savings account balance
    public void applyInterest() {
        double interestEarned = this.balance * this.interestRate;
        this.balance += interestEarned;
    }
}
