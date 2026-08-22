package actividad4;

public class TestComposicion {

    public static void main(String[] args) {

        Persona persona =
                new Persona(1, "Carlos", "Gonzales", 10001);

        persona.getCuenta().setSaldo(2500);

        System.out.println(persona);
    }
}