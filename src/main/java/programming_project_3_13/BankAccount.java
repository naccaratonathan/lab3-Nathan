package programming_project_3_13;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{

   private double deductMonthlyCharge;

   private int transactionCount;
   private int free;
   private double transactionFee;
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance, double transactionFee, int free)
   {   

      balance = initialBalance;
      this.transactionFee = transactionFee;
      this.free = free;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
      for (int i = 0; i < (free <= 0 ? 1 : 0); i++){
         balance -= transactionFee;
      }
      free--;
   }


   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {
      balance = balance - amount;
      for (int i = 0; i < (free <= 0 ? 1 : 0); i++){
         balance -= transactionFee;
      }
      free--;
   }



   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}



