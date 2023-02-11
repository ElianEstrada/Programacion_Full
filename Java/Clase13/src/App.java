public class App {

    public static int exponente(int base, int exponente) {

        if (exponente == 1) {
            return base;
        }

        return base * exponente(base, exponente - 1);
    }

    public static void main(String[] args) {

        /* 2^5 = 32
         * 2 * 2 * 2 * 2 * 2
         * 2 * 2 -> 2 * 2^1
         * 2 * 2 * 2 -> 2 * 2^2
         * 2 * 2 * 2 * 2 -> 2 * 2^3
         * 2 * 2 * 2 * 2 * 2 -> 2 * 2^4 
         * a^n -> a * a^(n-1)
         * caso base -> exponente es 1 -> devolvemos el mismo número
         * exponente es 0 -> devolvemos 1
         */
        System.out.println(exponente(2, 5));
    }
}
