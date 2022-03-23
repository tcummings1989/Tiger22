package tcummings1989.Inheritance.Animal2;

class Dog extends Animal2 { // Subclass (child)
    public void animalSound() {
      super.animalSound(); // Call the superclass method
      System.out.println("The dog says: bow wow");
    }
}