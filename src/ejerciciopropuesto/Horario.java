package ejerciciopropuesto;

public class Horario {

    private String dia;
    private String horaInicio;
    private String horaFin;

    public Horario(String dia,
                   String horaInicio,
                   String horaFin) {

        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {

        return dia + " "
                + horaInicio + " - "
                + horaFin;
    }
}