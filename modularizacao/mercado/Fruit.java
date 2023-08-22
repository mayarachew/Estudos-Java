package mercado;

// Subclass (inherit from Ingredient)
public class Fruit extends Ingredient {
  public String taste;

  public Fruit(String _name, String _taste) {
    this.name = _name;
    this.taste = _taste;
    this.quantity = 1;
  }

  public void message() {
      System.out.println("Frutinha!");
  }
}
