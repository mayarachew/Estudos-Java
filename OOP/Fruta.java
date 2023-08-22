class Fruta {
    // Definicao de atributos da classe Fruta
    String name;
    String taste;
    int quantity;

    // constructor method: inicializa valores de uma classe; nao define retorno.
    public Fruta(String _name, String _taste, int _quantity) {
        // Inicializacao de atributos no momento de criacao do objeto
        name=_name;
        taste=_taste;
        quantity=_quantity;
    }

    /*** 
     * Toda classe precisa ter um metodo main: "public static void main(String[] args)",
     * senao aparece o seguinte erro: "can't find main(String[]) method in class"
     * ***/
    public static void main(String[] args) {
        // Criacao do objeto "myObj1" do tipo Fruta por meio da instanciacao da classe Fruta
        Fruta myObj1 = new Fruta("Maracujá", "Azedo",10);
        Fruta myObj2 = new Fruta("Maçã", "Doce",5);
        
        System.out.println("Objeto 1 -----------");
        System.out.println("Nome: " + myObj1.name);
        System.out.println("Gosto: " + myObj1.taste);
        System.out.println("Quantidade: " + myObj1.quantity + "\n");

        System.out.println("Objeto 2 -----------");
        System.out.println("Nome: " + myObj2.name);
        System.out.println("Gosto: " + myObj2.taste);
        System.out.println("Quantidade: " + myObj2.quantity + "\n");
    }
}
