package actividad2;

public class ContadorTest {

    public static void main(String[] args) {

        Contador c1 = new Contador(3);
        Contador c2 = new Contador(10);
        Contador c3 = new Contador();

        c1.inc();
        c1.inc();
        c2.inc();

        System.out.println("Valor c1: " + c1.getValor());
        System.out.println("Valor c2: " + c2.getValor());
        System.out.println("Valor c3: " + c3.getValor());

        System.out.println("Acumulador: "
                + Contador.acumulador());

        System.out.println("Contadores creados: "
                + Contador.getNContadores());

        System.out.println("Valor inicial del último contador: "
                + Contador.getUltimoContador());
    }
}