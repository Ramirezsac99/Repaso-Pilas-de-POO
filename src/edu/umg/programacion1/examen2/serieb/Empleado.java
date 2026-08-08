package edu.umg.programacion1.examen2.serieb;

/**
 * Clase Empleado: modela un empleado genérico con nombre y salario base.
 */
public class Empleado {

    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        setSalarioBase(salarioBase);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Error: el salario base no puede ser negativo. No se modificó.");
        }
    }

    public String resumen() {
        return "Empleado: " + nombre + " | Salario base: Q" + salarioBase;
    }
}