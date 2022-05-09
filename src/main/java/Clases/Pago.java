/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Victor
 */
public class Pago {
    private String idPago;
    private Pedido idPedido;
    private Date fechaPago;
    private String Estado;

    public Pago(String idPago, Pedido idPedido, Date fechaPago, String Estado) {
        this.idPago = idPago;
        this.idPedido = idPedido;
        this.fechaPago = fechaPago;
        this.Estado = Estado;
    }
    
    

    /**
     * @return the id
     */
    public String getIdPago() {
        return idPago;
    }

    /**
     * @param id the id to set
     */
    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    /**
     * @return the fechaPago
     */
    public Date getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the idPedido
     */
    public Pedido getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }
}
