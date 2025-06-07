package facade_design_pattern;

public class BankingFacade {
  private final AccountService accountService;
  private final FundsService fundsService;
  private final SecurityService securityService;
  private final TransactionService transactionService;

  public BankingFacade() {
    this.accountService = new AccountService();
    this.fundsService = new FundsService();
    this.securityService = new SecurityService();
    this.transactionService = new TransactionService();
  }

  public void withdrawMoney(String accountNumber, String pin, double amount) {
    System.out.println("\n=== Withdraw Request Initiated ===");

    if (!accountService.isAccountActive(accountNumber)) {
      System.out.println("Account is not active.");
      return;
    }

    if (!securityService.validatePin(accountNumber, pin)) {
      System.out.println("Invalid PIN.");
      return;
    }

    if (!fundsService.hasSufficientFunds(accountNumber, amount)) {
      System.out.println("Insufficient balance.");
      return;
    }

    fundsService.debit(accountNumber, amount);
    transactionService.logTransaction(accountNumber, amount);

    System.out.println("Withdrawal of ₹" + amount + " successful!");
  }
}
