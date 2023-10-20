/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4_PraktikBangunDatar;

/**
 *
 * @author mmccom
 */
public class Main {
    public static void main(String[] args) {
        // Objek Bangu Datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // objek persegi
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        // Objek Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        // Objek Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        // Objel Segitiga
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        // Memanggil Method
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
                
    }
}
