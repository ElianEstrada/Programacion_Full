import java.math.BigInteger;

public class Recursividad {

    static int llamadas = 0;

    public static BigInteger factorial(BigInteger num){
        llamadas++;
        if (num.equals(BigInteger.ZERO)){ // esto rompe el bucle (salida)
            return BigInteger.ONE;
        }

        //return num * factorial(num - 1); // calcula el factorial
        return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }


    public static void main(String[] args) {
        // Factorial de un número
        // 4! -> 4*3*2*1 -> 24 
        // 6! -> 6*5*4*3*2*1 -> 720

        // La recursividad es una forma de crear
        // funciones que se llamen a si mismas.

        // Lo principal para poder crear una función
        // recursiva, es tener un parametro de salida
        // (caso base).

        System.out.println(factorial(new BigInteger("100")));
        System.out.println("Cantidad de llamadas: " + llamadas);
    }
}
