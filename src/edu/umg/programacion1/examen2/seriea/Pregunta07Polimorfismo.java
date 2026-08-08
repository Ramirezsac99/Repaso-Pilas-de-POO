package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 7 (1 punto)
 * <p>
 * Tema: polimorfismo: referencia de supertipo y objeto de subtipo.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete el método {@code imprimirEtiqueta} para que imprima el color y el área usando solo la referencia {@code Figura f}
 *       (no use {@code instanceof} ni conversiones; confíe en el método {@code area()} sobreescrito).</li>
 *   <li>En {@code probar}, complete la línea que asigna a {@code f} un rectángulo de base 3 y altura 4.</li>
 *   <li>En CONCEPTO: en una o dos oraciones, explique qué significa “el método que se ejecuta depende del objeto real, no del tipo de la referencia”.</li>
 * </ol>
 */
public class Pregunta07Polimorfismo {

    static abstract class Figura {
        protected String color;

        protected Figura(String color) {
            this.color = color;
        }

        public abstract double area();

        public String getColor() {
            return color;
        }
    }

    static class Rectangulo extends Figura {
        private final double base;
        private final double altura;

        public Rectangulo(String color, double base, double altura) {
            super(color);
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double area() {
            return base * altura;
        }
    }

    public static void imprimirEtiqueta(Figura f) {
        System.out.println("Color: " + f.getColor() + " | Área: " + f.area());
    }

    public static void probar() {
        Figura f = new Rectangulo("azul", 3, 4);
        imprimirEtiqueta(f);
    }

    /*
     * CONCEPTO:
     *
     * Significa que aunque la variable f esté declarada como tipo Figura,
     * al llamar f.area() se ejecuta la versión sobreescrita en la clase
     * real del objeto (en este caso Rectangulo), y no una versión genérica
     * de Figura, porque Java decide en tiempo de ejecución qué método usar
     * según el objeto que realmente fue creado con "new", no según el tipo
     * de la referencia que lo contiene.
     */
}
