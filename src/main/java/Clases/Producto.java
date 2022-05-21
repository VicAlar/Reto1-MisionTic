/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author pc
 */
public class Producto {
    private String id;
    private String nombre;
    private String proveedor;
    private int precio;

    public Producto(String id, String nombre, String proveedor, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
        public Producto( String nombre, String proveedor, int precio) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
    }
    
    
   
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String denominacion) {
        this.nombre = denominacion;
    }

    /**
     * @return the proveedor
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }


    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
