public class Animal {
   // private data members
   private int lifeExpectancy;
   private int weight;
   private char gender;
   private String name;
   public String type; 

   // Design an Animal() constructor with parameters to accept values for each data member.
   public Animal(int lifeExpectancy, int weight, char gender, String name, String type) {
      this.lifeExpectancy = lifeExpectancy;
      this.weight = weight;
      this.gender = gender;
      this.name = name;
      this.type = type;
   }

   // Design a public void method printValues() with no parameters that displays all data members for the object of the Animal class.
   public void printValues() {
                
       /*For the value of gender, use 'm' for male, 'f' for female, 'n' for a neutered
        male, or 's' for a spayed female.*/
      String toString;
         switch (gender) {
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
               toString = "No gender";
         }
         System.out.println("A " + toString + " " + type + " named " + name + " should live to be " + lifeExpectancy + " years and weigh " + weight + " pounds.");
   }
   
   // Getters for the pet class so that it can access the private data types
   public int getLifeExpectancy() {
      return lifeExpectancy;
   }
   
   public int getWeight() {
      return weight;
   }

   public char getGender() {
      return gender;
   }

   public String getName() {
      return name;
   }
    
   public String getType() {
      return type;
   }
   
} // CLASS

