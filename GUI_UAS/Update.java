/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_UAS;

import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author mmccom
 */
public class Update {

    Konektor konek = new Konektor();

    public void update(int nomor, String namaAgenda, String lokasiAgenda, String hari, String tanggal) {

        try {
            konek.konektor();
            Statement statement = konek.con.createStatement();
           
            String sql_namaAgenda = "update output_agenda set Nama_Agenda='" + namaAgenda + "'where Nomor ='" + nomor + "'";
            String sql_lokasiAgenda = "update output_agenda set Lokasi_Agenda='" + lokasiAgenda + "'where Nomor ='" + nomor + "'";
            String sql_hari = "update output_agenda set Hari='" + hari + "'where Nomor ='" + nomor + "'";
            String sql_tanggal = "update output_agenda set Tanggal='" + tanggal + "'where Nomor ='" + nomor + "'";
            // String sql_nomor = "update output_agenda set Nomor ='" + nomor + "'where Nomor = '" + nomor + "'";
            //  String sql = "update output_agenda set Nomor = ('" + nomor + "','" + namaAgenda + "','" + lokasiAgenda + "','" + tanggal + "','" + hari + "')";
            statement.executeUpdate(sql_namaAgenda);
            statement.executeUpdate(sql_lokasiAgenda);
            statement.executeUpdate(sql_hari);
            statement.executeUpdate(sql_tanggal);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diupdate");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
