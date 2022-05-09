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
public class Pedido {
    private String idPedido;
    private String idCliente;
    private Date fechaRealizacion;
    private String estado;
    private int total;
    private CarritoCompra carritoCompra;

    public Pedido(String idPedido, String idCliente, Date fechaRealizacion, String estado, int total, CarritoCompra carritoCompra) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fechaRealizacion = fechaRealizacion;
        this.estado = estado;
        this.total = total;
        this.carritoCompra = carritoCompra;
    }

    public Pedido(String idPedido) {
        this.idPedido = idPedido;
    }
    
    

    /**
     * @return the id
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * @param id the id to set
     */
    public void setId(String idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the fechaRealizacion
     */
    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    /**
     * @param fechaRealizacion the fechaRealizacion to set
     */
    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the carritoCompra
     */
    public CarritoCompra getCarritoCompra() {
        return carritoCompra;
    }

    /**
     * @param carritoCompra the carritoCompra to set
     */
    public void setCarritoCompra(CarritoCompra carritoCompra) {
        this.carritoCompra = carritoCompra;
    }
}
