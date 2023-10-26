public abstract class Loan implements LoanConstants {
    int loanNumber;
    String lastName;
    double LoanAmount;
    double interestRate;
    int term;

    // Constructor
    public Loan(int loanNumber, String lastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.lastName = lastName;
        // Sets minimum loanAmount to $100,000 if exceeded using predefined method
        this.LoanAmount = Math.min(loanAmount, maximumLoan);
        // Defaults term to short term if invalid 
        if (term == shortTerm || term == mediumTerm || term == longTerm) {
            this.term = term;
        } else {
            this.term = shortTerm;
        }
    }

    // Interest rate abstract method for Business & Personal loan subclass
    public abstract void setInterestRate(double primeInterestRate);

    // Display
    public String toString() {
        double TotalLoanAmount = LoanAmount * (1 + interestRate);
        return String.format("\nLoan Number: %d\nLast Name: %s\nLoan Amount: %.2f\nLoan Amount after Total Interest: %.2f\nTotal Interest Rate: %.2f\nTerm: %d year\nCompany Name: %s",
            loanNumber, lastName, LoanAmount, TotalLoanAmount, interestRate, term, companyName);
    }
}