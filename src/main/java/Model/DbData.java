/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pc
 */
public class DbData {
    private final String Driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/administradorclientes";
    private final String user = "root";
    private final String password = "";

    public DbData() {
    }
    
    

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the Driver
     */
    public String getDriver() {
        return Driver;
    }
}
