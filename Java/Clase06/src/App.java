public class App {
    public static void main(String[] args) {

        // Recorridos de arreglos
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Arreglo de 1 dimension:");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        int[][] numeros2 = { {1, 2}, {3, 4}, {5, 6}};

        System.out.println("\nArreglo de 2 dimensiones:");
        for (int i = 0; i < numeros2.length; i++) {
            for (int j = 0; j < numeros2[i].length; j++){
                System.out.print(numeros2[i][j] + " ");
            }
        }

        int[][][] numeros3 = { { {1, 2, 3}, {4, 5, 6} }, { {7, 8, 9}, {10, 11, 12} }, { {13, 14, 15}, {16, 17, 18} }};

        System.out.println("\nArreglo de 3 dimensiones:");
        for (int i = 0; i < numeros3.length; i++){                  // i 0 -> 2
            for (int j = 0; j < numeros3[i].length; j++){           // j 0 -> 1
                for (int k = 0; k < numeros3[i][j].length; k++){    // k 0 -> 2
                    System.out.print(numeros3[i][j][k] + " ");
                }
            }
        }

    }
}
