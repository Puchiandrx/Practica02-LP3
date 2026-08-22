package actividad5;

import java.util.Scanner;

public class AppBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cuenta[] cuentas = new Cuenta[10];

        for (int i = 0; i < 5; i++) {
            cuentas[i] =
                    new CuentaCorriente(1000);
        }

        for (int i = 5; i < 10; i++) {
            cuentas[i] =
                    new CuentaAhorro(1000, 2);
        }

        String opcion;

        do {

            System.out.println("\n===== BANCO =====");
            System.out.println("D) Depositar");
            System.out.println("R) Retirar");
            System.out.println("C) Consultar");
            System.out.println("S) Salir");
            System.out.print("Opción: ");

            opcion = scanner.next();

            if (opcion.equalsIgnoreCase("D")) {

                System.out.print(
                        "Número de cuenta (0-9): ");

                int numero = scanner.nextInt();

                System.out.print("Monto: S/.");

                double monto = scanner.nextDouble();

                if (numero >= 0 && numero < cuentas.length) {

                    cuentas[numero].depositar(monto);

                    System.out.println(
                            "Saldo: S/."
                            + cuentas[numero].getSaldo());

                } else {
                    System.out.println(
                            "Cuenta inexistente.");
                }

            } else if (opcion.equalsIgnoreCase("R")) {

                System.out.print(
                        "Número de cuenta (0-9): ");

                int numero = scanner.nextInt();

                System.out.print("Monto: S/.");

                double monto = scanner.nextDouble();

                if (numero >= 0 && numero < cuentas.length) {

                    cuentas[numero].retirar(monto);

                    System.out.println(
                            "Saldo: S/."
                            + cuentas[numero].getSaldo());

                } else {
                    System.out.println(
                            "Cuenta inexistente.");
                }

            } else if (opcion.equalsIgnoreCase("C")) {

                System.out.println(
                        "\n=== CONSULTA DE CUENTAS ===");

                for (int i = 0; i < cuentas.length; i++) {

                    cuentas[i].consultar();

                    System.out.println(
                            "Cuenta " + i
                            + " - Saldo: S/."
                            + cuentas[i].getSaldo());
                }
            }

        } while (!opcion.equalsIgnoreCase("S"));

        scanner.close();

        System.out.println("Programa finalizado.");
    }
}