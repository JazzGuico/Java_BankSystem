package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        try {
        BankAccount badAccount = new BankAccount(""); // this line will throw
        System.out.println("This line never runs"); // skipped because the line above threw
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an error: " + e.getMessage());
        }

        System.out.println("Program is still alive and continuing normally.");

        Map<String, BankAccount> accounts = new HashMap<>();
        accounts.put("Jazz", new BankAccount("Jazz"));
        accounts.put("Ysabell", new SavingsAccount("Ysabell", 0.02));
        accounts.put("Miguel", new BusinessAccount("Miguel", 5));

        BankAccount miguelAccount = accounts.get("Miguel"); // retrieves the BankAccount object associated with the key "Miguel" from the accounts map
        System.out.println(miguelAccount.getAccountHolder() + " balance: " + miguelAccount.getBalance()); // Output: Miguel balance: 0.0

        BankAccount jazzAccount = accounts.get("Jazz");
        jazzAccount.saveStatementToFile("jazz_statement.txt"); // saves the statement of Jazz's account to a file named "jazz_statement.txt"

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
