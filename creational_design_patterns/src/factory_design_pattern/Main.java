package factory_design_pattern;

public class Main {
  public static void main(String[] args) {
    BankService loanService = BankServiceFactory.getService("loan");
    loanService.process();

    BankService accService = BankServiceFactory.getService("account");
    accService.process();
  }
}
