public class BusinessLoan extends Loan {
    public BusinessLoan(int loanNumber, String lastName, double loanAmount, int term) {
        super(loanNumber, lastName, loanAmount, term);
    }

    // Business Loan interest rate calculation method set to 0.01
    public void setInterestRate(double primeInterestRate) {
        this.interestRate = (0.01 + primeInterestRate) * term;
    }
}