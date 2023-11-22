/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7_DinamicPolymorphism_Tugas;

/**
 *
 * @author mmccom
 */
public class KartuKredit extends SistemPembayaran {
    double Dollar;
        
        public KartuKredit(double Dollar){
            this.Dollar = Dollar;
        }
    
    @Override
    public void Pembayaran(){
        System.out.println("\nMelakukan Pembayaran menggunakan Kartu Kredit");
        double kredit = Dollar * 0.075;
        Dollar += kredit;
        System.out.println("Melakukan Pembayaran Sebesar : $" + Dollar);
    }
}
