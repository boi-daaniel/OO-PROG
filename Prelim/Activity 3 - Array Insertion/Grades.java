import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many Grades: ");
        int totalGrade = input.nextInt();

        double[] grades = new double[totalGrade];
        System.out.print("Enter " + totalGrade + " Final grades: ");
        for (int i = 0; i < totalGrade; i++) {
            grades[i] = input.nextDouble();
        }

        while (true) {
            System.out.println("\nPlease choose");
            System.out.println("1. Insertion Sort (Ascending)");
            System.out.println("2. Insertion Sort (Descending)");
            System.out.println("0. Exit");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Grades in ascending order:");
                    ascending(grades);
                    break;
                case 2:
                    System.out.println("Grades in descending order:");
                    descending(grades);
                    break;
                case 0:
                    System.out.println("Stopping program ...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice choose again.");
            }
        }
        
    }// End of main

    // Asecnding insertion sort
    public static void ascending(double[] grades) {
        int num = grades.length;
        int i = 1;

        while (i < num) {
            double temp = grades[i];
            int j = i - 1;
            while (j >= 0 && grades[j] > temp) {
                grades[j + 1] = grades[j];
                j--;
            }
            grades[j + 1] = temp;
            i++;
        }
        // Display
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println(); // seperator
    }

    // Descending insertion sort
    public static void descending(double[] grades) {
        int num = grades.length;
        int i = 1;

        while (i < num) {
            double temp = grades[i];
            int j = i - 1;
            while (j >= 0 && grades[j] < temp) {
                grades[j + 1] = grades[j];
                j--;
            }
            grades[j + 1] = temp;
            i++;
        }
        // Display
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println(); // seperator
    }

}// end of class
