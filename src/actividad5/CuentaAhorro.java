package actividad5;

public class CuentaAhorro extends Cuenta {

    private double tasaInteres;
    private double saldoMinimo;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);

        this.tasaInteres = tasaInteres;
        this.saldoMinimo = saldoInicial;
    }

    @Override
    public void retirar(double monto) {

        double saldoAnterior = getSaldo();

        super.retirar(monto);

        if (getSaldo() < saldoAnterior
                && getSaldo() < saldoMinimo) {

            saldoMinimo = getSaldo();
        }
    }

    @Override
    public void consultar() {

        double interes =
                saldoMinimo * tasaInteres / 100;

        depositar(interes);

        System.out.println(
                "Interés generado: S/." + interes);

        saldoMinimo = getSaldo();
    }
}