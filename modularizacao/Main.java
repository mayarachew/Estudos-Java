import mercado.*;

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