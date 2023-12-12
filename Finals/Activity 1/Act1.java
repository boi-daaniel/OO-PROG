import java.util.Scanner;
import java.util.InputMismatchException;

public class Act1{
   public Act1() {
      Scanner input = new Scanner(System.in);
      
      try {
         System.out.print("Enter number: ");
         double num = input.nextDouble();
         
         if (num < 0) {
            throw new ArithmeticException("Cannot take negative numbers.");
         }
         
         double squareRoot = Math.sqrt(num);
         System.out.println("Square root of " + num + " is: " + squareRoot);      
      } catch(ArithmeticException e){
         System.out.println("Error: " + e.getMessage());
      } catch(InputMismatchException ie){
         System.out.println("Invalid input try again.");
      }
   }
   
   public static void main(String[] args){
      new Act1();
   }
}