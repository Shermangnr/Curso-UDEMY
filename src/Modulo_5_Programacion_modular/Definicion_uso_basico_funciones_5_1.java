/*
    Programa que muestra como definir y usar funciones
 */

package Modulo_5_Programacion_modular;
import java.util.Scanner;

public class Definicion_uso_basico_funciones_5_1 {
    public static void mostrarBienvenida () {
        System.out.println("Bienvenido a nuestra tienda");
        System.out.println("Elige una opción del menú para continuar...");
    }

    public static void saludar(String nombre, int edad) {
        System.out.println("Hola, " + nombre + ", tienes " + edad + " años");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreUsuario;
        int edadUsuario;

        mostrarBienvenida();

        saludar("Pepe", 30);
        saludar("Elena", 27);

        System.out.println("Cual es tu nombre?:");
        nombreUsuario = sc.nextLine();
        System.out.println("Cual es tu edad?:");
        edadUsuario = sc.nextInt();
        saludar(nombreUsuario, edadUsuario);
    }

}
