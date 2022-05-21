/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Clases.Cliente;
import Clases.CltJuridico;
import Clases.Producto;
import Model.Model;

/**
 *
 * @author pc
 */
public class Controller {
    
    private Model Model;

    public Controller() {
        this.Model = new Model();
    }
    
    public boolean crearProducto(Producto p){
        this.Model.crearProducto(p);
        return true;
    }
    
    public boolean editarProducto(Producto p) {
        this.Model.editarProducto(p);
        return true;
    }
    
    public boolean eliminarProducto(String id) {
        this.Model.eliminarProducto(id);
        return true;
    }
    
    public Producto buscarProducto(String id) {
        Producto p = null;
        p = this.Model.buscarProducto(id);
        return p;
    }
    
    public boolean crearCliente(CltJuridico c){
        this.Model.crearCliente(c);
        return true;
    }
    
    public boolean editarCliente(CltJuridico c){
        this.Model.editarCliente(c);
        return true;
    }
    
    public boolean eliminarCliente(String id){
        this.Model.eliminarCliente(id);
        return true;
    }
    
    public CltJuridico buscarCliente(String id){
        CltJuridico c = null;
        c = this.Model.buscarCliente(id);
        return c;
    }
}
