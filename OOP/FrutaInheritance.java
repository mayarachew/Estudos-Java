// Subclass (inherit from Ingredient)
class Fruit extends Ingredient {
  private String taste;

  private Fruit(String _name, String _taste) {
    this.name = _name;
    this.taste = _taste;
  }

  public void buy() { // the body of the abstract method is provided here
    this.quantity += 1;
    System.out.println("Comprei +1 ingrediente!\n");
  }

  public static void main(String[] args) {
    // create an object of the Fruit class (which inherits attributes and methods from Main)
    Fruit myObj = new Fruit("Limão", "Azedo");

    System.out.println("\nEstado inicial ------");
    System.out.println("Ingrediente: " + myObj.name);
    System.out.println("Gosto: " + myObj.taste);
    System.out.println("Quantidade: " + myObj.quantity + "\n");
    myObj.buy(); // call abstract method

    System.out.println("Estado final --------");
    System.out.println("Ingrediente: " + myObj.name);
    System.out.println("Gosto: " + myObj.taste);
    System.out.println("Quantidade: " + myObj.quantity);
  }
}

// abstract class
abstract class Ingredient {
  public String name = "Não definido";
  public int quantity = 0;

  public abstract void buy(); // abstract method
}