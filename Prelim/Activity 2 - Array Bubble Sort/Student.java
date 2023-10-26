public class Student{
   //variables
   private int id;
   private String last;
   private String first;
   private String course;
   private double grade;
   
   //constructor
   public Student (int id, String last, String first, String course, double grade){
      this.id=id;
      this.last=last;
      this.first=first;
      this.course=course;
      this.grade=grade;
   }
   
   //getters
   public int getID() {
      return id;
   }
   public String getLast() {
      return last;
   }
   public String getFirst() {
      return first;
   }
   public String getCourse() {
      return course;
   }
   public double getGrade() {
      return grade;
   }
   
 
} //End of the world

