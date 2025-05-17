package loanaccounthierarchy;

public class CarLoan extends LoanAccount {
    
    String vehicleVIN;
    public CarLoan(double principle, double annualInterestRate, int months, String vehicleVIN) {
        super(principle, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
    }
    
    @Override
    public String toString(){

         return String.format("""
                              Car Loan with: 
                              Principal: $%.2f 
                              Annual Interest Rate: %.2f%% 
                              Term of Loan in Months: %d
                              Monthly Payment: $%.2f
                              Vehicle VIN: %s\n\n""",
                 super.getPrinciple(),super.getAnnualInterestRate(),super.getMonths(),calculateMonthlyPayment() ,vehicleVIN);
    }
                               
    
}
