package practice_exercise_3_9;

public class SavingsAccount {
    /**
     * Creates a instance variable for balance
     */
    private double bal;
    /**
     * creates a instance variable for interest rate
     */
    private double intRate;
    /**
     *
     */
    public SavingsAccount(double startingBalance, double intRate) {
        bal = startingBalance;
        this.intRate = intRate;
    }

    public double getBal() {
        return bal;
    }

    public void addInterest() {
        double interest = bal * intRate / 100;
        bal += interest;
    }

}