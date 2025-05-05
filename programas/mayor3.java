package programas;

import java.util.Scanner;

public class mayor3 {
    public static void tres(){

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
 
         double mayorde = num1;
        if (num2 > numa) numa = num2;
        if (num3 > numa) numa = num3;
 
        double menrque = num1;
        if (num2 < nume) nume = num2;
        if (num3 < nume) nume = num3;
 

        System.out.println("El número mayor es: " + mayorde);
 

        System.out.println("El número menor es: " + menrque);
       
    }
}