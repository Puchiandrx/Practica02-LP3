package actividad1;

public class EjemploCoche {

    public static void main(String[] args) {

        Coche cocheDeportivo =
                new Coche("Toyota", "Supra", 2022, 180000);

        Coche cocheTodoTerreno =
                new Coche("Nissan", "Patrol", 2008, 85000);

        System.out.println("DATOS INICIALES");
        System.out.println(cocheDeportivo);
        System.out.println(cocheTodoTerreno);

        System.out.println("\nPRUEBA DE MÉTODOS");

        cocheDeportivo.encender();
        cocheDeportivo.acelerar();
        cocheDeportivo.frenar();
        cocheDeportivo.apagar();

        System.out.println();

        cocheTodoTerreno.encender();
        cocheTodoTerreno.acelerar();
        cocheTodoTerreno.frenar();
        cocheTodoTerreno.apagar();

        System.out.println("\nDESCUENTOS");

        boolean descuento1 = cocheDeportivo.aplicarDescuento(10);
        boolean descuento2 = cocheTodoTerreno.aplicarDescuento(10);

        System.out.println("Descuento deportivo: " + descuento1);
        System.out.println("Descuento todoterreno: " + descuento2);

        System.out.println("\nDATOS FINALES");
        System.out.println(cocheDeportivo);
        System.out.println(cocheTodoTerreno);
    }
}