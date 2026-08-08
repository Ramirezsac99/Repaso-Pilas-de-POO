package edu.umg.programacion1.examen2.serieb;

/**
 * Clase CuentaAhorro: extiende Cuenta agregando una tasa de interés anual.
 *
 * REGLA ADICIONAL DOCUMENTADA: al depositar, además del monto normal,
 * se acredita un interés simple calculado como (monto * tasa), sumado
 * también al saldo. Por ejemplo, con tasa 0.03 (3%) y un depósito de
 * Q1000, se suman Q1000 del depósito más Q30 de interés, dando Q1030
 * en total sumado al saldo.
 */
public class CuentaAhorro extends Cuenta {

    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double m) {
        if (m > 0) {
            double interes = m * tasaInteres;
            super.depositar(m);
            saldo += interes;
        } else {
            System.out.println("Error: el monto a depositar debe ser mayor a 0.");
        }
    }
}