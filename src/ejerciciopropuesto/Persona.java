package ejerciciopropuesto;

public abstract class Persona {

    private int id;
    private String nombre;
    private String correo;

    private static int totalPersonas = 0;

    public Persona(int id,
                   String nombre,
                   String correo) {

        this.id = id;
        this.nombre = nombre;
        this.correo = correo;

        totalPersonas++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public static int getTotalPersonas() {
        return totalPersonas;
    }

    public abstract String obtenerRol();

    public abstract String mostrarInformacion();
}