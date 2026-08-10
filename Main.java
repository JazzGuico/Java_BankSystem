package Bank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("Jazz"));
        accounts.add(new SavingsAccount("Ysabell", 0.02));
        accounts.add(new BusinessAccount("Miguel", 5));

        for (BankAccount acc : accounts) {
            acc.deposit(100);
            boolean result = acc.withdraw(98); // pick an amount where the fee matters
            System.out.println(acc.getAccountHolder() + " withdrawal result: " + result + ", balance: " + acc.getBalance());
        }

        List<Statementable> statementAccounts = new ArrayList<>();
        statementAccounts.add(new BankAccount("Jazz"));
        statementAccounts.add(new SavingsAccount("Ysabell", 0.02));
        statementAccounts.add(new BusinessAccount("Miguel", 5));
        statementAccounts.add(new LoanAccount("Alice", 1000));

        for (Statementable acc : statementAccounts) {
            System.out.println(acc.generateStatement());
        }
    }
}
