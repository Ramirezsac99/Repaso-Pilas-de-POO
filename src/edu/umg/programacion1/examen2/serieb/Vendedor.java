package edu.umg.programacion1.examen2.serieb;

/**
 * Clase Vendedor: extiende Empleado agregando una comisión.
 * El salario total es la suma del salario base heredado más la comisión.
 */
public class Vendedor extends Empleado {

    private double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        setComision(comision);
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        if (comision >= 0) {
            this.comision = comision;
        } else {
            System.out.println("Error: la comisión no puede ser negativa. No se modificó.");
        }
    }

    public double salarioTotal() {
        return salarioBase + comision;
    }

    @Override
    public String resumen() {
        return super.resumen() + " | Comisión: Q" + comision + " | Total: Q" + salarioTotal();
    }
}