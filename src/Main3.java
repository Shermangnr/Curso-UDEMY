import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Tipo de datos booleano
        int a = 3, b = 5, c = 8;

        boolean e1 = a < 2 && b >=5 || c == 8;
        boolean e2 = a < 2 && (b >= 5 || c == 8);
        boolean e3 = ! (a < 2) && (b >= 5 || c == 8);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Estructura condicional if
        int numero1, numero2, numero3 ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        numero1 = sc.nextInt();
        System.out.print("Escribe el segundo número: ");
        numero2 = sc.nextInt();
        System.out.print("Escribe el tercer número: ");
        numero3 = sc.nextInt();

        if (numero1 > 0 && numero2 > 0 && numero3 > 0) {
            System.out.println("Los tres números son positivos");
        }
        else if (numero1 <= 0 && numero2 <= 0 && numero3 <= 0) {
            System.out.println("Ningun número es positivo");
        }
        else {
            System.out.println("Algunos números son positivos y otros son negativos");
        }

        //Estructura condicional switch
        String meses;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Escribe un mes del año para saber la cantidad de días: ");
        meses = sc2.nextLine();
        switch (meses) {
            case "ENERO":
            case "MARZO":
            case "MAYO":
            case "JULIO":
            case "AGOSTO":
            case "OCTUBRE":
            case "DICIEMBRE":
                System.out.println("Este mes tiene 31 días");
                break;
            case "FEBRERO":
                System.out.println("Este mes tiene 28 días");
                break;
            case "ABRIL":
            case "JUNIO":
            case "SEPTIEMBRE":
            case "NOVIEMBRE":
                System.out.println("Este mes tiene 30 días");
                break;
            default:
                System.out.println("No es un mes valido! Verifica.");

        }

        //Operadores ternarios
        int n;
        boolean esMultiploDeTres;
        String respuesta;
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Escribre un número cualquiera: ");
                n = sc3.nextInt();
        if (n % 3 == 0)
            esMultiploDeTres = true;
        else
            esMultiploDeTres = false;
        System.out.println("Es multiplo de 3?: " + esMultiploDeTres);

        if (n % 3 == 0)
            respuesta = "Sisas";
        else
            respuesta = "Nokas";
        System.out.println("Es multiplo de 3?: " + respuesta);

        esMultiploDeTres = (n % 3 == 0) ? true : false;
        System.out.println("Es multiplo de 3?: " + esMultiploDeTres);

        respuesta = n % 3 == 0 ? "Si señor" : "No señor";
        System.out.println("Es multiplo de 3?: " + respuesta);
    }
}
