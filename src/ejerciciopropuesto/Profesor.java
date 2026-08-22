package ejerciciopropuesto;

public class Profesor extends Persona {

    private String especialidad;

    private static int totalProfesores = 0;

    public Profesor(int id,
                    String nombre,
                    String correo,
                    String especialidad) {

        super(id, nombre, correo);

        this.especialidad = especialidad;

        totalProfesores++;
    }

    @Override
    public String obtenerRol() {
        return "Profesor";
    }

    @Override
    public String mostrarInformacion() {

        return "Profesor: " + getNombre()
                + " | Especialidad: "
                + especialidad;
    }

    public static int getTotalProfesores() {
        return totalProfesores;
    }
}