package actividad5;

public class CuentaCorriente extends Cuenta {

    private static final int RETIROS_GRATUITOS = 3;

    private static final double TARIFA_TRANSACCION = 3.0;

    private int retiros;

    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
        retiros = 0;
    }

    @Override
    public void retirar(double monto) {

        double cargo = 0;

        if (retiros >= RETIROS_GRATUITOS) {
            cargo = TARIFA_TRANSACCION;
        }

        double total = monto + cargo;

        if (total <= getSaldo() && monto > 0) {

            super.retirar(total);

            retiros++;

            if (cargo > 0) {
                System.out.println(
                        "Se aplicó una tarifa de S/."
                        + TARIFA_TRANSACCION);
            }

        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void consultar() {

        retiros = 0;

        System.out.println(
                "Contador de retiros restablecido.");
    }
}