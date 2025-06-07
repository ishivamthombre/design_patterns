package facade_design_pattern;

public class BankingApp {
  public static void main(String[] args) {
    BankingFacade bank = new BankingFacade();
    bank.withdrawMoney("ACC123", "1234", 5000);  // Successful
    bank.withdrawMoney("ACC123", "0000", 2000);  // Wrong PIN
    bank.withdrawMoney("ACC123", "1234", 15000); // Insufficient funds
  }
}

