/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class koneksi {
private static Connection koneksi;
public static Connection conn = null;
public static ResultSet res = null;
public static PreparedStatement pst = null;
public static Statement stt = null;
public static Connection koneksi()
{
if(koneksi== null)
{
try{
String url="jdbc:mysql://dbms.lepkom.f4.com/db_inventory_15114850";
String username= "APC2";     // default username
String password= "lepkom@123";         // jika ada password bisa anda masukkan
//data = this.koneksi.createStatement();
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
koneksi =DriverManager.getConnection(url, username, password);
}catch (SQLException e) {
JOptionPane.showMessageDialog(null,"Terjadi Kesalahan");
   }
}
return koneksi;
   }
}
