import java.util.Scanner;
public class Main_recomendaciones {
    public static void main (String[] args) {
        //Recomendaciones de uso para cada tipo de bucle
        int n;
        int divisorActual;
        boolean esPrimo = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digita un número para saber si es primo: ");
        n = sc.nextInt();
        if (n == 1)
            esPrimo = false;

        divisorActual = 2;
        while ((divisorActual < n) && esPrimo) {
            if (n % divisorActual == 0)
                esPrimo = false;
                divisorActual++;
        }
        if (esPrimo)
            System.out.print("Si es un número primo");
        else
            System.out.print("No es un número primo");


    }
}
