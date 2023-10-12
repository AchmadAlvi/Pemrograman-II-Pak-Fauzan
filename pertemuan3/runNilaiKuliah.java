/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author mmccom
 */
public class runNilaiKuliah {
    
    public static void main(String[] args) {
    MasterNilaiKuliah P = new MasterNilaiKuliah(); 
    
        //Prosedur
        P.penilaian(80, "Achmad Alvi Yudanuari", "");
        
        //Fungsi
        System.out.println(P.penilaian1(65, "Malmedira Fisyara", ""));
        
        //Static Prosedur
        MasterNilaiKuliah.penilaian2(90, "Resha Yuana Putri Endrianto", "");
        
        //Static Fungsi
        System.out.println(MasterNilaiKuliah.penilaian3(50, "Achmad Muzaki", ""));
    }
}
