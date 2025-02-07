/*
    Programa que muestra como devolver resultados desde funciones usando "return"
 */

package Modulo_5_Programacion_modular;

import java.util.Scanner;

public class Uso_return_5_2 {
    public static int sumarNumeros(int n1, int n2) {
        return n1 + n2;
    }

    public static void sumarNumeros2(int n1, int n2) {
        System.out.println("El resultado es " +(n1 + n2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUsuario1, numUsuario2;

        int suma = sumarNumeros(2, 3) + sumarNumeros(10, 20);
        System.out.println(suma);

        sumarNumeros2(2, 3);
        sumarNumeros2(10, 20);

        System.out.println("Introduce el primer numero");
        numUsuario1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        numUsuario2 = sc.nextInt();
        System.out.println(sumarNumeros(numUsuario1, numUsuario2));
    }
}
