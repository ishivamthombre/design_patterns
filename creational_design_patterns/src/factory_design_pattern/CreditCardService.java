package factory_design_pattern;

public class CreditCardService implements BankService {
  public void process() {
    System.out.println("Processing Credit Card Application...");
  }
}