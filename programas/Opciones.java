package programas;
public class Opciones {

    static String lista [] ={
    "Suma de dos números",
    "Resta de dos números",
    "Multiplicación de dos números",
    "División de dos números",
    "Módulo (Residuo de una división)",
    "Promedio de 3 números",
    "Número mayor y menor de dos números",
    "Número mayor y menor de tres números",
    "Conversión m a cm",
    "Conversión m a km",
    
    };
//MÉTODO MOSTRAR OPCIONES 
public static void opciones (){

for (int i = 0; i < lista.length; i++){
    System.out.println("["+ (i+1) +"]")
}

} 
}