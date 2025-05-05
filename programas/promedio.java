package programas;

import java.util.Scanner;

public class promedio {
    public static void prom(){

        Scanner numScann = new Scanner(System.in);
        System.out.println("+---------------------------------+");
        System.out.println("[n1]: ");
        double num1 = numScann.nextDouble();
 
        System.out.println("[n2]: ");
        double num2 = numScann.nextDouble();
        System.out.println("+---------------------------------+");

        System.out.println("[n3]: ");
        double num3 = numScann.nextDouble();
        System.out.println("+---------------------------------+");
 

        System.out.println("[El Resultado es]: "+(num1+num2+num3)/3);
        System.out.println("+---------------------------------+");
    }
}