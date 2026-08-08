package edu.umg.programacion1.examen2.serieb;

/**
 * Serie B - Problema 3 (2.5 puntos)
 * <p>
 * Practica: herencia y sobreescritura ({@code @Override}) con reglas distintas por subtipo.
 * <p>
 * Objetivo:
 * <ul>
 *   <li>Clase {@code Cuenta} con saldo (double). Métodos {@code depositar(double m)} y {@code retirar(double m)} con {@code m &gt; 0};
 *       {@code retirar} no debe dejar saldo negativo (si no hay fondos, no cambie el saldo y puede retornar {@code false}, o use el criterio que documente en comentarios).</li>
 *   <li>Clase {@code CuentaAhorro} que extienda {@code Cuenta} y agregue una tasa de interés anual (double, por ejemplo 0.03 para 3%).</li>
 *   <li>Sobreescriba {@code depositar} en {@code CuentaAhorro} para que, además del depósito normal, acredite intereses simples sobre el monto depositado: {@code m * tasa}
 *       (solo como ejemplo de regla adicional; ajuste si prefiere otra fórmula, pero documente).</li>
 *   <li>Proporcione {@code double getSaldo()} coherente en toda la jerarquía.</li>
 * </ul>
 * <p>
 * En {@link #main(String[])} cree una cuenta simple y una cuenta de ahorro, realice depósitos y muestre saldos finales.
 */
public class Problema03CuentaMain {

    public static void main(String[] args) {
        // TODO estudiante: demostración según el enunciado
    	System.out.println("===== PROBLEMA 3: CUENTA Y CUENTA AHORRO =====");

        Cuenta cuenta1 = new Cuenta(500.0);
        cuenta1.depositar(200.0);
        boolean retiroExitoso = cuenta1.retirar(1000.0); // debe fallar, no hay fondos
        System.out.println("¿Retiro exitoso? " + retiroExitoso);
        System.out.println("Saldo cuenta simple: Q" + cuenta1.getSaldo());

        System.out.println();

        CuentaAhorro ahorro1 = new CuentaAhorro(1000.0, 0.03); // 3% de interés
        ahorro1.depositar(1000.0); // deposita 1000 + interés de 30
        System.out.println("Saldo cuenta ahorro: Q" + ahorro1.getSaldo());
    }
}