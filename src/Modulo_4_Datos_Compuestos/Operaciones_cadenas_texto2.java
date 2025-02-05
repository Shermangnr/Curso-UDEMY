package Modulo_4_Datos_Compuestos;
import java.util.Scanner;

public class Operaciones_cadenas_texto2 {
    public static void main (String[] args){
        String texto = "Hola";
        if (texto.equals("Hola"))
            System.out.println("Hola, que tal?");
        else
            System.out.println("No me has saludado");

        texto = "Hola buenas tardes";
        if (texto.contains("la"))
            System.out.println("El texto contiene \"la\"");

        texto = "Hola, buenas tardes";
        if (texto.startsWith("Hola"))
            System.out.println("Has saludado");

        texto = "Este texto es un test";
        int posicion = texto.indexOf("te");
        int posicion2 = texto.indexOf("te", 3);
        System.out.println(posicion);
        System.out.println(posicion2);

        texto = "Este texto es un test";
        posicion = texto.lastIndexOf("te");
        posicion2 = texto.lastIndexOf("te", 10);
        System.out.println(posicion);
        System.out.println(posicion2);

        texto = "Este texto es un test";
        String textoReemplazado = texto.replace("te", "****");
        System.out.println(textoReemplazado);

        //Ejercicio
        Scanner sc = new Scanner(System.in);
        String texto1;
        int contador = 0;
        int posicionActual = 0;

        System.out.println("Escribe un texto:");
        texto1 = sc.nextLine();

        texto1 = texto1.replace("Python", "Java");
        System.out.println(texto1);

        texto1 = texto1.toUpperCase();
        while (texto1.indexOf("JAVA", posicionActual) >= 0) {
            contador ++;
            posicionActual = texto1.indexOf("JAVA", posicionActual) + 4;
        }
        System.out.println("La palabra Java ha aparecido " + contador + " veces");


    }
}
