public class Vehiculo {
    
    //atributos
    public String marca;
    public int modelo;
    public String color;

    // constructor
    public Vehiculo(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //acciones
    public void arrancar(){
        System.out.println("El vehículo arranco");
    }

    public void avanzar(){
        System.out.println("El vehículo esta avanzando");
    }

    public void apagar() {
        System.out.println("El vehículo se apago");
    }
}
