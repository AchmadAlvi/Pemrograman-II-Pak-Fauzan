/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_UAS;
import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;

/**
 *
 * @author mmccom
 */
public class Konektor {
    Connection con=null;
    String statusKoneksi = null;
    public void konektor()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost:3306/dbagenda";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
           //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
           statusKoneksi = "Berhasil";
        }

        catch(Exception e)
            
        {
        //JOptionPane.showMessageDialog(null, e);
            statusKoneksi = "Gagal";
        //System.exit(0);
        }
}
    public static void main(String[] args) {
        Konektor koneksi = new Konektor();
        koneksi.konektor();
    }
}


