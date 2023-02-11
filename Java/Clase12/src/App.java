import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Errores de escritura
        // que no se declaro una variable, 
        // que los tipos no coinciden

        // Errores en tiempo de ejecución
        // divisiones por 0
        // divide 2 numeros ingresados por el usuario
        // num1 = 2; num2 = 0; num1 / num2; -> que no es posible 
        // dividir por cero

        /* try - catch (inteta - captura)
         * 
         * 'try' 
         * '{'
         *  <bloque_codigo>  -> lo que puede generar una Excepción
         * '}'
         * 'catch' '(' <Tipo_Excepcion> <nombre> ')' 
         * '{'
         *      <bloque_codigo> -> lo que se haría si fallamos
         * '}'
         * [
         * 'finally' 
         * '{'
         *      <bloque_codigo> -> para cuando tenemos algo que cerrar.
         * '}'
         * ]
         * 
         * Nota: el bloque catch pueden ser varios
         */

        Scanner leer = new Scanner(System.in);
        int num1, num2;

        // System.out.print("Ingrese un número: ");
        // num1 = leer.nextInt();

        // System.out.print("Ingrese otro número: ");
        // num2 = leer.nextInt();

        // if (num2 != 0){
        //     System.out.println("Division: " + (num1 / num2));
        // } else {
        //     System.out.println("La division por 0 no es posible");
        // }

        int[] numeros = new int[5];

        // try {
        //     System.out.println("Division: " + (num1 / num2));
        //     System.out.println(numeros[5]);
        // } catch (ArithmeticException exp) {
        //     System.out.println("La division por 0 no es posible.");
        // } catch (IndexOutOfBoundsException exp) {
        //     System.out.println("Se sobrepaso el rango de posiciones");
        // }

        String numero;
        System.out.print("Ingrese un número: ");
        numero = leer.nextLine();

        try {
            System.out.println("La suma de 2 + " + numero + " = " + (2 + Integer.valueOf(numero)));
        } catch (NumberFormatException exp) {
            System.out.println("El valor: " + numero + " no puede ser convertido a numero.");
        }

        System.out.println("Hasta pronto");
    }
}
