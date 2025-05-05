import java.util.Scanner;

public class Main {
 

    public static void main(String[] args) {
 
        Scanner Portafolio = new Scanner(System.in);
        int opcion;
 
        vistas.Vistas.banner();
 
        do{
            programas.Opciones.opciones();
            System.out.println("[0] Salir");
            System.out.println("[?] ");
            opcion = Portafolio.nextInt();
 
            switch (opcion) {
                case 1:
                    programas.suma.suma();
                    break;
 
                    case 2:
                    programas.resta.resta();
                    break;
 
                    case 3:
                    programas.multi.multi();
                    break;

                    case 4:
                    programas.división.divi();
                    break;
 
                    case 5:
                    programas.modulo.mod();
                    break;
 
                    case 6:
                    programas.promedio.prom();
                    break;
 
                    case 7:
                    programas.mayor.mayor();
                    break;
 
                    case 8:
                    programas.mayor3.tres();
                     break;
 
                    case 9:
                    programas.macm.mcm();
                    break;
 
                    case 10:
                    programas.kg.kg();
                    break;

                default:
                    break;
            }
 
            } while(opcion != 0);
        } }