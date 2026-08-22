package actividad3;

public class TestAgregacion {

    public static void main(String[] args) {

        Motor motor1 = new Motor(1001, 6500);
        Motor motor2 = new Motor(2002, 7000);

        Automovil auto1 =
                new Automovil("ABC-123", 4, "Toyota", "Corolla");

        Automovil auto2 =
                new Automovil("XYZ-987", 4, "Nissan", "Sentra");

        auto1.setMotor(motor1);
        auto2.setMotor(motor2);

        System.out.println(auto1);
        System.out.println(auto2);
    }
}