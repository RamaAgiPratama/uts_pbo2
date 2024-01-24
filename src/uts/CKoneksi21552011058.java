/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author ACER
 */
public class CKoneksi21552011058 {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if (koneksi == null){
    try {
        String dbURL ="jdbc:mysql://localhost:3306/db_uts_pbo2_21552011058";
        String username = "root";
        String password = "";
        koneksi = DriverManager.getConnection(dbURL,username,password);
        System.out.println("Koneksi Berhasil");
    } catch (Exception e){
         System.out.println("Error: " +e);
    }
    }
        return koneksi;
    }
    
    public static void main(String[] args) {
        getKoneksi();

    }
    
}
