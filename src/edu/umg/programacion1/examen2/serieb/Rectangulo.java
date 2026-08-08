package edu.umg.programacion1.examen2.serieb;

/**
 * Clase Rectangulo: implementa area() con la fórmula base * altura.
 */
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
}