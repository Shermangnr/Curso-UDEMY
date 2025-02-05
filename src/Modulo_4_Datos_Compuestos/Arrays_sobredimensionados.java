package Modulo_4_Datos_Compuestos;
import java.util.Scanner;

public class Arrays_sobredimensionados {
    public static void main (String[] args){
        // Arrays sobredimensionados
        final int CAPACIDAD = 5;
        Scanner sc = new Scanner(System.in);
        int cantidad = 0, posicionABorrar;
        String nombreUsuario;
        String[] nombres = new String[CAPACIDAD];

        System.out.println("Escribe " + CAPACIDAD + " nombres: ");
        for(int i=0; i < CAPACIDAD; i++) {
            nombreUsuario = sc.nextLine();
            if (cantidad < CAPACIDAD) {
                nombres[cantidad] = nombreUsuario;
                cantidad++;
            }
        }
        System.out.println("Los nombres guardados son: ");
        for(int i=0; i < cantidad; i++) {
            System.out.println(nombres[i]);
        }

        //Para borrar alguna posicion
        System.out.println("Escoge una posición para borrar (1 - " + cantidad + "): ");
        posicionABorrar = sc.nextInt();
        posicionABorrar--;

        if (posicionABorrar >= 0 && posicionABorrar < cantidad ) {
            for (int i = posicionABorrar; i < cantidad - 1; i++){
                nombres[i] = nombres[i+1];
            }
            cantidad--;
        }
        else {
            System.out.println("Posicion incorrecta!");
        }

        System.out.println("Ahora los nombres almacenados son: ");
        for(int i = 0; i < cantidad; i++){
            System.out.println(nombres[i]);
        }

        //Ejercicio propuesto
        final int TOTALENTEROS = 10;
        Scanner es = new Scanner(System.in);
        int total = 0, numeroABorrar;
        int numeroUsuario;
        int[] numeros = new int[TOTALENTEROS];

        System.out.println("Digita 5 números: ");
        for(int i=0; i < 5; i++) {
            numeroUsuario = es.nextInt();
            if (total < TOTALENTEROS) {
                numeros[total] = numeroUsuario;
                total++;
            }
        }

        System.out.print("¿Que posición quieres borrar? ");
        numeroABorrar = es.nextInt() - 1;

        if ((numeroABorrar < 0 ) || (numeroABorrar >= total)) {
            System.out.println("¡Posicion no valida!");
        } else {
            for (int i = numeroABorrar; i < total - 1; i++) {
                numeros[i] = numeros[i+1];
            }
            total--;
        }

        System.out.println("Los números que guardas son: ");
        for(int i = 0; i < total; i++) {
            System.out.println(numeros[i]);
        }

    }
}
