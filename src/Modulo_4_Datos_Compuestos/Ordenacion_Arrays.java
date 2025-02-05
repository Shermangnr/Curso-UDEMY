/* Porgrama que muestra el funciionamiento de distintos algoritmos
   de ordenación de Arrays.
   Para ilustrarlo, se ordena de menor a mayor un array de enteros
*/
package Modulo_4_Datos_Compuestos;
import java.util.Scanner;
public class Ordenacion_Arrays {
    public static void main (String[] args) {
/*      //Algoritmo de burbuja
        int[] numeros = {8, 3, 1, 6, 2};

        for (int i=0; i < numeros.length - 1; i++){
            for (int j=0; j < numeros.length - i - 1; j++){
                if (numeros[j] > numeros[j+1]){
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
            }
        }
        for (int i=0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        //Algoritmo de intercambio directo
        for (int i=0; i < numeros.length -1; i++){
            for (int j=i+1; j < numeros.length; j++){
                if(numeros[i] > numeros[j]){
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }
        for(int i=0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
*/
        //Ejercicio
        Scanner es = new Scanner(System.in);
        final int CANTIDAD = 10;
        int [] datos = new int[CANTIDAD];

        for (int i=0; i < CANTIDAD; i++){
            System.out.println("Escribe el dato " + (i+1) + " de " + CANTIDAD);
            datos[i] = es.nextInt();
        }

        //Algoritmo de burbuja (Ascendente)
        for (int i=0; i < CANTIDAD - 1; i++){
            for (int j=0; j < CANTIDAD - i - 1; j++){
                if (datos[j] > datos[j+1]){
                    int auxiliar = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = auxiliar;
                }
            }
        }
        for (int n : datos){
            System.out.print(n + " ");
        }
        System.out.println();

        //Algoritmo de intercambio directo (Descendente)
        for (int i=0; i < CANTIDAD -1; i++){
            for (int j=i+1; j < CANTIDAD; j++){
                if(datos[i] < datos[j]){
                    int auxiliar = datos[i];
                    datos[i] = datos[j];
                    datos[j] = auxiliar;
                }
            }
        }
        for(int n : datos){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
