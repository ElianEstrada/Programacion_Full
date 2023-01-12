import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // ejemplo tipo Object
        /*Object var1 = 1;
        var1 = 10.5;
        var1 = "Hola";*/

        // instanceof

        /*if (var1 instanceof String){
            
        }*/

        /*Se necesita ingresar 5 productos con los siguientes campos:
            - nombre
            - precio
            - costo
            - existencia
         */ 

        Scanner leer = new Scanner(System.in);

        String[][] productos = new String[5][4];

        for ( int i = 0; i < productos.length; i++){
            System.out.print("Ingrese el nombre: ");
            productos[i][0] = leer.nextLine();
            
            System.out.print("Ingrese el precio: ");
            productos[i][1] = leer.nextLine();
            
            System.out.print("Ingrese el costo: ");
            productos[i][2] = leer.nextLine();

            System.out.print("Ingrese las existencias: ");
            productos[i][3] = leer.nextLine();
        }

        for (int i = 0; i < productos.length; i++){
            System.out.println("El producto: " + productos[i][0] +
            " con Precio: " + productos[i][1] + " con costo: " + productos[i][2] +
            " y existencias: " + productos[i][3]);
        }

        // Convertir tipos de dato -> es pasar un tipo de dato a otro (int -> String)
        // Conversion implicita -> no requiere de instrucciones (int -> float)
        // Conversion explicita -> si requiere de una instruccion clara

        System.out.println(Integer.parseInt("10") + 1);   // (<tipo_a_convertir>)  -> (int)
                                        // es utilizando las mismas propiedades del tipo
        // int -> Integer
        // float -> Float
        // double -> Double

        leer.close();
    }
}
