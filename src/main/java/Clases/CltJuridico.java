/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author pc
 */
public class CltJuridico extends Cliente{
    private String razonSocial;
    private String nit;

    public CltJuridico(String razonSocial, String nit, String id, String direccion, String telefono, String email) {
        super(id, direccion, telefono, email);
        this.razonSocial = razonSocial;
        this.nit = nit;
    }

    public CltJuridico(String razonSocial, String nit, String id, int code, String direccion, String telefono, String email) {
        super(id, code, direccion, telefono, email);
        this.razonSocial = razonSocial;
        this.nit = nit;
    }
    
    

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
}
