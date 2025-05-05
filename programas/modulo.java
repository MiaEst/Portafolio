package programas;

import java.util.Scanner;

public class modulo {
 

    public static void mod() {
 

        Scanner numScann = new Scanner(System.in);
 

        System.out.println("+---------------------------------+");
        System.out.println("[n1]: ");
        double num1 = numScann.nextDouble();
 
        System.out.println("[n2]: ");
        double num2 = numScann.nextDouble();
        System.out.println("+---------------------------------+");
 
        System.out.println("[El Resultado es]: "+ (num1%num2));
        System.out.println("+---------------------------------+");
 

    }
 

}