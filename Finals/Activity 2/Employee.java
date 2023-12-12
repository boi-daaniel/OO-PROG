public class Employee {
    private String idNum;
    private double hourlyWage;

    public Employee(String idNum, double hourlyWage) throws EmployeeException {
        if (hourlyWage < 100.00 || hourlyWage > 400.00) {
            throw new EmployeeException("Invalid hourly wage for employee ID " + idNum);
        }
        
        this.idNum = idNum;
        this.hourlyWage = hourlyWage;
        System.out.println("ID: " + idNum + " created successfully.");
    }
}