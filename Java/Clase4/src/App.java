import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Arreglos
        /* <tipo> '['']' <nombre> ';'
         * Primera forma
         * <tipo> '['']' <nombre> '=' 'new' <tipo> '[' <tamaño> ']' ';'
         * Nota: <tipo> deben ser iguales y <tamaño> debe ser un expresion entero
         *  
         * Segunda forma
         * <tipo> '['']' <nombre> '=' '{' <valores_separados_por_coma> '}' ';'
         * 
         */


        int[] edades = new int[5]; // | | | | | |
        int[] manzanas = { 2, 3, 1, 5, 6 };

        System.out.println(edades[0]);
        System.out.println(manzanas[0]);
        
        //manzanas = {4, 2, 1, 3, 2}; -> esto es un error
        // edades = new int[] {1, 2, 3, 4}; -> esto es correcto

        edades = new int[6];
        System.out.println(edades[5]);

        // Obtener el tamaño de un arreglo
        // <nombre>'.''length'

        for (int i = 0; i < edades.length; i++) {
            System.out.print("Ingrese una edad: ");
            edades[i] = leer.nextInt();
        }

        // Mostrando los valores del arreglo edades
        for (int i = 0; i < edades.length; i++){
            System.out.println(edades[i]);
        }

        // Ciclo ForEach
        /*
         * 'for' '(' <tipo> <nombre> ':' <iterable> ')'
         * '{'
         *      <bloque_instrucciones>
         * '}'
         */

        for ( int edad : edades ) {
            System.out.println(edad);
        }

        // tipo de dato String -> arreglo de caracteres
        String nombre = "Elian Estrada"; // char[] nombre = {'E', 'l', 'i', 'a', 'n', ' ', 'E', 's'};....
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }


    }
}
