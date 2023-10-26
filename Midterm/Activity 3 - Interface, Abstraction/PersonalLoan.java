public class PersonalLoan extends Loan {
    public PersonalLoan(int loanNumber, String lastName, double loanAmount, int term) {
        super(loanNumber, lastName, loanAmount, term);
    }

    // Personal Loan interest rate calculation method set to 0.02
    public void setInterestRate(double primeInterestRate) {
        this.interestRate = (0.02 + primeInterestRate) * term;
    }
}