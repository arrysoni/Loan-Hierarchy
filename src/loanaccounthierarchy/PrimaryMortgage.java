package loanaccounthierarchy;

public class PrimaryMortgage extends LoanAccount{
    
    private double PMIMonthlyAmount;
    Address Address;
    
    public PrimaryMortgage(double principle, double annualInterestRate, int months,double PMIMonthlyAmount, Address Address) {
        super(principle, annualInterestRate, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.Address = Address;
    }
    
    @Override
    public String toString(){
              
        return String.format("""
                              Primary Mortgage Loan with: 
                              Principal: $%.2f 
                              Annual Interest Rate: %.2f%% 
                              Term of Loan in Months: %d
                              Monthly Payment:$ %.2f
                              PMI Monthly Amount: $%s
                              Property Address: \n\t%s\n\n""",
                 super.getPrinciple(),super.getAnnualInterestRate(),super.getMonths(),calculateMonthlyPayment() ,PMIMonthlyAmount, Address);
    }

    
   
}
