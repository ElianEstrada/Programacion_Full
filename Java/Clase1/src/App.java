public class App {
    public static void main(String[] args) {

        //Esto imprime por pantalla el mensaje

        // Imprimir con salto
        System.out.println("Es un mensaje con slato");

        // Imprimir sin salto
        System.out.print("Es un mensjae sin salto");

        // otro mensaje
        System.out.println("continuacion");

        /*
        Es un mensaje con slato
        Es un mensaje sin slatocontinuacion

        */

        // Como funcionan las variables en Java
        // Lenguaje fuertemente tipado
        // Lenguaje es de tipado estático

        // Tipos de datos 
        /*
         * Enteros -> int (Integer) -> numeros enteros negativos y positivos
         * Flotantes -> float (Float) -> numeros decimales neg y pos
         * Dobles -> double (Double) -> numeros decimales neg y pos pero mas precisos
         * Logicos -> boolean (Boolean) -> verdadero y falso (true, false)
         * Cadenas de texto -> String (String) -> encerradas entre ""
         * Caracteres -> char (Char) -> encerrados entre ''
         */

        // declarando variables

        // <tipo> <nombre> ['=' <valor>] ';'
        int edad = 10;
        String nombre;

        nombre = "Elian";

        System.out.println("Mi nombre es: " + nombre + " y mi edad es: " + edad);

    }
}
