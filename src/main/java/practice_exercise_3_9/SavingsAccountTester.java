
package practice_exercise_3_9;

public class SavingsAccountTester {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000, 10);
        account.addInterest();
        double balAfterInterest = 1000 * (10 + 1 / 100.0);
        System.out.println("Balance after interest: " + account.getBal());
        System.out.println("Expected balance: 1100.0");
    }
}