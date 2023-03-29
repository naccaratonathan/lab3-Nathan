package programming_project_3_13;

import practice_exercise_3_9.SavingsAccount;

public class BankAccountTester {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000, 10);
        account.deposit(1000);
        account.withdraw(1000);
        System.out.println("Expected: 980.0");
        System.out.println(account.getBalance());

    }
}

