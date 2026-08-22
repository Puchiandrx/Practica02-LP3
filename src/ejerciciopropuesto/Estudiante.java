package ejerciciopropuesto;

import java.util.ArrayList;
import java.util.List;

public class Estudiante
        extends Persona
        implements Inscribible {

    public static final int MAXIMO_CURSOS = 6;

    private String carrera;

    private List<Curso> cursos;

    private static int totalEstudiantes = 0;

    public Estudiante(int id,
                      String nombre,
                      String correo,
                      String carrera) {

        super(id, nombre, correo);

        this.carrera = carrera;

        this.cursos = new ArrayList<>();

        totalEstudiantes++;
    }

    @Override
    public boolean inscribirCurso(Curso curso) {

        if (cursos.size() >= MAXIMO_CURSOS) {
            return false;
        }

        if (curso.inscribirEstudiante(this)) {

            cursos.add(curso);

            return true;
        }

        return false;
    }

    @Override
    public String obtenerRol() {
        return "Estudiante";
    }

    @Override
    public String mostrarInformacion() {

        return "Estudiante: " + getNombre()
                + " | Carrera: " + carrera
                + " | Cursos: " + cursos.size();
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }
}