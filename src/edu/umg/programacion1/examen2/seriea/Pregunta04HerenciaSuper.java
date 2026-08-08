package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 4 (1 punto)
 * <p>
 * Tema: herencia, {@code extends} y llamada a constructores con {@code super(...)}.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete la clase {@code Vendedor} para que herede de {@code Empleado}.</li>
 *   <li>El constructor de {@code Vendedor} debe recibir {@code nombre}, {@code salarioBase} y {@code comision}, y llamar al constructor de la superclase con los dos primeros datos.</li>
 *   <li>Implemente {@code salarioTotal()} retornando salario base más comisión.</li>
 *   <li>En CONCEPTO: explique qué hace {@code super(nombre, salarioBase)} y por qué debe ser la primera línea útil del constructor.</li>
 * </ol>
 */
public class Pregunta04HerenciaSuper {

    static class Empleado {
        protected String nombre;
        protected double salarioBase;

        public Empleado(String nombre, double salarioBase) {
            this.nombre = nombre;
            this.salarioBase = salarioBase;
        }
    }

    static class Vendedor extends Empleado {
        private double comision;

        public Vendedor(String nombre, double salarioBase, double comision) {
            super(nombre, salarioBase);
            this.comision = comision;
        }

        public double salarioTotal() {
            return salarioBase + comision;
        }
    }

    /*
     * CONCEPTO:
     *
     * super(nombre, salarioBase) llama al constructor de la clase padre
     * Empleado, para que sea él quien inicialice los atributos nombre y
     * salarioBase que Vendedor hereda. Debe ser la primera línea útil del
     * constructor porque en Java, un objeto de la subclase no puede
     * terminar de construirse sin que primero se haya construido
     * completamente la parte que le corresponde a la superclase; si no se
     * llama a super() explícitamente, Java intenta llamar al constructor
     * vacío del padre automáticamente, lo cual fallaría aquí porque
     * Empleado no tiene un constructor sin parámetros.
     */
}
