package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 3 (1 punto)
 * <p>
 * Tema: getters, setters y validación en métodos de acceso.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete {@code setPrecio} para que solo acepte valores estrictamente mayores que cero; si el valor es inválido, no modifique {@code precio}.</li>
 *   <li>Complete {@code setStock} para que solo acepte valores mayores o iguales a cero.</li>
 *   <li>En CONCEPTO: explique por qué validar en el setter suele ser preferible a validar en {@code main} cada vez que se asigna el atributo.</li>
 * </ol>
 */
public class Pregunta03GettersSetters {

    private String nombre;
    private double precio;
    private int stock;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
    	if (precio > 0) {
            this.precio = precio;

    	 }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
    	 if (stock >= 0) {
    	        this.stock = stock;
    	    }

    }

    /*
     * CONCEPTO:
     *Es mejor hacer la validación dentro del setter porque así la regla queda en un solo lugar. Entonces, 
     *no importa desde dónde se quiera cambiar el atributo, siempre va a pasar por la misma validación.
     *Si yo hiciera la validación directamente en el main, tendría que repetir la misma condición cada vez que 
     *quiera cambiar el valor. Y podría pasar que se me olvide validarlo en algún lugar y termine dejando el 
     *objeto con un valor que no debería tener.
     
     */
}
