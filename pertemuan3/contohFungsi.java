/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author mmccom
 */
public class contohFungsi {
    
    int a = 4, t = 10, b = 6; 
    
    int hitungLuasJajarGenjang(){
        int luas = a* t;
        System.out.println("Alas = " + a);
        System.out.println("Tinggi = " + t);
        return luas;
        
    }
    
    int hitungKelilingJajarGenjang(){
        int keliling = 2 * (a+b);
        System.out.println("Sisi A = " + a);
        System.out.println("Sisi B = " + b);
        return keliling;
    }
    
    public static void main(String[] args) {
        contohFungsi R = new contohFungsi();
        System.out.println("Luas Jajar Genjang = " + R.hitungLuasJajarGenjang());
        System.out.println("Kelilng Jajar Genjang = " + R.hitungKelilingJajarGenjang());
    }
}
