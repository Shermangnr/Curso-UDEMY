//Entrada de datos por usuario
// Mediante Scanner
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String texto;

        //System.out.println("Escriba un texto: ");
        //texto = sc.nextLine();
        //System.out.println("El texto que escribio es: " + texto);
//
        //int numero;
//
        //System.out.println("Escriba un número: ");
        //numero = sc.nextInt();
        //System.out.println("El número que digito fue: " + numero);

        //Ejercicio
        String nombre;
        int edad;
        float altura;
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        edad = sc.nextInt();
        System.out.println("Ingresa tu altura: ");
        altura = sc.nextFloat();

        System.out.println("Tu nombre es " + nombre + ", tienes " + edad + "y mides " + altura + "metros");


    }
}
