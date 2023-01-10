import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        
        // Creando nuestra entrada de datos
        Scanner leerString = new Scanner(System.in);
        Scanner leerNumber = new Scanner(System.in);

        // Guardar nombre de 5 productos
        String[] nombres = new String[5]; // valor por defecto es null;
        float[] precios = new float[5];
        float[] costos = new float[5];
        int[] existencias = new int[5];

        for (int i = 0; i < nombres.length; i++){
            System.out.print("Ingrese el nombre del producto: ");
            nombres[i] = leerString.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            precios[i] = leerNumber.nextFloat();

            System.out.print("Ingrese el costo del producto: ");
            costos[i] = leerNumber.nextFloat();

            System.out.print("Ingrese la existencia del producto: ");
            existencias[i] = leerNumber.nextInt();
        }

        for (int i = 0; i < nombres.length; i++){
            System.out.println("El nombre del producto es: " + nombres[i] + " y su precio es: " + precios[i]);
        }
    }
}
