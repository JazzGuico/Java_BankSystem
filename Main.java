package Bank;

public class Main {
    public static void main(String[] args) {
        // user Jazz
        BankAccount myBankAccount = new BankAccount("Jazz");
        // deposit
        myBankAccount.deposit(100);
        System.out.println("User: " + myBankAccount.getAccountHolder() + " deposited an amount of: " + myBankAccount.getBalance());
        // withdraw
        myBankAccount.withdraw(50);
        System.out.println("User: " + myBankAccount.getAccountHolder() + " balance after withdrawal: " + myBankAccount.getBalance());

        // user Ysabell
        BankAccount myOtherBankAccount = new BankAccount("Ysabell");
        // deposit
        myOtherBankAccount.deposit(100);
        System.out.println("User: " + myOtherBankAccount.getAccountHolder() + " deposited an amount of: " + myOtherBankAccount.getBalance());
        // withdraw

        boolean success = myOtherBankAccount.withdraw(200); // "success" is a local variable, usable only in this method. 
        if (!success) {
            System.out.println("Withdrawal denied: Insufficient funds");
        } else {
            System.out.println("Withdrawal successful.");
        }
        System.out.println("User: " + myOtherBankAccount.getAccountHolder() + " balance after withdrawal: " + myOtherBankAccount.getBalance());
    }
}
