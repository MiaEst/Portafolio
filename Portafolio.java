import java.util.Scanner;
public class Portafolio {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int opcion;

       do {
System.out.println("\n \n");
System.out.println("Bienvenidos a Mia Java (Mia version 1.0)");
                System.out.println(" __    __ _");
                System.out.println("|   \\/   (_) __ _");
                System.out.println("| | \\/ | | |/ _` |");
                System.out.println("| |    | | | (_| |");
                System.out.println("|_|    | |_|\\__,_|");
                System.out.println("");

                System.out.println("Selecciona una opción para continuar");
                System.out.println("Proyecto iniciado ----> Mar 18 8:45 de 2025");
                System.out.println("");
                
            
            
            //Menú Principal
         System.out.println("[1] La suma de dos números"); 
         System.out.println("[2]");  
         System.out.println("[3]");
         System.out.println("[0] Salir");
         System.out.print("[?]");
         opcion = scanner.nextInt();
        
         //Opciones del menú principal
         switch (opcion){
            case 1:
            System.out.println("+-----------------------------------+");
            System.out.println("Número 1:");
         }

        } while (opcion != 0);
    }
}
