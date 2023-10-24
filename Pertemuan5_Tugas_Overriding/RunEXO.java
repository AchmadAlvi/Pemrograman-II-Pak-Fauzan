/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5_Tugas_Overriding;

/**
 *
 * @author mmccom
 */
public class RunEXO {
    public static void main(String[] args) {
        EXO Exo = new EXO();
        // Objek
        ByunBaekhyun Baekhyun = new ByunBaekhyun();
        ParkChanyeol Chanyeol = new ParkChanyeol();
        KimJongIn Kai = new KimJongIn();
        DoKyungSoo DO = new DoKyungSoo();
        KimJongDae Chen = new KimJongDae();
        
        // Variabel
        
        Baekhyun.nama = "Baekhyun";
        Baekhyun.unit = "Solo";
        Baekhyun.posisi = "Main Vocal";
        
        Chanyeol.nama = "Chanyeol";
        Chanyeol.unit = "EXO-SC";
        Chanyeol.posisi = "Main Rapper, Sub Vocal, Visual";
        
        Kai.nama = "Kai";
        Kai.unit = "Solo";
        Kai.posisi = "Main Dancer, Sub Rapper, Sub Vocal, Visual";
        
        DO.nama = "D.O";
        DO.unit = "Solo";
        DO.posisi = "Main Vocal";
        
        Chen.nama = "Chen";
        Chen.unit = "EXO-CBX";
        Chen.posisi = "Main Vocal";
        
        // Memanggil Variabel
        
        Exo.member();
        
        Baekhyun.member();
        Baekhyun.Group();
        Baekhyun.rilis();
        Baekhyun.BeritaBaru();
        
        Chanyeol.member();
        Chanyeol.Group();
        Chanyeol.rilis();        
        Chanyeol.RumorBaru();
        
        Kai.member();
        Kai.Group();
        Kai.rilis();        
        Kai.BrandAmbasador();
        
        DO.member();
        DO.Group();
        DO.rilis();      
        DO.HotNews();
        
        Chen.member();
        Chen.Group();
        Chen.rilis();        
        Chen.jadwal();
    }
}
