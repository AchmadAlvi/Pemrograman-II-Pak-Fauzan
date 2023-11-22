/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DinamicPolymorphismLatihan;

/**
 *
 * @author mmccom
 */
public class runMain {
    public static void main(String[] args) {
        bangunDatar Bdatar = new bangunDatar();
        Persegi segi = new Persegi(5);
        Segitiga tiga = new Segitiga(5,6,5,4,3);
        Lingkaran ling = new Lingkaran(8);
        
        Bdatar.luas();
        Bdatar.keliling();
        
        System.out.println("Luas Persegi : " + segi.luas());
        System.out.println("Keliling Persegi : " + segi.keliling());
        
        System.out.println("Luas Segitiga : " + tiga.luas());
        System.out.println("Keliling Segitiga : " + tiga.keliling());
        
        System.out.println("Luas Lingkaran : " + ling.luas());
        System.out.println("Keliling Lingkaran : " + ling.keliling());
    }
}
