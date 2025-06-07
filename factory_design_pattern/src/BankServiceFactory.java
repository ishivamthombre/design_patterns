public class BankServiceFactory {
  public static BankService getService(String type) {
    if (type == null)
      return null;
    return switch (type.toLowerCase()) {
      case "loan" -> new LoanService();
      case "account" -> new AccountService();
      case "creditcard" -> new CreditCardService();
      default -> throw new IllegalArgumentException("Unknown service type: " + type);
    };
  }
}