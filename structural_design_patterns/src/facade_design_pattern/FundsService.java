package facade_design_pattern;

public class FundsService {
  public boolean hasSufficientFunds(String accountNumber, double amount) {
    // Simulate balance check
    System.out.println("Checking funds for account " + accountNumber);
    return amount <= 10000;
  }

  public void debit(String accountNumber, double amount) {
    System.out.println("Debiting ₹" + amount + " from account " + accountNumber);
  }
}

