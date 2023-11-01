/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5_Tugas_Override;

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
        
        // Memanggil Variabel
        
        Exo.member();
        
        Baekhyun.nama = "Byun Baek Hyun";
        System.out.println("Nama: " + Baekhyun.nama);   
        Baekhyun.member();
        Baekhyun.unit = "Solo";
        System.out.println("Berada di Unit : " + Baekhyun.unit);
        Baekhyun.posisi = "Main Vocal";
        System.out.println("Posisi Sebagai : " + Baekhyun.posisi);        
        Baekhyun.Group();
        Baekhyun.rilis();
        Baekhyun.BeritaBaru();
        
        Chanyeol.nama = "Park Chan Yeol";
        System.out.println("Nama : " + Chanyeol.nama);
        Chanyeol.member();
        Chanyeol.unit = "EXO-SC";
        System.out.println("Berada di Unit : " + Chanyeol.unit);
        Chanyeol.posisi = "Main Rapper, Sub Vocal, Visual";
        System.out.println("Posisi Sebagai : " + Chanyeol.posisi);
        Chanyeol.Group();
        Chanyeol.rilis();        
        Chanyeol.RumorBaru();
        
        Kai.nama = "Kim Jong In";
        System.out.println("Nama : " + Kai.nama);
        Kai.member();
        Kai.unit = "Solo";
        System.out.println("Berada di Unit : " + Kai.unit);
        Kai.posisi = "Main Dancer, Sub Rapper, Sub Vocal, Visual";
        System.out.println("Posisi Sebagai : " + Kai.posisi);
        Kai.Group();
        Kai.rilis();        
        Kai.BrandAmbasador();
        
        DO.nama = "Do Kyung Soo";
        System.out.println("Nama : " + DO.nama);
        DO.member();
        DO.unit = "Solo";
        System.out.println("Berada di Unit : " + DO.unit);
        DO.posisi = "Main Vocal";
        System.out.println("Posisi Sebagai : " + DO.posisi);
        DO.Group();
        DO.rilis();      
        DO.HotNews();
        
        Chen.nama = "Kim Jong Dae";
        System.out.println("Nama : " + Chen.nama);
        Chen.member();
        Chen.unit = "EXO-CBX"; 
        System.out.println("Berada di Unit : " + Chen.unit);
        Chen.posisi = "Main Vocal";
        System.out.println("Posisi Sebagai : " + Chen.posisi);
        Chen.Group();
        Chen.rilis();        
        Chen.jadwal();
    }
}
