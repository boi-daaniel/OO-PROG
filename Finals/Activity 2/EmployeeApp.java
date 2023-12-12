import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter Employee ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Hourly Wage :");
            double wage = Double.parseDouble(scanner.nextLine());
                
            try {
                new Employee(id, wage);
            } catch (EmployeeException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}