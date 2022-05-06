/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author pc
 */
public class CltNatural extends Cliente {
    private String documento;
    private String nombre;
    private String sgNombre;
    private String apellido;
    private String sgApellido;

    public CltNatural(String documento, String nombre, String sgNombre, String apellido, String sgApellido, String id, String direccion, String telefono, String email) {
        super(id, direccion, telefono, email);
        this.documento = documento;
        this.nombre = nombre;
        this.sgNombre = sgNombre;
        this.apellido = apellido;
        this.sgApellido = sgApellido;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sgNombre
     */
    public String getSgNombre() {
        return sgNombre;
    }

    /**
     * @param sgNombre the sgNombre to set
     */
    public void setSgNombre(String sgNombre) {
        this.sgNombre = sgNombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the sgApellido
     */
    public String getSgApellido() {
        return sgApellido;
    }

    /**
     * @param sgApellido the sgApellido to set
     */
    public void setSgApellido(String sgApellido) {
        this.sgApellido = sgApellido;
    }
    
    
}
