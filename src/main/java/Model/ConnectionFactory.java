/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author é o r's
 */
public class ConnectionFactory {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/db_lixo?useTimezone=true&serverTimezone=UTC ";
    private String user = "root";
    private String password = "1234";
		
    public Connection conectar() {	
        Connection con = null;
        try {
                Class.forName(driver);
                con = DriverManager.getConnection(url, user, password);
                return con;
        } catch (Exception e) {
                System.out.println(e);
                return null;
        }
    }
}
