package edu.umg.programacion1.examen2.serieb;

/**
 * Serie B - Problema 1 (2.5 puntos)
 * <p>
 * Practica: encapsulamiento, getters/setters y reglas de negocio en métodos.
 * <p>
 * Objetivo:
 * Modele un producto de inventario con atributos privados: código (String), nombre (String),
 * precio (double, &gt; 0) y stock (int, &gt;= 0). Debe poder:
 * <ul>
 *   <li>Crear productos con datos válidos (rechazar precio &lt;= 0 o stock negativo en constructores o setters, según su diseño).</li>
 *   <li>Vender {@code n} unidades con un método {@code vender(int n)} que descuente el stock si hay suficiente y devuelva {@code true};
 *       si no hay stock suficiente, no modifique nada y devuelva {@code false}.</li>
 *   <li>Mostrar en consola un resumen del producto (código, nombre, precio, stock).</li>
 * </ul>
 * <p>
 * En {@link #main(String[])} demuestre al menos: creación de dos productos, una venta exitosa y una venta fallida.
 * <p>
 * Nota: puede crear las clases adicionales que necesite en este paquete ({@code edu.umg.programacion1.examen2.serieb})
 * u organizar subpaquetes si lo considera necesario.
 */
public class Problema01ProductoMain {

    public static void main(String[] args) {

        System.out.println("===== PROBLEMA 1: PRODUCTO =====");

        // Creación de dos productos con datos válidos
        Producto p1 = new Producto("P001", "Teclado mecánico", 250.0, 10);
        Producto p2 = new Producto("P002", "Mouse inalámbrico", 120.0, 3);

        p1.mostrar();
        p2.mostrar();

        // Venta exitosa: p1 tiene 10 unidades, se venden 4
        System.out.println("\n--- Venta exitosa ---");
        boolean venta1 = p1.vender(4);
        System.out.println("¿Venta exitosa? " + venta1);
        p1.mostrar();

        // Venta fallida: p2 tiene solo 3 unidades, se intentan vender 10
        System.out.println("\n--- Venta fallida (stock insuficiente) ---");
        boolean venta2 = p2.vender(10);
        System.out.println("¿Venta exitosa? " + venta2);
        p2.mostrar(); // debe mostrar el stock sin cambios
    }
}
