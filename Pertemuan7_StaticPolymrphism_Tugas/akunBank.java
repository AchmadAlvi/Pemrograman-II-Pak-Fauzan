/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7_StaticPolymrphism_Tugas;

/**
 *
 * @author mmccom
 */
public class akunBank {
    double saldo = 15.75;
    
    double saldo(){
        return saldo;
    }
    
    double Transaksi(double Dollar){
        if(Dollar > 0){
              return (saldo += Dollar);
        }
        return 0;
    }
  
    float Transaksi(float Dollar){
        if(Dollar > 0 && Dollar <= saldo ){
            return(float) (saldo -= Dollar);
        }
        return 0; 
    }
    public static void main(String[] args) {
        
        akunBank akun = new akunBank();
        
        System.out.println("Saldo Awal : $" + akun.saldo());
        System.out.println("Setor Uang Sebesar : $" + akun.Transaksi(5.98));
        System.out.println("Tarik Uang Sebesar : $" + akun.Transaksi(9));
    }
    }
    
    
