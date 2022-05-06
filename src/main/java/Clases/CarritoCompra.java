/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pc
 */
public class CarritoCompra {
    private Date fechaCreacion;
    private ArrayList<LineaProducto> productos;

    public CarritoCompra(Date fechaCreacion, ArrayList<LineaProducto> productos) {
        this.fechaCreacion = fechaCreacion;
        this.productos = new ArrayList();
    }
    
    

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the productos
     */
    public ArrayList<LineaProducto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ArrayList<LineaProducto> productos) {
        this.productos = productos;
    }
}
