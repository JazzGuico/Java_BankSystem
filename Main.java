package Bnk;

public class Main {
    public static void main(String[] args) {
        // user Jazz
        Account myBankAccount = new Account("Jazz");
        myBankAccount.deposit(100);
        System.out.println("User: " + myBankAccount.getAccountHolder() + " deposited an amount of: " + myBankAccount.getBalance());
        myBankAccount.withdraw(50);
        System.out.println("User: " + myBankAccount.getAccountHolder() + " balance after withdrawal: " + myBankAccount.getBalance());

        // user Ysabell
        Account myOtherBankAccount = new Account("Ysabell");
        myOtherBankAccount.deposit(100);
        System.out.println("User: " + myOtherBankAccount.getAccountHolder() +" deposited an amount of: " + myOtherBankAccount.getBalance());
        myOtherBankAccount.withdraw(200);
        System.out.println("User: " + myOtherBankAccount.getAccountHolder() +" balance after withdrawal: " + myOtherBankAccount.getBalance());

        Account acc = new SavingsAccount("Jazz", 0.05);
        acc.deposit(100);        // works — inherited from Account
        System.out.println(acc.getBalance());
    }
}