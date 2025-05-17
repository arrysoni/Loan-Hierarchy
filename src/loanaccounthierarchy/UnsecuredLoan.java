
package loanaccounthierarchy;

public class UnsecuredLoan extends LoanAccount {

    public UnsecuredLoan(double principle, double annualInterestRate, int months) {
        super(principle, annualInterestRate, months);
    }
    
    @Override
    public String toString(){
    return String.format("""
                              Unsecured Loan with: 
                              Principal: $%.2f 
                              Annual Interest Rate: %.2f%% 
                              Term of Loan in Months: %d
                              Monthly Payment: $%.2f\n\n""",
                 super.getPrinciple(),super.getAnnualInterestRate(),super.getMonths(),calculateMonthlyPayment());

    }
}
    

    
