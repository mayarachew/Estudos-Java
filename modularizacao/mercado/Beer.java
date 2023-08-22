package mercado;

// Subclass (inherit from Ingredient)
public class Beer extends Ingredient {
    public Beer(String _name) {
      this.name = _name;
      this.quantity = 6;
    }
  
    public void message() {
        System.out.println("Cervejinha!");
    }
}