/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5_Tugas_Enkapsulasi;

/**
 *
 * @author mmccom
 */
public class RunEXO {
    public static void main(String[] args) {
        
        EXO Exo = new EXO();
        Exo.Setagensi("SM ENTERTAINMENT");
        Exo.Setkontrak("10 Tahun");
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
        System.out.println("Nama Agensi = " + Exo.Getagensi());
        System.out.println("Kontrak dengan Agensi = " + Exo.Getkontrak());
        Baekhyun.rilis();
        Baekhyun.BeritaBaru();
        
        Chanyeol.member();
        Chanyeol.Group();
        System.out.println("Nama Agensi = " + Exo.Getagensi());
        System.out.println("Kontrak dengan Agensi = " + Exo.Getkontrak());
        Chanyeol.rilis();        
        Chanyeol.RumorBaru();
        
        Kai.member();
        Kai.Group();
        System.out.println("Nama Agensi = " + Exo.Getagensi());
        System.out.println("Kontrak dengan Agensi = " + Exo.Getkontrak());
        Kai.rilis();        
        Kai.BrandAmbasador();
        
        DO.member();
        DO.Group();
        System.out.println("Nama Agensi = " + Exo.Getagensi());
        System.out.println("Kontrak dengan Agensi = " + Exo.Getkontrak());
        DO.rilis();      
        DO.HotNews();
        
        Chen.member();
        Chen.Group();
        System.out.println("Nama Agensi = " + Exo.Getagensi());
        System.out.println("Kontrak dengan Agensi = " + Exo.Getkontrak());
        Chen.rilis();        
        Chen.jadwal();
    }
}
