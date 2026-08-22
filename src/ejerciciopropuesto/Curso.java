package ejerciciopropuesto;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    public static final int CUPO_MAXIMO = 30;

    private static int totalCursos = 0;

    private String codigo;
    private String nombre;

    private Profesor profesor;
    private Categoria categoria;

    private Horario horario;

    private List<Estudiante> estudiantes;

    public Curso(String codigo,
                 String nombre,
                 Profesor profesor,
                 Categoria categoria,
                 String dia,
                 String horaInicio,
                 String horaFin) {

        this.codigo = codigo;
        this.nombre = nombre;

        this.profesor = profesor;
        this.categoria = categoria;

        this.horario =
                new Horario(
                        dia,
                        horaInicio,
                        horaFin);

        this.estudiantes =
                new ArrayList<>();

        totalCursos++;
    }

    public boolean inscribirEstudiante(
            Estudiante estudiante) {

        if (estudiantes.size() >= CUPO_MAXIMO) {
            return false;
        }

        if (estudiantes.contains(estudiante)) {
            return false;
        }

        estudiantes.add(estudiante);

        return true;
    }

    public boolean estaDisponible() {

        return estudiantes.size()
                < CUPO_MAXIMO;
    }

    public int cantidadEstudiantes() {

        return estudiantes.size();
    }

    public static int getTotalCursos() {
        return totalCursos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {

        return codigo
                + " - " + nombre
                + " | Profesor: "
                + profesor.getNombre()
                + " | Categoría: "
                + categoria.getNombre()
                + " | Horario: "
                + horario
                + " | Matriculados: "
                + estudiantes.size()
                + "/" + CUPO_MAXIMO;
    }
}