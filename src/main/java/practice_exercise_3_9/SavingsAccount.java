package practice_exercise_3_9;

public class SavingsAccount {
    /**
     * Creates an instance variable for balance.
     */
    private double bal;
    /**
     * creates an instance variable for interest rate.
     */
    private double intRate;
    /**
     Constructs a bank account with a given balance.
     @param startingBalance is the initial balance given in the savings account.
     @param intRate is the interest rate.
     */
    public SavingsAccount(double startingBalance, double intRate) {
        bal = startingBalance;
        this.intRate = intRate;
    }
    /**
     Gets the current balance of the bank account.
     @return returns the balance in the savings account.
     */
    public double getBal() {
        return bal;
    }
    /**
     Adds the interest rate to the account balance.
     */
    public void addInterest() {
        double interest = bal * intRate / 100;
        bal += interest;
    }

}