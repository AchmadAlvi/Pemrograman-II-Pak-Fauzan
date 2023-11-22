/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7_DinamicPolymorphism_Tugas;

/**
 *
 * @author mmccom
 */
public class Paypall extends SistemPembayaran {
     double Dollar;
        
        public Paypall(double Dollar){
            this.Dollar = Dollar;
        }
    
    @Override
    public void Pembayaran(){
        System.out.println("\nMelakukan Pembayaran menggunakan Paypall");
        double pay = Dollar * 0.05;
        Dollar += pay;
        System.out.println("Melakukan Pembayaran Sebesar : $" + Dollar);
    }
}
