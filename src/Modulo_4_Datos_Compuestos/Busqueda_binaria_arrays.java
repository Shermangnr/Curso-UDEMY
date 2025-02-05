/*
    Programa que muestra el funcionamiento de la busqueda
    binaria o dicotomica en un Array ordenado de enteros.
 */

package Modulo_4_Datos_Compuestos;

import java.util.Scanner;

public class Busqueda_binaria_arrays {
    public static void main (String[] args){
        int [] numeros = {1, 2, 3, 6, 7, 8, 9};
        int numeroABuscar = 9;

        int inicio = 0, fin = numeros.length - 1, selecccionado;
        boolean encontrado = false;

        do {
            selecccionado = (inicio + fin) / 2;
            if (numeros[selecccionado] > numeroABuscar){
                fin = selecccionado - 1;
            } else if (numeros[selecccionado] < numeroABuscar) {
                inicio = selecccionado + 1;
            } else {
                encontrado = true;
            }
        } while (!encontrado && inicio <= fin);
        if(encontrado){
            System.out.println("Encontrado en la posición " + selecccionado);
        } else {
            System.out.println("No se encuentra el elemento.");
        }

        // Ejercicio
        Scanner sc = new Scanner(System.in);
        final int CANTIDAD = 10;
        int [] datos = new int[CANTIDAD];
        boolean hallado = false;
        int ini = 0, termino = CANTIDAD - 1,puntoMedio, numeroPorBuscar, pasos = 0;

        for (int i=0; i < CANTIDAD; i++){
            System.out.println("Escribe el número " + (i+1) + " de " + CANTIDAD + ":");
            datos[i] = sc.nextInt();
        }

        System.out.println("¿Que número quieres buscar?:");
        numeroPorBuscar = sc.nextInt();

        for (int i=0; i < CANTIDAD -1; i++){
            for (int j=i+1; j < CANTIDAD; j++){
                if(datos[i] > datos[j]){
                    int auxiliar = datos[i];
                    datos[i] = datos[j];
                    datos[j] = auxiliar;
                }
            }
        }

        do {
            pasos ++;
            puntoMedio = (ini + termino)/2;
            if(datos[puntoMedio] == numeroPorBuscar) {
                hallado = true;
            } else if (datos[puntoMedio] > numeroPorBuscar) {
                termino = puntoMedio - 1;
            }
            else {
                ini = puntoMedio + 1;
            }
        } while(! hallado && ini <= termino );

        if (hallado) {
            System.out.println("El numero fue encontrado en la posición: " + puntoMedio);
            System.out.println("Se ha necesitado " + pasos + " pasos");
        } else {
            System.out.println("El número NO se encuentra.");
        }

        System.out.println();
        for(int n : datos){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
