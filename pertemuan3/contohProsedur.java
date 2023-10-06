/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author mmccom
 */
public class contohProsedur {
    int a = 4;
    int t = 10;
    int b = 6;
    
    void HitungLuasJajarGenjang(){
        int luas = a * t;
        System.out.println("Alas = " + a);
        System.out.println("Tinggi = " + t);
        System.out.println("Luas Jajar Genjang = " + luas);
    }
    
    void HitungKelilingJajarGenjang(){
        int keliling = 2 * (a+b);
        System.out.println("Sisi A = " + a);
        System.out.println("Sisi B = " + b);
        System.out.println("Keliling Jajar Genjang = " + keliling);
    }
    public static void main(String[] args) {
        contohProsedur Q = new contohProsedur();
        Q.HitungLuasJajarGenjang();
        Q.HitungKelilingJajarGenjang();
    }
}
