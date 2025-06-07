package facade_design_pattern;

public class SecurityService {
  public boolean validatePin(String accountNumber, String pin) {
    // Simulate PIN validation
    System.out.println("Validating PIN for account " + accountNumber);
    return pin.equals("1234");
  }
}
