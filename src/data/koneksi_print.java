/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class koneksi_print {
     public koneksi_print () {}
    public Connection bukakoneksi () throws SQLException
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sarjana","root","");
            return con;
        }
        catch (SQLException se)
        {
            System.out.println("No Connection Open");
            return null;
        }
        catch (Exception ex)
        {
            System.out.println("Couldn't open connection"+ex);
            return null;
        }    
}
    
}
