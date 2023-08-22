/***
* A herança nos permite herdar atributos e métodos de outra classe. 
* O polimorfismo usa esses métodos para executar tarefas diferentes.
***/

class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Maracujá", "Azedo");
        Beer beer = new Beer("Amstel");

        fruit.message();
        beer.message();

        System.out.println(fruit.name);
        System.out.println(fruit.taste);
        System.out.println(fruit.quantity);

        System.out.println(beer.name);
        System.out.println(beer.quantity);
    }
}

// abstract class
abstract class Ingredient {
    public String name = "Não definido";
    public int quantity = 0;
}

// Subclass (inherit from Ingredient)
class Fruit extends Ingredient {
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

// Subclass (inherit from Ingredient)
class Beer extends Ingredient {
    public Beer(String _name) {
      this.name = _name;
      this.quantity = 6;
    }

    public void message() {
        System.out.println("Cervejinha!");
    }
}
