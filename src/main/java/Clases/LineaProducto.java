/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author pc
 */
class LineaProducto extends Producto {
    private int cantidad;
    private int precioTotal;

    public LineaProducto(int cantidad, int precioTotal, String id, String nombre, String proveedor, String descripcion, int precio) {
        super(id, nombre, proveedor, descripcion, precio);
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precioTotal;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precioTotal = precio;
    }
    
    
}
