/*
    Programa que muestra el funcionamiento de la comparacion de cadenas de texto en Java,
    ordenando un Array de textos mediante el metodo del intercambio directo.
 */

package Modulo_4_Datos_Compuestos;

import java.util.Scanner;

public class Comparacion_cadenas_texto {
    public static void main (String[] args){
        // Algoritmo de intercambio directo
        String[] textos = {"Uno", "Dos", "tres", "cuatro", "Cinco"};

        for (int i=0; i < textos.length - 1; i++ ){
            for (int j=i+1; j < textos.length; j++){
                if (textos[i].compareToIgnoreCase(textos[j]) > 0 ){
                    //El texto i es mayor, se debe intercambiar
                    String auxiliar = textos [i];
                    textos[i] = textos[j];
                    textos[j] = auxiliar;
                }
            }
        }
        for (int i = 0; i < textos.length; i++){
            System.out.print(textos[i] + " ");
        }
        System.out.println();

        //Ejercicio
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe nombres , separados por comas: ");
        String respuesta = sc.nextLine();

        String[] nombres = respuesta.split(", ");

        for (int i=0; i < nombres.length - 1; i++ ){
            for (int j=i+1; j < nombres.length; j++){
                if (nombres[i].compareToIgnoreCase(nombres[j]) > 0 ){
                    //El texto i es mayor, se debe intercambiar
                    String auxiliar = nombres [i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxiliar;
                }
            }
        }
        for (int i = 0; i < nombres.length; i++){
            System.out.print(nombres[i] + " ");
        }
        System.out.println();

    }
}
