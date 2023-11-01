/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6_Enkapsulasi;

/**
 *
 * @author mmccom
 */
public class AkunBank {
    private String NoRek;
    private String Pemilik;
    private int Saldo;
    
    public void setNoRek(String NoRek){
         this.NoRek = NoRek;
    }
    
    public void setPemilik(String Pemilik){
        this.Pemilik = Pemilik; 
    }
    
    public void setSaldo (int Saldo){
        this.Saldo = Saldo;
    }
      
    public String getNoRek(){
        return NoRek;
    }
    
    public String getPemilik(){
        return Pemilik;
    }
    public int getSaldo(){
        return Saldo;
    }
    
    public void deposit(int nominal){
        if(nominal > 0){
            Saldo += nominal;
        }
    }
    
    public void TarikUang(int nominal){
        if(nominal > 0 && nominal <= Saldo){
            Saldo -= nominal;
        }
    }
    
    @Override
    public String toString(){
        return "NO REKENING: " + NoRek + "\nPemilik Rekening: " + Pemilik + "\nSaldo : " + Saldo;
    }
}
