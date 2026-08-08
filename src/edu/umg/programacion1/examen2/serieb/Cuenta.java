package edu.umg.programacion1.examen2.serieb;

/**
 * Clase Cuenta: modela una cuenta bancaria simple.
 * retirar() no permite que el saldo quede negativo; si no hay fondos
 * suficientes, no modifica el saldo y retorna false.
 */
public class Cuenta {

    protected double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double m) {
        if (m > 0) {
            saldo += m;
        } else {
            System.out.println("Error: el monto a depositar debe ser mayor a 0.");
        }
    }

    public boolean retirar(double m) {
        if (m <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor a 0.");
            return false;
        }
        if (m > saldo) {
            System.out.println("Error: saldo insuficiente para retirar Q" + m);
            return false;
        }
        saldo -= m;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }
}