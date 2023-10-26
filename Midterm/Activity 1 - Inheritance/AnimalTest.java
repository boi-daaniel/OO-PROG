public class AnimalTest {
   public static void main(String[] args) {
      // Create a local variable named elephant, and initialize it with a new object of the type Animal.
      Animal elephant = new Animal(65, 14000, 'M', "Jumbo", "Elephant");
      Animal lion = new Animal(10, 570, 'M', "Simba", "Lion");

      // Call the printValues() method to display the instance variables of the object
      elephant.printValues();
      lion.printValues();
   }
}

