/***
 * 0! = 1
 * 1! = 1
 * 2! = 2 * 1
 * 3! = 3 * 2 * 1
 * 4! = 4 * 3 * 2 * 1
 ***/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int result;

        System.out.println("Numero:");
        Scanner ler = new Scanner(System.in);

        int number = ler.nextInt();

        if (number != 0) {
            result = multiply_by_next(number);
        } else {
            result = 1;
        }
        
        System.out.println("\nFatorial:");
        System.out.println(result);
        ler.close();
    }
    
    public static int multiply_by_next(int k) {
        if (k > 1) {
            return k * multiply_by_next(k - 1);
        } else {
            return k * 1;
        }
    }
}


