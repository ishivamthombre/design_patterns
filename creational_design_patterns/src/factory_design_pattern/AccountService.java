package factory_design_pattern;

public class AccountService implements BankService {
  public void process() {
    System.out.println("Creating New Bank Account...");
  }
}