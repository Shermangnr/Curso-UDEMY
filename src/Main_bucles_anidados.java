import java.util.Scanner;
public class Main_bucles_anidados {
    public static void main (String []args) {
    //Como usar bucles anidados
    Scanner sc = new Scanner(System.in);
    Scanner s = new Scanner(System.in);
    int n;
    int suma = 0;

    System.out.print("Digita el ancho del triangulo: ");
    int ancho = sc.nextInt();

    for (int fila = 1; fila <= ancho; fila++) {
        for (int columna = 1; columna <= fila; columna++){
            System.out.print("*");
        }
        System.out.println();
    }

    for (int i = 1; i <= 10; i++){
        do {
            System.out.print("Digita un numero positivo: ");
            n = s.nextInt();
        }
        while (n <= 0);
        suma += n;
    }
        System.out.print("La suma total es " + suma);
    }
}
