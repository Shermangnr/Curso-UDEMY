package Modulo_4_Datos_Compuestos;

import java.util.Scanner;

public class Operaciones_cadenas_texto {
     public static void  main(String[] args) {
         /*
         String texto;
         texto = "Escarabajo";
         String textoCortado1 = texto.substring(2, 6);
         String textoCortado2 = texto.substring(5);
         System.out.println(textoCortado1);
         System.out.println(textoCortado2);
         */
         /*
         String texto1;
         texto1 = "Teleraña,Amortiguiador,Destornillador,martillo,sisterna,Helado,Herramientas,Famosa";
         String textoCortado1 = texto1.substring(0, 2);
         String textoCortado2 = texto1.substring(9, 12);
         String textoCortado3 = texto1.substring(23, 25);
         String textoCortado4 = texto1.substring(38, 40);
         String textoCortado5 = texto1.substring(47, 49);
         String textoCortado6 = texto1.substring(59, 62);
         String textoCortado7 = texto1.substring(63, 66);
         String textoCortado8 = texto1.substring(78, 82);

         System.out.println(textoCortado1 + " " + textoCortado2 + " " + textoCortado3+textoCortado4+textoCortado5+textoCortado6+ " " +textoCortado7+textoCortado8);
         */

         Scanner sc = new Scanner(System.in);
         System.out.print ("Escribe cualquier cantidad de nombres separados por comas:");
         String nombres = sc.nextLine();

         String [] fragmentos = nombres.split(",");
         System.out.println("Se han escrito "+fragmentos.length+" nombres");
         for(String nombre : fragmentos){
             System.out.println(nombre.toUpperCase());
         }
     }
}
