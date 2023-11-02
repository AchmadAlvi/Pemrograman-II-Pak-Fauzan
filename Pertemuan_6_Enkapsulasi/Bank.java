/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6_Enkapsulasi;

/**
 *
 * @author mmccom
 */
public class Bank {
    public static void main(String[] args) {
        
        AkunBank akun = new AkunBank();
        
        akun.setNoRek("2255201034");
        akun.setPemilik("Achmad Alvi");
        akun.setSaldo(100000);
        
        System.out.println("Saldo Awal : " + akun.getSaldo());
        
        akun.deposit(50000);
        System.out.println("\nSetor Uang 50000 ");
        System.out.println("NO Rekening : " + akun.getNoRek());
        System.out.println("Pemilik : " + akun.getPemilik());
        System.out.println("Saldo setelah Deposit : " + akun.getSaldo());
        
        
        akun.TarikUang(40000);
        System.out.println("\nTarik Uang 40000 ");
        System.out.println("NO Rekening : " + akun.getNoRek());
        System.out.println("Pemilik : " + akun.getPemilik());
        System.out.println("Saldo setelah Penarikan : " + akun.getSaldo());
    }
}
