public class Ordenamiento {

    public static void mostrarArreglo(int[] arreglo) {
        for (int i : arreglo){
            System.out.print(i);
        }
        System.out.println();
    }

        /* 3, 2, 5, 1, 4, 8, 6, 7
         * 1, 2, 3, 4, 5, 6, 7, 8
         * 3 > 2 -> hay que cambiarlos
         * 2, 3, 5, 1, 4, 8, 6, 7
         * 3 > 5 -> no hago nada
         * 5 > 1 -> hay que cambiarlos
         * 2, 3, 1, 5, 4, 8, 6, 7
         * 5 > 4 -> hay que cambiarlos
         * 2, 3, 1, 4, 5, 8, 6, 7
         * 5 > 8 -> no hago nada
         * 5 > 6 -> no hago nada
         * 6 > 7 -> no hago nada
         * 
         * 2, 3, 1, 4, 5, 8, 6, 7
         * 
         * 2 > 3 -> no hago nada
         * 3 > 1 -> hay que cambiarlos
         * 2, 1, 3, 4, 5, 8, 6, 7
         * ...
         */
    static int count = 0;

    public static void ordernamientoBurbuja(int[] arreglo) {
        int aux;
        for ( int i = 1; i < arreglo.length; i++){
            for (int j = 0; j < arreglo.length - 1; j++){
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                count++;
            }
            count++;
        }
    }

    public static void ordenamientoInsertar(int[] arreglo) {
        int aux, j;
                                                   // 0  1  2  3  4  5  6  7 
        for (int i = 1; i < arreglo.length; i++) { // 2, 3, 5, 1, 4, 8, 6, 7
            aux = arreglo[i];    // aux = 2; aux=5;
            for (j = i - 1; j >= 0 && arreglo[j] > aux; j--){ // j = 0; 3 > 2; j= 1; 3 > 5;
                arreglo[j + 1] = arreglo[j];    // arreglo[1] = 3;
                count++;
            } // j = -1; j = 1;
            arreglo[j + 1] = aux; // arreglo[0] = 2; arreglo[2] = 5;
            count++;
        } // i=2;
    }

    public static void ordenamientoSeleccion(int[] arreglo){
        int j, k, aux;

        for (int i = 0; i < arreglo.length - 1; i++){
            k = i;
            for (j = i + 1; j <= arreglo.length - 1; j++){
                if (arreglo[j] < arreglo[k]) {
                    k = j;
                }

                if (k != i){
                    aux = arreglo[k];
                    arreglo[k] = arreglo[i];
                    arreglo[i] = aux;
                }

                count++;
            }
            count++;
        }
    }

    public static void main(String[] args) {
        
        /* Métodos de Ordenamiento
         * Ordenamiento por burbuja     (BubbleSort)
         * Ordenamiento por insersion   (InsertSort)
         * Ordenamiento por selección   (SelectSort)
         */

        int[] arreglo = {3, 2, 5, 1, 4, 8, 6, 7};

        mostrarArreglo(arreglo);
        //ordernamientoBurbuja(arreglo);
        //ordenamientoInsertar(arreglo);
        ordenamientoSeleccion(arreglo);
        mostrarArreglo(arreglo);

        System.out.println("Iteraciones: " + count);

    }
}
