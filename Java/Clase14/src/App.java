
public class App {
    public static void main(String[] args) {

        /* Clase
         * Es una plantilla que tiene propiedades y acciones
         */

        /* Objeto
         * Utilizar la clase para algo específico
         * (crear una instancia)
         */

        /* Programación Orientada a Objetos ( POO| OOP )
         * Nos dice que nosotros podemos modelar
         * el mundo real a través de clases y objetos
         */

        // Crear un objeto de tipo Vehículo
        Vehiculo vh1 = new Vehiculo("Toyota", 1995, "Blanco");

        System.out.println("El vehículo es de marca: " + vh1.marca);
        System.out.println("El vehículo es modelo: " + vh1.modelo);
        System.out.println("El vehículo es de color: " + vh1.color);

        vh1.arrancar();
        vh1.avanzar();
        vh1.apagar();

        Vehiculo vh2 = new Vehiculo("Mazda", 2001, "Verde");

        System.out.println("El vehículo es de marca: " + vh2.marca);
        System.out.println("El vehículo es modelo: " + vh2.modelo);
        System.out.println("El vehículo es de color: " + vh2.color);

        vh2.arrancar();
        vh2.avanzar();
        vh2.apagar();
    }
}
