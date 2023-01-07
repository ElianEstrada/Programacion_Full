public class App {
    public static void main(String[] args) {

        // Arreglos de 2 o mas dimensiones
        int[][] numeros = new int[2][3]; // 1ra - filas; 2da - columnas;
        /* _______
         * | | | |
         * -------
         * | | | |
         * -------
         */
                        //       1          2  -> filas
        int[][] numeros2 =  { // 0  1  2
                                {1, 2, 3}, // 0
                                {4, 5, 6}  // 1
                            };


        // 3dimensiones // 1ra paginas; 2da filas; 3ra columnas;
        int[][][] numeros4 = new int[2][4][3];

        int[][][] numeros3 =    {
                                    {
                                        {1, 2, 3},
                                        {4, 5, 6},
                                        {7, 8, 9},
                                        {10, 11, 12}
                                    },
                                    {
                                        {13, 14, 15},
                                        {16, 17, 18},
                                        {19, 20, 21},
                                        {22, 23, 24}
                                    }
                                };

        System.out.println(numeros3[0][1][2]); // 6
        System.out.println(numeros3[1][0][1]); // 14

    }
}
