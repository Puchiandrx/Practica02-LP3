package actividad5;

public abstract class Cuenta {

    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {

        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente o monto inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void consultar();
}