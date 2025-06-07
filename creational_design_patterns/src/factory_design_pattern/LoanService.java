package factory_design_pattern;

public class LoanService implements BankService {
  public void process() {
    System.out.println("Processing Loan Application...");
  }
}
