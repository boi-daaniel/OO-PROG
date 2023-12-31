import java.util.Scanner;

public class Temperature {    
    static String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int months = 12;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] tempData = new double[months][2];
        int months = 12;
          
        for (int i = 0; i < months; i++) {
            System.out.print("Enter Highest Temperature for " + (monthNames[i]) + ": ");
            tempData[i][0] = input.nextDouble();
            System.out.print("Enter Lowest Temperature for " + (monthNames[i]) + ": ");
            tempData[i][1] = input.nextDouble();
            System.out.println(); // Separator
        }
        
        // DISPLAY
        getData(tempData);
        averageHigh(tempData);
        averageLow(tempData);
        indexHighTemp(tempData);
        indexLowTemp(tempData);
        
    }// main

    // getData method
    public static void getData(double[][] tempData) {
      System.out.println("\t All Month's Temperature Data");
      int i = 0;
      for(double[] monthTemp : tempData) {
         System.out.println(monthNames[i] + ": (Highest: " + monthTemp[0] + ") - (Lowest: " + monthTemp[1] + ")");
         i++;
      }
      System.out.println();// To Seperate  
    }

    // averageHigh method
    public static void averageHigh(double[][] tempData) {
        double sum = 0;
        for (int i = 0; i < tempData.length; i++) {
            sum += tempData[i][0];
        }
        double average = sum / tempData.length;
        System.out.printf("Average High Temperature: %.2f\n", average);
    }

   // averageLow method
    public static void averageLow(double[][] tempData) {
        double sum = 0;
        for (int i = 0; i < tempData.length; i++) {
            sum += tempData[i][1];
        }
        double average = sum / tempData.length;
        System.out.printf("Average Low Temperature: %.2f\n", average);

    }

   // indexHighTemp method
    public static void indexHighTemp(double[][] tempData) {
        double HighTemp = tempData[0][0];
        int index = 0;

        for (int i = 1; i < tempData.length; i++) {
            if (tempData[i][0] > HighTemp) {
                HighTemp = tempData[i][0];
                index = i;
            }
        }
        System.out.println("Month with the Highest Temperature: " + monthNames[index]);
    }

   // indexLowTemp method
    public static void indexLowTemp(double[][] tempData) {
        double LowTemp = tempData[0][1];
        int index = 0;

        for (int i = 1; i < tempData.length; i++) {
            if (tempData[i][1] < LowTemp) {
                LowTemp = tempData[i][1];
                index = i;
            }
        }
        System.out.println("Month with the Lowest Temperature: " + monthNames[index]);
    }
    
}// Class

