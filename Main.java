package Bank;

public class Main {
    public static void main(String[] args) {
        // user Jazz
        BankAccount myBankAccount = new BankAccount("Jazz");
        // deposit
        boolean check = myBankAccount.deposit(100);
        if (!check) {
            System.out.println("Deposit failed.");
        } else {
            System.out.println("Deposit succeeded.");
        }

        System.out.println("User: " + myBankAccount.getAccountHolder() + " deposited an amount of: " + myBankAccount.getBalance());

        // withdraw
        boolean success = myBankAccount.withdraw(50);
        if (!success) {
            System.out.println("Withdrawal denied: Insufficient funds");
        } else {
            System.out.println("Withdrawal successful.");
        }
        System.out.println("User: " + myBankAccount.getAccountHolder() + " balance after withdrawal: " + myBankAccount.getBalance());



        // user Ysabell
        BankAccount myOtherBankAccount = new BankAccount("Ysabell");
        // deposit
        myOtherBankAccount.deposit(100);
        if (!check) {
            System.out.println("Deposit failed.");
        } else {
            System.out.println("Deposit succeeded.");
        }
        System.out.println("User: " + myOtherBankAccount.getAccountHolder() + " deposited an amount of: " + myOtherBankAccount.getBalance());

        // withdraw
        success = myOtherBankAccount.withdraw(-200); 
        if (!success) {
            System.out.println("Withdrawal denied: Insufficient funds");
        } else {
            System.out.println("Withdrawal successful.");
        }
        System.out.println("User: " + myOtherBankAccount.getAccountHolder() + " balance after withdrawal: " + myOtherBankAccount.getBalance());
    }
}
