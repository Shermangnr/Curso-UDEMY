package Modulo_4_Datos_Compuestos;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Como usar y definir Arrays
        Scanner sc = new Scanner (System.in);
        int numero;
        int [] datoUsuario;

        System.out.print("Escribe un número entero: ");
        numero = sc.nextInt();
        datoUsuario = new int[numero];

        for (int i = 0; i < numero; i++){
            System.out.print("Ahora escribe el dato número " + (i+1) + ": ");
            datoUsuario [i] = sc.nextInt();
        }
        System.out.print("De los datos suministrados son multiplos de 3: ");
        int datosEncontrados = 0;
        for (int i = 0; i < numero; i++) {
            if (datoUsuario[i] % 3 == 0){
                datosEncontrados ++;
                if (datosEncontrados > 1)
                    System.out.print(",");
                System.out.print(datoUsuario[i]);
            }
        }
        if (datosEncontrados == 0 )
            System.out.println("Ninguno!");
    }
}
