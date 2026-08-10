package Bank;

public class LoanAccount implements Statementable {
    private String borrowerName;
    private double loanBalance; // amount still owed

    public LoanAccount(String borrowerName, double loanBalance) {
        // your constructor logic — validate similarly to BankAccount's constructor
        if (borrowerName == null || borrowerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Borrower name cannot be null or empty.");
        }
        if (loanBalance < 0) {
            throw new IllegalArgumentException("Loan balance cannot be negative.");
        }
        this.borrowerName = borrowerName;
        this.loanBalance = loanBalance;
    }

    public boolean makePayment(double amount) {
        // reduces loanBalance, with sensible validation
        // (amount must be positive, can't overpay past 0)
        if (amount <= 0) {
            return false; // payment denied
        } else if (amount > this.loanBalance) {
            return false; // payment denied, can't overpay
        }
        this.loanBalance -= amount; // payment succeeded
        return true;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    @Override
    public String generateStatement() {
        // unrelated to BankAccount's
        return "Borrower: " + this.borrowerName + ", Loan Balance: " + this.loanBalance;   // generates a statement for the loan account
    }
}
