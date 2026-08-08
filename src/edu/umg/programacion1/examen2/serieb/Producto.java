package edu.umg.programacion1.examen2.serieb;

/**
 * Clase Producto: modela un producto de inventario con encapsulamiento
 * y reglas de negocio (precio > 0, stock >= 0).
 */
public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters con validación de reglas de negocio
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: el precio debe ser mayor a 0. No se modificó.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: el stock no puede ser negativo. No se modificó.");
        }
    }

    /**
     * Vende n unidades del producto: descuenta del stock solo si hay
     * suficiente disponible.
     *
     * @param n cantidad a vender
     * @return true si la venta fue exitosa, false si no había stock suficiente
     */
    public boolean vender(int n) {
        if (n <= 0) {
            return false;
        }
        if (n > stock) {
            return false;
        }
        stock -= n;
        return true;
    }

    public void mostrar() {
        System.out.println("Código: " + codigo + " | Nombre: " + nombre +
                " | Precio: Q" + precio + " | Stock: " + stock);
    }
}