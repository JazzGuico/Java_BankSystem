package Bank;

public class BusinessAccount extends BankAccount {

    private double flatFee;

    public BusinessAccount(String accountHolder, double flatFee) {
        super(accountHolder);
        this.flatFee = flatFee;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) { // ensures that every withdrawal amount is a positive number
            return false; // withdrawal denied
        } else if (amount + flatFee > this.balance) { // ensures that the withdrawal amount plus the flat fee does not exceed the current balance
            return false; // withdrawal denied
        }
        this.balance -= (amount + flatFee);
        return true; // withdrawal succeeded
    }
}
