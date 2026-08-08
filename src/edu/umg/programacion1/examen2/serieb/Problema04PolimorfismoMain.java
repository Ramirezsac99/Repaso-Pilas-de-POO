package edu.umg.programacion1.examen2.serieb;
import java.util.ArrayList;
import java.util.List;
/**
 * Serie B - Problema 4 (2.5 puntos)
 * <p>
 * Practica: polimorfismo: colección de referencias a supertipo y comportamiento dinámico.
 * <p>
 * Objetivo:
 * <ul>
 *   <li>Defina una jerarquía {@code Figura} (o nombre equivalente) con al menos dos subtipos concretos (por ejemplo {@code Circulo} y {@code Rectangulo}),
 *       cada uno con los datos necesarios para calcular su área.</li>
 *   <li>En la clase base declare un método {@code double area()} (clase abstracta o implementación por defecto, según su diseño).</li>
 *   <li>Construya un arreglo o {@code java.util.List} de tipo {@code Figura} que mezcle instancias de distintas subclases.</li>
 *   <li>Recorra la colección y, sin usar {@code instanceof}, imprima el área de cada figura (el polimorfismo debe resolver qué {@code area()} ejecutar).</li>
 * </ul>
 * <p>
 * En {@link #main(String[])} cree las figuras, recorra la estructura y muestre resultados claros por consola.
 * <p>
 * Nota: este problema evalúa el polimorfismo de inclusión visto en clase (referencia base, objeto derivado).
 */
public class Problema04PolimorfismoMain {

	public static void main(String[] args) {

        System.out.println("===== PROBLEMA 4: POLIMORFISMO =====");

        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 6));
        figuras.add(new Circulo(2.5));
        figuras.add(new Rectangulo(10, 3));

        // Se recorre la lista usando solo la referencia Figura,
        // sin instanceof: el polimorfismo resuelve automáticamente
        // qué área() ejecutar según el objeto real de cada elemento.
        for (Figura f : figuras) {
            System.out.println("Área: " + f.area());
        }
    }
}