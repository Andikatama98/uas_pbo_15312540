/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tama
 */
public class Koneksi {
    public Statement state;
    private Connection connect;
    String namaDatabase = "jdbc:mysql://localhost/db_uas_15312540";
    
    public void koneksiDatabase(){
        try {
            connect = DriverManager.getConnection(namaDatabase,"root","123");
            state = connect.createStatement();
            System.out.println("Koneksi Terhubung");
        } catch (SQLException e) {
            System.err.println("Error:  "+e);
        }
    }
    
}
