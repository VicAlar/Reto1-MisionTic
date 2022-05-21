/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Clases.Cliente;
import Clases.CltJuridico;
import Clases.Producto;
import java.sql.*;

/**
 *
 * @author pc
 */
public class Model {
    DbData DbData;

    public Model() {
        this.DbData = new DbData();
    }
    
    
    public boolean crearProducto(Producto p){
        try (Connection conn = DriverManager.getConnection(DbData.getUrl(), DbData.getUser(), DbData.getPassword())){
            
            String query = "INSERT INTO tb_productos (Code, Nombre, Proveedor, Precio) VALUES (?, ?, ?, ?)";
            PreparedStatement statementProducto = conn.prepareStatement(query);
            statementProducto.setString(1, p.getId());
            statementProducto.setString(2, p.getNombre());
            statementProducto.setString(3, p.getProveedor());
            statementProducto.setInt(4, p.getPrecio());
            int rowsInserted = statementProducto.executeUpdate();
            if(rowsInserted > 0) {
                return true;
            }
            return false;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean editarProducto(Producto p) {
        try (Connection conn = DriverManager.getConnection(DbData.getUrl(), DbData.getUser(), DbData.getPassword())) {
            String query = "UPDATE tb_productos SET Nombre = ? , Proveedor = ?, Precio = ? WHERE code = ?";
            PreparedStatement statementP = conn.prepareStatement(query);
            statementP.setString(1, p.getNombre());
            statementP.setString(2, p.getProveedor());
            statementP.setInt(3, p.getPrecio());
            statementP.setString(4, p.getId());
            int rowsInserted = statementP.executeUpdate();
            if(rowsInserted > 0) {
                return true;
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean eliminarProducto(String id){
        try (Connection conn = DriverManager.getConnection(DbData.getUrl(), DbData.getUser(), DbData.getPassword())) {
            String query = "DELETE FROM tb_productos WHERE code = ? ";
            PreparedStatement statementP = conn.prepareStatement(query);
            statementP.setString(1, id);
            statementP.executeUpdate();
        } catch(Exception e){
            return false;
        }
        return true;
    }
    
    public Producto buscarProducto(String id){
        Producto p = null;
        try (Connection conn = DriverManager.getConnection(DbData.getUrl(), DbData.getUser(), DbData.getPassword())) {
            String query = "Select * FROM tb_productos WHERE Code = ?";
            PreparedStatement statementP = conn.prepareStatement(query);
            statementP.setString(1, id);
            ResultSet  results = statementP.executeQuery();
            while(results.next()){
                String code = results.getString(2);
                String nombre = results.getString(3);
                String proveedor = results.getString(4);
                int precio = results.getInt(5);
                p = new Producto(code, nombre, proveedor, precio);
            } return p;
        }catch(SQLException e) {
            System.out.println("Error " + e.getMessage());
            return p;
        }
    }
    
    public boolean crearCliente(CltJuridico c){
        try (Connection conn = DriverManager.getConnection(DbData.getUrl(), DbData.getUser(), DbData.getPassword())) {
            String query = "INSERT INTO tb_clientes(Direccion, Telefono, Email, Code) VALUES(?, ?, ?, ?)";
            PreparedStatement stmtCliente = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmtCliente.setString(1, c.getDireccion());
            stmtCliente.setString(2, c.getTelefono());
            stmtCliente.setString(3, c.getEmail());
            stmtCliente.setString(4, c.getId());
            int rowInserted = stmtCliente.executeUpdate();
            if (rowInserted > 0) {
                ResultSet generatedKeys = stmtCliente.getGeneratedKeys();
                if(generatedKeys.next()){
                    int idCliente = generatedKeys.getInt(1);
                    query = "INSERT INTO tb_clientesjuridicos (RazonSocial, Nit, IdCliente) VALUES (?, ?, ?)";
                    PreparedStatement stmtJurdico = conn.prepareStatement(query);
                    stmtJurdico.setString(1, c.getRazonSocial());
                    stmtJurdico.setString(2, c.getNit());
                    stmtJurdico.setInt(3, idCliente);
                    int rowsInserted = stmtJurdico.executeUpdate();
                    if(rowsInserted > 0){
                        return true;
                    }
                }
            }
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean editarCliente(CltJuridico c){
        try (Connection conn = DriverManager.getConnection(DbData.getUrl(), DbData.getUser(), DbData.getPassword())) {
            String query = "UPDATE tb_clientes set Direccion = ?, Email = ?, Telefono = ? WHERE code = ?";
            PreparedStatement stmtCliente = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmtCliente.setString(1, c.getDireccion());
            stmtCliente.setString(2, c.getEmail());
            stmtCliente.setString(3, c.getTelefono());
            int rowInserted = stmtCliente.executeUpdate();
            if (rowInserted > 0) {
                ResultSet generatedKeys = stmtCliente.getGeneratedKeys();
                if(generatedKeys.next()){
                    int idCliente = generatedKeys.getInt(1);
                    query = "UPDATE tb_clientesjuridicos set Nit = ?, RazonSocial = ? WHERE IdCliente = ?;";
                    PreparedStatement stmtJuridico = conn.prepareStatement(query);
                    stmtJuridico.setString(1, c.getNit());
                    stmtJuridico.setString(2, c.getRazonSocial());
                    stmtJuridico.setInt(3, idCliente);
                    int rowsInserted = stmtJuridico.executeUpdate();
                    if(rowsInserted > 0){
                        return true;
                    }
                }
            }
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean eliminarCliente(String id){
        return true;
    }
    
    public CltJuridico buscarCliente(String id){
        CltJuridico c = null;
        
        return c;
    }
}
