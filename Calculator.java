/***
 * A classe "Calculator" implementa uma calculadora que aceita diversos tipos de dados,
 * disponibilizando as seguintes operações:
 * - Soma
 * - Subtracao
 * - Divisao
 * - Resto
 * 
 * Para rodar este arquivo, utilizar o comando "java Calculator.java".
***/



/*** 
 * Nomes de classes devem começar com letra maiúscula.
 * O nome do arquivo deve ter o mesmo nome da classe publica.
***/
public class Calculator {
    /***
     * Nomes de métodos e variáveis devem começar com letra minúscula.
     * Java Method Overloading: metodos podem ter o mesmo nome e distintos tipos de parametros.
    ***/
    static int sumMethod(int a, int b) {
        return a+b;
    }

    static float sumMethod(float a, float b) {
        return a+b;
    }

    static double sumMethod(double a, double b) {
        return a+b;
    }

    static String sumMethod(String a, String b) {
        return a+b;
    }

    static int subMethod(int a, int b) {
        return a-b;
    }

    static float subMethod(float a, float b) {
        return a-b;
    }

    static double subMethod(double a, double b) {
        return a-b;
    }

    public static void main(String[] args) {
        int sum_int = sumMethod(1,2);
        double sum_double = sumMethod(1.5,2.1); // 1.5 eh por padrao "double" em java
        float sum_float = sumMethod(1.5F,2.1F); // Inserir 'F' apos o numero o transforma em float
        String sum_string = sumMethod("Hello ","World"); // Para definir String em java, usar aspas duplas

        int sub_int = subMethod(1,2);
        double sub_double = subMethod(1.5,2.1);
        float sub_float = subMethod(1.5F,2.1F);
        // Nao existe subtracao de Strings em java

        System.out.println("Soma ------------------------");
        System.out.println("int 1 + int 2: " + sum_int);
        System.out.println("float 1.5 + float 2.1: " + sum_float);
        System.out.println("double 1.5 + double 2.1: " + sum_double);
        System.out.println("String 'Hello ' +  String 'World': " + sum_string + "\n");

        System.out.println("Subtração -------------------");
        System.out.println("int 1 - int 2: " + sub_int);
        System.out.println("float 1.5 - float 2.1 " + sub_float);
        System.out.println("double 1.5 - double 2.1: " + sub_double + "\n");
    }
}
