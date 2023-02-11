import java.util.Scanner;

public class App {

    static Scanner leer = new Scanner(System.in);
    //static String[][][] bodegas = new String[3][2][2];
    static String[][][] bodegas =   {{ {"Prod1", "15", "10"}, {"Prod2", "16", "11.5"} }, { {"Prod3", "8", "4.5"}, {"Prod4", "5.5", "2.75"} }, { {"Prod5", "17.5", "12"}, {"Prod6", "20", "14.5"} }};

    public static void main(String[] args) {
        // Tomando en cuenta que nuestro inventario ah crecido
        // ahora se necesita almacenar los productos por bodegas
        // para ello se dinsponen de 3 bodegas y cada bodega puede almacenar
        // 2 productos, de los cuales necesitamos saber la siguiente información:
        // -nombre
        // -precio
        // -costo

        
        int opcion = 0;

        do {
            System.out.println("\n=========== MENU PRINCIPAL ===========");
            System.out.println( "1. Llenar Bodega.\n2. Ver Bodega.\n3. Modificar Bodega.\n"+
                                "4. Eliminar Producto.\n5. Salir.");
            //System.out.println("2. Ver Bodega.");
            //System.out.println("3. Salir.");
            System.out.print("Ingrese una opcion [1-5]: ");
            opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    llenarBodega();
                    break;
                case 2:
                    verBodega();
                    break;
                case 3:
                    modificarEliminar(true, "modificar");
                    break;
                case 4:
                    modificarEliminar(false, "eliminar");
                    break;
                case 5:
                    System.out.println("Hasta Pronto :)");
                    break;
                default:
                    // error del usuario
                    System.out.println("La opcion que escogio no es valida :(");
            }
        } while (opcion != 5);
    }

    public static int buscarBodega(String contexto){

        int bodega;

        System.out.print("Ingrese el número de bodega para " + contexto + " [1-3]: ");
        bodega = leer.nextInt();

        leer.nextLine();

        return bodega - 1;
    }

    /*
     * Función que busca el producto por nombre en una bodega específica
     * y devuelve la posicón del producto si este existe
     * o -1 si no existe.
     */
    public static int buscarProducto(int bodega, String producto){

        for (int i = 0; i < bodegas[bodega].length; i++) {
            if (bodegas[bodega][i][0].equals(producto)){
                return i;
            }
        }

        //si llega aquí quiere decir que el producto no existe en esa bodega
        return -1; 
    }

    public static void llenarBodega(){
        int indice = buscarBodega("llenar");

        for (int i = 0; i < bodegas[indice].length; i++){
            System.out.print("Ingrese el nombre del producto: ");
            bodegas[indice][i][0] = leer.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            bodegas[indice][i][1] = leer.nextLine();
        }
    }

    public static void verBodega(){
        int indice = buscarBodega("ver");

        System.out.println("Bodega - " + (indice + 1));
        for (int i = 0; i < bodegas[indice].length; i++){
            if (bodegas[indice][i][0] != null){
                System.out.println("Producto: " + bodegas[indice][i][0] + " Precio: " + bodegas[indice][i][1]);
            }
        }
    }

    public static void modificarEliminar(boolean bandera, String contexto){

        int indice = buscarBodega(contexto);

        System.out.println("Ingrese el nombre del producto a " + contexto + ": ");
        String producto = leer.nextLine();

        int existe = buscarProducto(indice, producto);

        if (existe != -1) {

            if (bandera) { // modificar
                modificarProducto(indice, existe);
            } else { // eliminar
                eliminarProducto(indice, existe);
            }

        } else {
            System.out.println("El producto: " + producto + " no existe en esta bodega.");
        }
    }

    public static void modificarProducto(int indice, int existe) {

        // Agregar aquí el código para modificar el producto.

        System.out.println("El producto fue modificado exitosamente :)");

    }

    public static void eliminarProducto(int indice, int existe) {
    
        bodegas[indice][existe][0] = null; // nombre
        bodegas[indice][existe][1] = null; // precio

        System.out.println("El producto fue eliminado exitosamente :)");
    }

}
