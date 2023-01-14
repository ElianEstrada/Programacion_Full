import java.util.Scanner;

public class App {
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

        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int bodega, indice;

        String[][] bodega1 = new String[5][5]; // 25
        String[][] bodega2 = new String[5][5]; // 25
        String[][] bodega3 = new String[5][5]; // 25    Total: 75 posiciones

        String[][][] bodegas = new String[3][5][5]; // 3 * 5 * 5 = 75 posiciones

        do {
            System.out.println("\n=========== MENU PRINCIPAL ===========");
            System.out.println("1. Llenar Bodega.");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opcion [1-2]: ");
            opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Ingrese el número de bodega a llenar [1-3]: ");
                    bodega = leer.nextInt();
                    indice = bodega - 1;

                    leer.nextLine();
                    for (int i = 0; i < bodegas[indice].length; i++){
                        System.out.print("Ingrese el nombre del producto: ");
                        bodegas[indice][i][0] = leer.nextLine();

                        System.out.print("Ingrese el precio del producto: ");
                        bodegas[indice][i][1] = leer.nextLine();
                    }

                    break;
                case 2:
                    System.out.println("Hasta Pronto :)");
                    break;
                default:
                    // erro del usuario
                    System.out.println("La opcion que escogio no es valida :(");
            }
        } while (opcion != 2);
    }
}
