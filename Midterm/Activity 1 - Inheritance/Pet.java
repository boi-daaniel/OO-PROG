public class Pet extends Animal {
   // A String value named home and a String value named bites as private instance variables.
   private String home;
   private String bites;

   // A Pet() constructor with parameters to initialize all data members of the class and to call the Animal() constructor.
   public Pet(int lifeExpectancy, int weight, char gender, String name, String type, String home, String bites) {
      super(lifeExpectancy, weight, gender, name, type); // Animal constructor
      this.home = home;
      this.bites = bites;
   }

   /* A void method named printValues() with no parameters that displays all data
      members for the object of that class and then calls the printValues() method of the
      Animal class to display the private data members of the superclass. */
   public void printValues() {
      String toString;
         switch (getGender()) {
            case 'M':
               toString = "male";
               break;
            case 'F':
               toString = "female";
               break;
            case 'N':
               toString = "neutered male";
               break;
            case 'S':
               toString = "spayed female";
               break;
            default:
               toString = "unknown";
               break;
         }
         
         System.out.println("A " + toString + " " + type + " named " + getName() + " should live to be " + getLifeExpectancy() + " years and weigh " + getWeight() + " pounds.");
         System.out.println("Your " + type + " lives " + home + " and does " + bites);
    }
}// CLASS

