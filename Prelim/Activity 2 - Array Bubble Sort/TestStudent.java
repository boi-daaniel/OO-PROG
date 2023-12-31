import java.util.Scanner;

public class TestStudent{
   public static void main(String[] args){
      Scanner Input = new Scanner(System.in);
      int stuNum;
      
      System.out.print("Enter # of Students:");
      stuNum = Input.nextInt();
      
      Student[] stu = new Student[stuNum];
      for(int i=0; i<stu.length; i++) {
         System.out.print("Enter ID # " + (i+1) + ": ");
         int id = Input.nextInt();
         Input.nextLine();
         
         System.out.print("Enter Last Name: ");
         String last = Input.nextLine();
         
         System.out.print("Enter first Name: " );
         String first = Input.nextLine();
         
         System.out.print("Enter Course: " );
         String course = Input.nextLine();
         
          
         System.out.print("Enter Grade: ");
         double grade = Input.nextDouble();
         
         stu[i] = new Student(id, last, first, course, grade);
      }// End of for loop
      
      //Display
      System.out.println("Students List");
      for(Student s: stu){
         System.out.println("ID: " + s.getID());
         System.out.println("Last Name: " + s.getLast());
         System.out.println("First Name: " + s.getFirst());
         System.out.println("Course: " + s.getCourse());
         System.out.println("Grade: " + s.getGrade());
      }   
      
      //Highest to Lowest
      bubbleSort(stu);
      System.out.println("Students List Higest to Lowest");
       for(Student s: stu){
         System.out.println("ID: " + s.getID());
         System.out.println("Last Name: " + s.getLast());
         System.out.println("First Name: " + s.getFirst());
         System.out.println("Course: " + s.getCourse());
         System.out.println("Grade: " + s.getGrade());   
      
      }
} // End of main
      
      public static void bubbleSort(Student[] array) {
         int a, b;
         Student temp;
         
         int highest= array.length -1;
         for(a=0; a<highest; ++a)
            for(b=0; b<highest; ++b)
               if(array[b].getGrade()< array[b + 1].getGrade()) {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               } // End of For Loop
      } // End of static void
} // End of Class
   

