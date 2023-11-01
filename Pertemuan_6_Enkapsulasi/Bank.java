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
        
        akun.deposit(50000);
        System.out.println("Setelah Deposit 50000 : " + akun.toString());
        
        akun.TarikUang(40000);
        System.out.println("Setelah Penarikan 40000 : " + akun.toString());
        
    }
}
