/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7_DinamicPolymorphism_Tugas;

/**
 *
 * @author mmccom
 */
public class RunPembayaran {
    public static void main(String[] args) {
        SistemPembayaran bayar = new SistemPembayaran();
        KartuKredit kredit = new KartuKredit(115);
        Paypall pay = new Paypall(115);
        TransferBank bank = new TransferBank(115);
        
        bayar.Pembayaran();
        kredit.Pembayaran();
        pay.Pembayaran();
        bank.Pembayaran();
    }
}
