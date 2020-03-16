/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.simon.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge A
 */
public class Conexion {
    private Connection conn;
    public String driver;
    private String url;
    private String user;
    private String pwd;

    public Conexion(String driver, String url, String user, String pwd) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }

    public Conexion() {
        this.driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        this.url = "jdbc:mysql://localhost:3306;SimonDice";
        this.user = "sa";
        this.pwd = "w4dm1n";
    }

    public Connection conectar() throws SQLException {
        if(this.conn == null || this.conn.isClosed()) {
            try {
                Class.forName(this.driver);
                this.conn = DriverManager.getConnection(url, this.user, this.pwd);
            }
            catch(Exception ex) {
                ex.printStackTrace();;
            }
        }
        return this.conn;
    }
    
    public void desconectar() throws SQLException {
        if(this.conn != null && !this.conn.isClosed())
            this.conn.close();
    }
    
}
