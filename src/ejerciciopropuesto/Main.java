package ejerciciopropuesto;

public class Main {

    public static void main(String[] args) {

        SistemaGestion sistema =
                new SistemaGestion();

        Categoria programacion =
                new Categoria("Programación");

        Categoria matematicas =
                new Categoria("Matemáticas");

        Profesor profesor1 =
                new Profesor(
                        1,
                        "Carlos Mendoza",
                        "carlos@universidad.edu",
                        "Java");

        Profesor profesor2 =
                new Profesor(
                        2,
                        "Ana Torres",
                        "ana@universidad.edu",
                        "Matemática");

        Estudiante estudiante1 =
                new Estudiante(
                        101,
                        "Luis Pérez",
                        "luis@universidad.edu",
                        "Ingeniería de Sistemas");

        Estudiante estudiante2 =
                new Estudiante(
                        102,
                        "María Flores",
                        "maria@universidad.edu",
                        "Ingeniería de Sistemas");

        Curso java =
                new Curso(
                        "LP3-01",
                        "Lenguajes de Programación III",
                        profesor1,
                        programacion,
                        "Martes",
                        "07:00",
                        "09:00");

        Curso calculo =
                new Curso(
                        "MAT-01",
                        "Cálculo",
                        profesor2,
                        matematicas,
                        "Miércoles",
                        "10:00",
                        "12:00");

        sistema.registrarProfesor(profesor1);
        sistema.registrarProfesor(profesor2);

        sistema.registrarEstudiante(estudiante1);
        sistema.registrarEstudiante(estudiante2);

        sistema.registrarCurso(java);
        sistema.registrarCurso(calculo);

        estudiante1.inscribirCurso(java);
        estudiante1.inscribirCurso(calculo);

        estudiante2.inscribirCurso(java);

        System.out.println(
                "=== INFORMACIÓN DE PERSONAS ===");

        Persona[] personas = {
                profesor1,
                profesor2,
                estudiante1,
                estudiante2
        };

        for (Persona persona : personas) {

            System.out.println(
                    persona.obtenerRol()
                    + " -> "
                    + persona.mostrarInformacion());
        }

        sistema.mostrarCursosDisponibles();

        System.out.println(
                "\nTotal de matrículas: "
                + sistema.cantidadTotalMatriculas());

        System.out.println(
                "Total de personas: "
                + Persona.getTotalPersonas());

        System.out.println(
                "Total estudiantes: "
                + Estudiante.getTotalEstudiantes());

        System.out.println(
                "Total profesores: "
                + Profesor.getTotalProfesores());

        System.out.println(
                "Total cursos: "
                + Curso.getTotalCursos());
    }
}