/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_UAS;
import GUI.Koneksi;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author mmccom
 */
public class insert {
     Konektor konek = new Konektor();
     
     public void insert(int nomor, String namaAgenda, String lokasiAgenda, String hari, String tanggal) {

        try {
            konek.konektor();
            Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
              String sql = "insert into output_agenda values('" + nomor + "','" + namaAgenda + "','" + lokasiAgenda + "','" + hari + "','" + tanggal + "')";
              statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }

    
    

}
