package actividad1;

public class Coche {

    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double precio;
    private int velocidadMaxima;
    private int potenciaMotor;
    private boolean enMarcha;

    public Coche() {
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
        this.anioFabricacion = 0;
        this.precio = 0.0;
        this.velocidadMaxima = 0;
        this.potenciaMotor = 0;
        this.enMarcha = false;
    }

    public Coche(String modelo, int velocidadMaxima, int potenciaMotor) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.potenciaMotor = potenciaMotor;
        this.enMarcha = false;
    }

    public Coche(String marca, String modelo, int anioFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.enMarcha = false;
    }

    public boolean aplicarDescuento(double descuento) {
        if (anioFabricacion < 2010) {
            precio = precio - (precio * descuento / 100);
            return true;
        }

        return false;
    }

    public void encender() {
        enMarcha = true;
        System.out.println("El coche " + marca + " " + modelo + " se ha encendido.");
    }

    public void acelerar() {
        if (enMarcha) {
            System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
        } else {
            System.out.println("Primero debe encender el coche.");
        }
    }

    public void frenar() {
        if (enMarcha) {
            System.out.println("El coche " + marca + " " + modelo + " está frenando.");
        } else {
            System.out.println("El coche está apagado.");
        }
    }

    public void apagar() {
        enMarcha = false;
        System.out.println("El coche " + marca + " " + modelo + " se ha apagado.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca
                + ", modelo=" + modelo
                + ", año=" + anioFabricacion
                + ", precio=S/." + precio + "]";
    }
}