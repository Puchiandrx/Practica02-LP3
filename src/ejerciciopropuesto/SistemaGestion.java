package ejerciciopropuesto;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestion {

    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public SistemaGestion() {

        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public void registrarEstudiante(
            Estudiante estudiante) {

        estudiantes.add(estudiante);
    }

    public void registrarProfesor(
            Profesor profesor) {

        profesores.add(profesor);
    }

    public void registrarCurso(
            Curso curso) {

        cursos.add(curso);
    }

    public void mostrarCursosDisponibles() {

        System.out.println(
                "\n=== CURSOS DISPONIBLES ===");

        for (Curso curso : cursos) {

            if (curso.estaDisponible()) {
                System.out.println(curso);
            }
        }
    }

    public int cantidadTotalMatriculas() {

        int total = 0;

        for (Curso curso : cursos) {
            total += curso.cantidadEstudiantes();
        }

        return total;
    }
}