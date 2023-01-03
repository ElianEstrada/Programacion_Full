public class App {
    public static void main(String[] args) {

        // Esctructuras de control

        // If - else

        /* 'if' '(' <condicion> ')' '{' <bloque_verdadero> '}'
         * [ 'else' ['if' '(' <condicion ')'] '{' <bloque_falso> '}']
         */

        int edad = 22;

        if (edad < 18) {
            //bloque verdadero
            System.out.println("Usted no es mayor de edad");
        } else if (edad == 18) {
            System.out.println("Usted tiene 18 años");
        } else {
            System.out.println("Usted tiene mas de 18 años, por lo tanto es mayor de edad");
        }

        // Switch - case

        /* 'switch' '(' <variable_a_evaluar> ')' '{' 
         * [ 'case' n ':' <bloque_instrucciones> 'break' ';' ]*n
         * Nota: n es el número de caso
         * [ 'default' ':' <bloque_instrucciones> 'break' ';' ]
         * '}'
         */

        int opcion = 0;

        switch(opcion){
            case 0:
            case 1:
                System.out.println("Opción 0 y 1");
                System.out.println("Ahasta aquí llego");
                break;
            case 2:
                System.out.println("Opción 2");
                break;
            case 3, 4: // or 3 or 4 (si opcion == 3 or opcion == 4)
                System.out.println("Opción 3 y 4");
                break;
            default:
                System.out.println("Caso por defecto");
                break;
        }

        // Ciclos

        // Ciclo While

        /* 'while' '(' <condicion> ')' '{' 
         *      <bloque_instrucciones>
         * '}'
         */

        int contador = 0;

        while (contador < 10 ){
            System.out.println(contador);
            contador++; // ++ -> contador = contador + 1; ( += 1)
        }
    }
}
