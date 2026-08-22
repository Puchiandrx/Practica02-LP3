package actividad4;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;

    private Cuenta cuenta;

    public Persona(int id,
                   String nombre,
                   String apellido,
                   int numeroCuenta) {

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;

        this.cuenta = new Cuenta(numeroCuenta);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id
                + ", nombre=" + nombre
                + ", apellido=" + apellido
                + ", " + cuenta + "]";
    }
}