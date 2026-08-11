package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, BankAccount> accounts = new HashMap<>();
        accounts.put("Jazz", new BankAccount("Jazz"));
        accounts.put("Ysabell", new SavingsAccount("Ysabell", 0.02));
        accounts.put("Miguel", new BusinessAccount("Miguel", 5));

        BankAccount miguelAccount = accounts.get("Miguel"); // retrieves the BankAccount object associated with the key "Miguel" from the accounts map
        System.out.println(miguelAccount.getAccountHolder() + " balance: " + miguelAccount.getBalance()); // Output: Miguel balance: 0.0

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
