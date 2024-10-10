package Modulo_4_Datos_Compuestos;
import java.util.Scanner;

public class Busqueda_Arrays {
    public static void main(String[] args){
        //Buscar elementos en el array
        Scanner sc = new Scanner(System.in);
        int[] numerosUsuario = new int[10];
        int maximo, minimo, total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe a continuación 10 números #" + (i+1) + ": ");
            numerosUsuario [i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            total += numerosUsuario[i];
        }

        maximo = minimo = numerosUsuario[0];
        for (int i = 1; i < 10; i++) {
            if (numerosUsuario[i] > maximo) {
                maximo = numerosUsuario[i];
            }
        }

        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
        System.out.println("La media es : " + (total/10.0));
    }
}
