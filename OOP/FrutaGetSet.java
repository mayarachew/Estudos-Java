/*** 
 * public class: essa classe pode ser acessada por qualquer outra classe.
 * <default>: sem definir como "public", apenas as classes do pacote têm acesso à essa classe.
 * ***/
public class FrutaGetSet {
    /*** 
     * private attribute: o atributo pode ser acessado apenas pela 
     * classe dele (se nao tiver get e set publicos).
     * 
     * <default>: sem definir como "private", pode ser acessado por outras classes.
     * ***/

    // Definicao de atributos private da classe Fruta
    private String name;
    private String taste;
    private int quantity;

    private FrutaGetSet(String _name, String _taste, int _quantity) {
        // Inicializacao de atributos no momento de criacao do objeto
        name=_name;
        taste=_taste;
        quantity=_quantity;
    }

    /***
     * static method: pode ser acessado sem precisar instanciar.
     * public method: precisa instanciar; pode ser acessado apenas por um objeto; 
     * pode ser acessado em qualquer lugar.
     * private method: pode ser acessado apenas pela classe dele.
     * 
     * OBS: o metodo nao pode ser "private" e "public" ao mesmo tempo.
     * ***/

    // Print de mensagem que pode ser acessada sem instanciar
    public static void dailyMessage() {
        System.out.println("Dia de feira!!\n");
    }

    // Print de mensagem que precisa se instanciada
    public void newProductMessage() {
        System.out.println("Novo produto registrado!\n");
    }

    // Get com o retorno do nome da fruta, que eh do tipo String
    private String getName() {
        return name;
    }

    // Set do nome da fruta, que eh do tipo String, e sem retorno do metodo
    private void setName(String _name) {
        // Mudanca do atributo nome da FrutaCrud
        this.name=_name;
    }
    
    public static void main(String[] args) {
        dailyMessage();

        // Criacao do objeto "myObj1" do tipo Fruta por meio da instanciacao da classe Fruta
        FrutaGetSet myObj1 = new FrutaGetSet("Maracujá", "Azedo",10);
        /*** 
         * Exemplo de erro pelo metodo nao ser "static":
         *  newProductMessage(); -> error: non-static method newProductMessage() cannot be referenced from a static context
        ***/
        myObj1.newProductMessage();

        System.out.println("Objeto 1 -----------------");
        System.out.println("Nome: " + myObj1.name);
        System.out.println("Gosto: " + myObj1.taste);
        System.out.println("Quantidade: " + myObj1.quantity + "\n");

        // Modificacao do nome do objeto 1 para "Limão"
        myObj1.setName("Limão");

        System.out.println("Objeto 1 modificado ------");
        System.out.println("Nome: " + myObj1.getName());
        System.out.println("Gosto: " + myObj1.taste);
        System.out.println("Quantidade: " + myObj1.quantity + "\n");
    }
}
