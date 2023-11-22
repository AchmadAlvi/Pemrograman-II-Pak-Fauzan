/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author mmccom
 */
public class Sistem {
    // Variabel yang akan di wariskan
    String Nama;
    String Nim;
    String Prodi;
    String Matkul;
    
    // Method yang akan di wariskan
    public void tampilan(){
         System.out.println("\t=======     SELAMAT DATANG DI SISTEM     =======\n");
         System.out.println("\t=======   Informasi Suku Bunga Deposit   =======\n");
    }
    
    // Method yang diwariskan
    public void Lainnya(){
        System.out.println("\n\tInformasi Lainnya : ");
    }
}
