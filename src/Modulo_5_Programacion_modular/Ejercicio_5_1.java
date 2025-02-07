/*
    Solucion del ejercicio 5.1 que apunta a la clase
    Definicion y uso basico de funciones
 */
package Modulo_5_Programacion_modular;
import java.util.Scanner;

public class Ejercicio_5_1 {


    public static void maximo(int n1, int n2){
        int max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;
        System.out.println("El numero maximo es: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        maximo(numero1, numero2);
    }
}
