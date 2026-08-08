package edu.umg.programacion1.examen2.serieb;

/**
 * Clase Circulo: implementa area() con la fórmula pi * radio^2.
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}