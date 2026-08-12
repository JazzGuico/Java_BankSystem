package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        BankAccount jazzAccount = new BankAccount("Jazz", emailService);
        jazzAccount.deposit(100);

        try {
        BankAccount badAccount = new BankAccount("", emailService); // this line will throw
        System.out.println("This line never runs"); // skipped because the line above threw
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an error: " + e.getMessage());
        }

        System.out.println("Program is still alive and continuing normally.");

        Map<String, BankAccount> accounts = new HashMap<>();
        accounts.put("Jazz", new BankAccount("Jazz", emailService));
        accounts.put("Ysabell", new SavingsAccount("Ysabell", 0.02, emailService));
        accounts.put("Miguel", new BusinessAccount("Miguel", 5, emailService));

        BankAccount miguelAccount = accounts.get("Miguel"); // retrieves the BankAccount object associated with the key "Miguel" from the accounts map
        System.out.println(miguelAccount.getAccountHolder() + " balance: " + miguelAccount.getBalance()); // Output: Miguel balance: 0.0


        // Demonstrating polymorphism with a list of Statementable accounts
        List<Statementable> statementAccounts = new ArrayList<>();
        statementAccounts.add(new BankAccount("Jazz", emailService));
        statementAccounts.add(new SavingsAccount("Ysabell", 0.02, emailService));
        statementAccounts.add(new BusinessAccount("Miguel", 5, emailService));
        statementAccounts.add(new LoanAccount("Alice", 1000));

        for (Statementable acc : statementAccounts) {
            System.out.println(acc.generateStatement());
        }
    }
}
