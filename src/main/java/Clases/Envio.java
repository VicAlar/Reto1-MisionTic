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
public class Envio {
    private String id;
    private String direccionEnvio;
    private String estadoEnvio;
    private Date fechaEnvio;
    private String compañiaEnvio;

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
     * @return the direccionEnvio
     */
    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    /**
     * @param direccionEnvio the direccionEnvio to set
     */
    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    /**
     * @return the estadoEnvio
     */
    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    /**
     * @param estadoEnvio the estadoEnvio to set
     */
    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    /**
     * @return the fechaEnvio
     */
    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * @param fechaEnvio the fechaEnvio to set
     */
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * @return the compañiaEnvio
     */
    public String getCompañiaEnvio() {
        return compañiaEnvio;
    }

    /**
     * @param compañiaEnvio the compañiaEnvio to set
     */
    public void setCompañiaEnvio(String compañiaEnvio) {
        this.compañiaEnvio = compañiaEnvio;
    }
}
