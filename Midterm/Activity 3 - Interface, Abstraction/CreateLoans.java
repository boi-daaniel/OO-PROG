import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Loan[] loans = new Loan[3];

        System.out.print("Enter Prime Interest Rate: ");
        double primeInterestRate = input.nextDouble();

        for (int i = 0; i < 3; i++) {
            System.out.println("\tLoan Type \n1. Business Loan 2. Personal Loan: ");
            System.out.print("Enter Type: ");
            int loanType = input.nextInt();
            input.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = input.nextLine();

            System.out.print("Loan Amount: ");
            double loanAmount = input.nextDouble();

            System.out.println("\tEnter Term \n1. Short-term 3. Medium-term 5. Long-term");
            System.out.print("Enter Term: ");
            int termInput = input.nextInt();

            // Declare loan
            Loan loan;
            if (loanType == 1) {
                loan = new BusinessLoan(i + 1, lastName, loanAmount, termInput);
            } else {
                loan = new PersonalLoan(i + 1, lastName, loanAmount, termInput);
            }

            // Pass the argument prime Interest rate to setInterestRate method
            loan.setInterestRate(primeInterestRate);
            loans[i] = loan;
        }

        // Display
        System.out.println("\nLOAN LIST:");
        for (Loan loan : loans) {
            System.out.println(loan.toString());
        }

    }
}