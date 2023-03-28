package practice_exercise_3_9;

public class SavingsAccount {

    private double bal;
    private double intRate;

    public SavingsAccount(double startingBalance, double intRate) {
        bal = startingBalance;
        this.intRate = intRate;
    }

    public double getBalance() {
        return bal;
    }

    public void addInterest() {
        double interest = bal * intRate / 100;
        bal += interest;
    }

}