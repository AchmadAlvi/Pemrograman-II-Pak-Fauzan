/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DinamicPolymorphismLatihan;

/**
 *
 * @author mmccom
 */
public class Segitiga extends bangunDatar {
    int alas;
    int tinggi;
    int a;
    int b;
    int c;
    
    public Segitiga (int alas, int tinggi, int a, int b, int c){
        this.alas = alas;
        this.tinggi = tinggi;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public float luas(){
        return this.alas * this.tinggi /2;
    }
    
    @Override
   public float keliling(){
        return this.a + this.b + this.c;
    }
}
