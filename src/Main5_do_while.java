import java.util.Scanner;
public class Main5_do_while {
    public static void main(String[] args) {
        //Estructura do..while
        int n;
        int suma = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digita un numero entero: ");
            n = sc.nextInt();
            contador++;
            if (n >= 0) {
                suma += n;
            }
        } while ((n >= 0) && (contador < 5));

        System.out.println("La suma total es: " + suma);

    }
}
