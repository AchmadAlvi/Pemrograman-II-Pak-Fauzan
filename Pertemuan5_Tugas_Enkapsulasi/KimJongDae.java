/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5_Tugas_Enkapsulasi;

/**
 *
 * @author mmccom
 */
public class KimJongDae extends EXO {
    @Override
    public void member(){
       System.out.println("Nama Member = " + nama);
       System.out.println("Unit = " + unit);
       System.out.println("Posisi sebagai = " + posisi);
    }
    void rilis(){
        System.out.println("Bersama dengan EXO-CBX akan merilis album baru berjudul Magical Circus ");
    }
    void jadwal(){
        System.out.println("chen sedang mempersiapkan Solo Mini Album pertama di jepang");
        System.out.println("+==============================================================+");
    }
}
