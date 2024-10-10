//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main01 {
    public static void main(String[] args) {

        // Tipos de datos simples
        // /n Se utiliza para hacer saltos de linea
        // /t Se utiliza para hacer tabulaciones
        String texto = "Hola";
        System.out.println(texto);

        //Ejercicio
        String vocalesMayususculas = "A\tE\tI\tO\tU";
        String vocalesMinusculas = "a e i o u";
        String resultado = vocalesMayususculas + "\n" + vocalesMinusculas;
        System.out.println(vocalesMayususculas + "\n" + vocalesMinusculas);
        System.out.println(resultado);

        //Comentarios en codigo
        // Comentario de una linea
        /* Esto podria ser un comentario
        de varias lineas
        en el codigo */

        //-----------

        //Salidas de datos por pantalla Syste.out.printf
        /*
        * Marcas de formato:
        * %d para mostrar datos numericos enteros
        * %f para mostrar datos numericos reales
        * %s para mostrar cadenas de texto
        * %c para mostrar caracteres
        * %xd para mostrar al menos x cifras numericas completando datos a la izquierda si no los hay
        * %0xd para mostrar al menos x cifras numercias completando con ceros a la izquierda si no los hay
        */

        float valorPi = 3.1416f;
        int radioCirculo = 23;
        float longitudCirculo = 2 * valorPi * radioCirculo;

        System.out.printf("La circunferencia de radio %d mide %4.2f", radioCirculo, longitudCirculo);

    }
}


