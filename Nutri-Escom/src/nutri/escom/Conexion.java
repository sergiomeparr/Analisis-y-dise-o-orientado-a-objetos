/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutri.escom;

import java.sql.*;
import javax.swing.*;

public class Conexion{
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\base\\Base.mdb");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Alumno WHERE Boleta='"+Registro_Alumno.jTextField6.getText()+"'");
            rs.next();
            //JOptionPane.showMessageDialog(null, "Alumno existente");
            return conn;
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}