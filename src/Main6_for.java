import java.util.Scanner;
public class Main6_for {
    public static void main(String[] args) {
        //Estructura repetitiva for
        Scanner sc = new Scanner(System.in);
        int dato;
        double suma =0;

        for (int i=1; i<=10; i++ ) {
            System.out.print("Digita el dato número "+i+": ");
            dato = sc.nextInt();
            suma += dato;
        }
        System.out.println("La media es: "+ suma / 10);

    }
}
