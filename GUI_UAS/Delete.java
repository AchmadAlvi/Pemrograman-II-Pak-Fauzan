/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_UAS;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mmccom
 */
public class Delete {
    Konektor konek = new Konektor();
     
     public void delete(int nomor) {

        try {
            konek.konektor();
            Statement statement = konek.con.createStatement();
         
              String sql = "delete from output_agenda where Nomor = '" + nomor + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
