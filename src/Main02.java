//Entrada de datos por usuario
// Mediante Scanner
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String texto;

        //System.out.println("Escriba un texto: ");
        //texto = sc.nextLine();
        //System.out.println("El texto que escribio es: " + texto);
//
        //int numero;
//
        //System.out.println("Escriba un número: ");
        //numero = sc.nextInt();
        //System.out.println("El número que digito fue: " + numero);

        //Ejercicio
        //Scanner sc = new Scanner(System.in);
//
        //System.out.println("Ingresa tu edad: ");
        //byte edad = sc.nextByte();
        //sc.nextLine();
        //System.out.println("Ingresa tu nombre: ");
        //String nombre = sc.nextLine();
        //System.out.println("Ingresa tu estarura: ");
        //float estatura = sc.nextFloat();
//

        //System.out.printf("Tu nombre es %s, tienes %d años y mides %4.2f metros", nombre, edad, estatura);
        // String nombre;
        // int edad;
        // float altura;
        // System.out.println("Ingresa tu nombre: ");
        // nombre = sc.nextLine();
        // System.out.println("Ingresa tu edad: ");
        // edad = sc.nextInt();
        // System.out.println("Ingresa tu altura: ");
        // altura = sc.nextFloat();
//
        // System.out.printf("Tu nombre es " + nombre + ", tienes " + edad + "y mides " + altura + " metros");
        // System.out.printf("Tu nombre es %s, tienes %d años y mides %4.2f metros", nombre, edad, altura);


        // Conversion entre tipos simples (typecast)
        int numero = 3;
        float numero2 = 8.6987f;
        int numero3 = (int)numero2;
        float numero4 = (float)numero;

        System.out.println(numero3);
        System.out.println(numero4);

        byte b1 = 6, b2 = 9;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        int nota1 = 10, nota2 = 5;
        int suma = nota1 + nota2;
        float media = (float)suma / 2;
        System.out.println("La media de esta operación es: " + media);

        // Conversion de cadenas de texto
        //int nota3, nota4;
        //String textoNota3, textoNota4;
        //System.out.println("Escribe la primera nota: ");
        //textoNota3 = System.console().readLine();
        //nota3 = Integer.parseInt(textoNota3);
        //System.out.println("Escribe la segunda nota: ");
        //textoNota4 = System.console().readLine();
        //nota4 = Integer.parseInt(textoNota4);
        //int sumaNotas = nota3 + nota4;
        //float mediaNotas = (float)sumaNotas / 2;
        //System.out.println("La media de las notas es: "+ mediaNotas);

        //Si el codigo necesita ser mas compacto
        //int nota5, nota6;
        //System.out.println("Escribe la tercera nota: ");
        //nota5 = Integer.parseInt(System.console().readLine());
        //System.out.println("Escribe la cuarta nota: ");
        //nota6 = Integer.parseInt(System.console().readLine());
        //int sumaNotas2 = nota5 + nota6;
        //float mediaNotas2 = (float)sumaNotas2 / 2;
        //System.out.println("La media de las notas es: "+ mediaNotas2);

        //Ejercicio
        //Scanner ingreso = new Scanner(System.in);

        //Primera forma
        //System.out.println("Ingresa un número:");
        //int n1 = ingreso.nextInt();
        //System.out.println("Ingresa otro número:");
        //int n2 = ingreso.nextInt();
        //System.out.println("La division entre ambos números es :" + ((float)n1/n2));

        //Segunda forma
        //ingreso.nextLine();
        //System.out.println("Repetiremos el proceso...");
        //System.out.println("Ingresa un número:");
        //int n11 = Integer.parseInt(ingreso.nextLine());
        //System.out.println("Ingresa otro número");
        //int n22 = Integer.parseInt(ingreso.nextLine());
        //System.out.println("Confirmamos que la division de ambos números es: " + ((float)n11/n22));

        //Operadores de autoincremento y autodecremento
        int n = 1, a = 3, b = 4;
        a = b + n++;
        n *= 3;
        n = n + a + b * a;

        System.out.println(n);

        int n1 = 5, m = 5, p = 2;
        m = m / p;
        m += ++n1;
        n *= p + m;

        System.out.println(n1);

    }
}
