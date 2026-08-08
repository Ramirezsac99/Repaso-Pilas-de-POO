package edu.umg.programacion1.examen2.serieb;

/**
 * Serie B - Problema 2 (2.5 puntos)
 * <p>
 * Practica: herencia, {@code super}, constructores en jerarquía.
 * <p>
 * Objetivo:
 * <ul>
 *   <li>Clase {@code Empleado} con nombre (String) y salario base (double &gt;= 0).</li>
 *   <li>Clase {@code Vendedor} que extienda {@code Empleado} y agregue comisión (double &gt;= 0).</li>
 *   <li>Método {@code double salarioTotal()} en {@code Vendedor} = salario base + comisión.</li>
 *   <li>Método {@code String resumen()} en ambas clases: en {@code Empleado} nombre y salario base; en {@code Vendedor} incluya también la comisión y el total.</li>
 * </ul>
 * <p>
 * En {@link #main(String[])} cree al menos un empleado y un vendedor, imprima el {@code resumen()} de cada uno.
 * <p>
 * Nota: defina las clases que hagan falta; respete el uso de {@code super} donde corresponda.
 */
public class Problema02HerenciaMain {

	 public static void main(String[] args) {

	        System.out.println("===== PROBLEMA 2: HERENCIA (EMPLEADO Y VENDEDOR) =====");

	        Empleado empleado1 = new Empleado("Luis Fernández", 4500.0);
	        System.out.println(empleado1.resumen());

	        Vendedor vendedor1 = new Vendedor("Ana Torres", 3500.0, 1200.0);
	        System.out.println(vendedor1.resumen());
	   
	   }
	}