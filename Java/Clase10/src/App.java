import java.util.Scanner;

public class App {

    static Scanner leer = new Scanner(System.in);
    static String[][][] bodegas = new String[3][2][2]; // 3 * 5 * 5 = 75 posiciones

    // Declarar funciones
    /*'public' 'static' <tipo> <nombre> '(' [<lista_parametros>] ')' 
     * '{'
     *      <bloque_codigo>
     * '}'
     * <tipo> -> int, String, bool, float, double...
     * para funciones y procedimientos tenemos un tipo mas 'void' -> nada (vacío)
     * <lista_parametros> -> una lista de declaraciones de variables que serán utilizadas
     * dentro del procedimiento o función separado por comas. (opcional)
     * <bloque_codigo> -> la funcionalidad que cumplira nuetra función o procedimiento
     * 
     * Nota: Cuando es una función es obligatorio devolver algo del tipo de la función
     * con la palabra 'return'
     */

    public static int buscarBodega(String contexto){

        int bodega;

        System.out.print("Ingrese el número de bodega para " + contexto + " [1-3]: ");
        bodega = leer.nextInt();
        //indice = bodega - 1;

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
            
            System.out.println("Producto: " + bodegas[indice][i][0] + " Precio: " + bodegas[indice][i][1]);
        }
    }

    public static void modificarBodega() {

    }

    public static void eliminarProducto() {
        int indice = buscarBodega("eliminar");

        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String producto = leer.nextLine();

        int existe = buscarProducto(indice, producto);

        if (existe != -1) {

            bodegas[indice][existe][0] = null; // nombre
            bodegas[indice][existe][1] = null; // precio

        } else {
            System.out.println("El producto: " + producto + " no existe en esta bodega.");
        }
    }

    public static void main(String[] args) {
        // Tomando en cuenta que nuestro inventario ah crecido
        // ahora se necesita almacenar los productos por bodegas
        // para ello se dinsponen de 3 bodegas y cada bodega puede almacenar
        // 5 productos, de los cuales necesitamos saber la siguiente información:
        // -nombre
        // -precio
        // -costo
        // -existencia
        // -tipo

        
        int opcion = 0;
        int indice;

        //String[][] bodega1 = new String[5][5]; // 25
        //String[][] bodega2 = new String[5][5]; // 25
        //String[][] bodega3 = new String[5][5]; // 25    Total: 75 posiciones

        //String[][][] bodegas = new String[3][2][2]; // 3 * 5 * 5 = 75 posiciones

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
                    modificarBodega();
                    break;
                case 4:
                    eliminarProducto();
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
}
