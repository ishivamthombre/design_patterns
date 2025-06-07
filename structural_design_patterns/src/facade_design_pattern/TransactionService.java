package facade_design_pattern;

public class TransactionService {
  public void logTransaction(String accountNumber, double amount) {
    System.out.println("Transaction of ₹" + amount + " logged for account " + accountNumber);
  }
}

