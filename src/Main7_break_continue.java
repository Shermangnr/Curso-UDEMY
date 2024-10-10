import java.util.Scanner;
public class Main7_break_continue {
    public static void main(String[] args) {
        // Uso de break y continue
        int dato;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digita un número: ");
            dato = sc.nextInt();

            if (dato < 0)
                break;

            if (dato == 0)
                continue;
            contador++;
        }
        while (true);
        System.out.println("El total de numeros es: " + contador);
    }
}
