public class PetTest {
   public static void main(String[] args) {
      // Create a local variable named dog and initialize it with a new object of the type Pet
      Pet dog = new Pet(11, 20, 'S', "Fifi", "dog", "indoors", "not bite");
      Pet cat = new Pet(15, 15, 'M', "Simba", "cat", "indoors", "not bite");


      // Call the printValues() method to display the instance variables of the dog
      dog.printValues();
      cat.printValues();
    }
}

