/*
    Solucion al ejercicio propuesto en la clase de return
 */
package Modulo_5_Programacion_modular;

import java.util.Scanner;

public class Ejercicio_5_2 {
    public static float calcularMedia(int [] datos){
        float suma = 0;

        for(int i = 0; i<datos.length;i++){
            suma += datos[i];
        }
        return suma/datos.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];

        for(int i = 0; i<5;i++){
            System.out.print("Escribe el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        float  media = calcularMedia(numeros);
        System.out.println("La media de los 5 datos es: " + calcularMedia(numeros));
    }
}
