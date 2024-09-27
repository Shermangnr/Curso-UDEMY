import java.util.Scanner;
public class Main4_while {
    public static void main(String[] args) {
        //Estructura repetitiva 'While'
        Scanner sc = new Scanner(System.in);
        int n;
        int suma = 0;

        System.out.print("Escribe un número entero: ");
        n = sc.nextInt();

        while ( n >= 0) {
            suma += n;
            System.out.print("Escribe otro número entero: ");
            n = sc.nextInt();
        }

        System.out.print("La suma total de los números es: " + suma);
    }
}
