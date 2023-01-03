import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        // Entrada desde el teclado 

        /* 'Scanner' <nombre> '=' 'new' 'Scanner' '(' 'System''.''in' ')' ';'
         *  Nota: para que esto funcione es importante importar un paquete
         *  'import' <ruta_paquete> ';' <- fuera de la case
         *  <ruta_paquete>: java.util.Scanner;
         */

        Scanner leer = new Scanner(System.in);

        /* 
         * <nombre>'.'<funcion>
         * <funcion>: permite leer diferentes tipos de informacion
         */

        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();

        System.out.println("Su nombre es: " + nombre + " y su edad es: " + edad);

        leer.close();
    }
}
