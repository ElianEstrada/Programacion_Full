public class App {
    public static void main(String[] args) {

        // Do - While
        /* 'do' '{'
         *  <bloque_instrucciones>
         * '}' 'while' '(' <condicion> ')' ';'
         */

        int contador = 1;

        do {
            System.out.println(contador);

            contador++;
        } while(contador <= 0);

        // For

        /* 'for' '(' <inicializacion> ';' <condicion> ';' <paso> ')'
         * '{'
         *      <bloque_instrucciones>
         * '}'
         */

        /*
         * <inicializacion>: puede ser una o varias declaraciones o asginaciones 
         * <condicion>: condicion de finalizacion (puede ser compuesta)
         * <paso>: es como va incrementar o decrementar las variables del bloque de inicializacion
         */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0, j = 10; i < 10 && j > 0; i++, j--) {
            System.out.println("i: " + i + " j: " + j);
        }

    }
}
