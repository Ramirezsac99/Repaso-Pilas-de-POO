package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 1 (1 punto)
 * <p>
 * Tema: encapsulamiento y control de acceso ({@code private}).
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete el setter {@code setEdad} para que no acepte valores negativos (ignore el cambio o use un valor por defecto; indique su criterio en el comentario de concepto).</li>
 *   <li>Escriba debajo, en el bloque "CONCEPTO", en sus propias palabras qué problema resuelve el encapsulamiento frente a dejar {@code edad} como {@code public}.</li>
 * </ol>
 */
public class Pregunta01Encapsulamiento {

    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    
    	
    }

    /*
     * CONCEPTO (escriba aquí su explicación breve, 2-4 líneas):
     *Si el atributo `edad` fuera público, cualquier parte del programa podría cambiarlo directamente y 
     * hasta ponerle un valor negativo sin que nadie lo controle. En cambio, al ponerlo como private y 
     * cambiarlo solamente por medio de `setEdad()`, me aseguro de que antes de modificar la edad pase por 
     * una validación y así no permita valores negativos.
    
     */
}

