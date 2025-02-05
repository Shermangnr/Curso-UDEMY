package Modulo_4_Datos_Compuestos;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringBuilder_StringJoiner {
    public static void main (String[] args) {
        //Uso de StringBuilder
        // Concatena de manera eficiente cadenas de texto ahorrando espacio en memoria
        StringBuilder sb = new StringBuilder("Hola"); //Se construye el String builder
        sb.append(" tardes");                         //Se añade la palabra "tardes"
        sb.insert(4, " buenas");            //Se inserta desde la posicion 4 de la palabra "Hola" la palabra "buenas"
        System.out.println(sb.toString());            //Se muestra el resultado de las operaciones anteriores
        System.out.println(sb.indexOf("tardes"));     //Se muestra la posición en la que empieza la palabra "tardes"
        System.out.println(sb.substring(5 , 11));     //Se muestra la palabra que esta desde la posicion 5 hasta la 11
        sb.delete(5, 12);                             //Se elimina la palabra que esta desde la posición 5 hasta la 12
        System.out.println(sb.toString());            //Se muestra el nuevo resultado de la oración

        //Uso de StringJoiner
        //Corta las cadenas de texto con un determinado delimitador
        StringJoiner nombres = new StringJoiner(" - ");
        nombres.add("Juan");
        nombres.add("Isabel");
        nombres.add("Elena");
        System.out.println(nombres.toString());

        //Ejercicio
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase: ");
        String respuesta = sc.nextLine();
        StringBuilder frases = new StringBuilder(respuesta);

        do {
            System.out.println("Escribe otra frase: ");
            respuesta = sc.nextLine();
            if ( ! respuesta.equals("")) {
                frases.append("\n");
                frases.append(respuesta);
            }

        }
        while (! respuesta.equals(""));
        System.out.println("Se ha escrito: ");
        System.out.println(frases);

        String[] fragmentos = frases.toString().split("\n");
        StringJoiner fraseFinal = new StringJoiner(", ");
        for(String fragmento : fragmentos) {
            fraseFinal.add(fragmento);
        }
        System.out.println(fraseFinal);

    }
}
