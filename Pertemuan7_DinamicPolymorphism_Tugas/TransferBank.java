/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7_DinamicPolymorphism_Tugas;

/**
 *
 * @author mmccom
 */
public class TransferBank extends SistemPembayaran {
    double Dollar;
        
        public TransferBank(double Dollar){
            this.Dollar = Dollar;
        }
    
    @Override
    public void Pembayaran(){
        System.out.println("\nMelakukan Pembayaran dengan Transfer Bank");
        double bank = Dollar * 0.035;
        Dollar += bank;
        System.out.println("Melakukan Pembayaran Sebesar : $" + Dollar);
    }
}
