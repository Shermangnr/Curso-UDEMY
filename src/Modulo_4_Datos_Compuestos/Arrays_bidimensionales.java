package Modulo_4_Datos_Compuestos;
import java.util.Scanner;
public class Arrays_bidimensionales {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] datos = new int [3][4];

        for (int i= 0; i < datos.length; i++) {
            for (int j= 0; j < datos[i].length; j++) {
                System.out.printf("Escribe los datos de la fila %d y columna %d: ", i+1, j+1);
                datos[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("El array completo quedo así:");

        for (int i= 0; i < datos.length; i++) {
            for (int j= 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }

        int [][] arrayDeArrays = new int[3][];
        arrayDeArrays[0] = new int[3];
        arrayDeArrays[1] = new int[5];
        arrayDeArrays[2] = new int[4];

        for (int i= 0; i < arrayDeArrays.length; i++) {
            for (int j= 0; j < arrayDeArrays[i].length; j++) {
                System.out.printf("Escribe los datos de la fila %d y columna %d: ", i+1, j+1);
                arrayDeArrays[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("El array de arrays completo quedo así:");

        for (int i= 0; i < arrayDeArrays.length; i++) {
            for (int j= 0; j < arrayDeArrays[i].length; j++) {
                System.out.print(arrayDeArrays[i][j] + " ");
            }
            System.out.println();
        }

        int [][] otroArray = {
                {1, 2, 3},
                {4, 5, 7, 8, 9},
                {1, 1, 1, 1}
        };

        System.out.print("Este es Array con datos predefinidos: ");
        for ( int i = 0; i < otroArray.length; i++) {
            for (int j= 0; j < otroArray[i].length; j++) {
                System.out.print(otroArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
