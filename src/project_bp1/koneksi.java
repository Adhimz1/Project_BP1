package project_bp1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    public static Connection con;
    
    public koneksi (){
        String id, pass, driver, url;
        id = "root";
        pass ="";
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/project_bp1";
        
        try{
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url,id,pass);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        }
        catch(Exception e){
            System.out.println("" + e.getLocalizedMessage());
        }
    }
    public static void main(String []args){
        koneksi k=new koneksi();
    }
}