/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticPolymorphismLatihan;

/**
 *
 * @author mmccom
 */
public class lingkaran {
    // Luas Menggunakan jari-jari
    float luas(float jarijari){
        return (float)(Math.PI * jarijari * jarijari);
    }
    // Luas menggunakan diamater
    double luas(double diameter){
        return (Math.PI * diameter * 1/4);
    }
    
    public static void main(String[] args) {
        lingkaran L = new lingkaran();
       
        float jari2 = 10;
        double d = 20;
        
        System.out.println("Luas Lingkaran Meggunakan jari-jari : " + L.luas(jari2));
        System.out.println("Luas Lingkaran Menggunakan Diameter : " + L.luas(d));
    }
}
