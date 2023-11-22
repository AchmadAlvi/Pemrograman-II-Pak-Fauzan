/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;
/**
 *
 * @author mmccom
 */
public class BNI extends Sistem {
    
    // Method yang menapilkan suku bunga deposit Bank BNI
    public void suku_bunga(){
        System.out.println("\tSuku Bunga Deposit Bank BNI : ");
        System.out.println("\n\t| 1. 1 bulan: 4.5%\n");
        System.out.println("\t| 2. 3 bulan: 5.25%\n");
        System.out.println("\t| 3. 6 bulan: 6%\n");
        System.out.println("\t| 4. 12 bulan: 6.75%\n");
    }
    
    // Method yang akan digunakan untuk uji coba perhitungan suku bunga dengan saldo yang di inginkan
    public void uji_satu_bulan(int saldo){
        System.out.println("\tJumlah Saldo : " + saldo);
        int bunga = (int) (saldo * 0.045);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 1 Bulan : " + bunga);
        System.out.println("\tJumlah Total Uang : " + saldo);
    }
    
    public void uji_tiga_bulan(int saldo){
        int bunga = (int) (saldo * 0.0525);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 3 Bulan : " + bunga);
        System.out.println("\tJumlah Total : " + saldo);
    }
     
    public void uji_enam_bulan(int saldo){
        int bunga = (int) (saldo * 0.06);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 6 Bulan : " + bunga);
        System.out.println("\tJumlah Total : " + saldo);
    }
    
    public void uji_satu_tahun(int saldo){
        int bunga = (int) (saldo * 0.0675);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 1 Tahun : " + bunga);
        System.out.println("\tJumlah Total : " + saldo);
    }
    
    // Method yang menggunakan konsep Overidding dan berisi informasi lainnya tentang suku bunga bank
    @Override
    public void Lainnya(){
        System.out.println("\n\tSuku Bunga Acuan (BI Rate) saat ini adalah 5,50%.");
        System.out.println("\n\tSuku bunga kartu kredit BNI :");
        System.out.println("\t| 1. BNI Card Platinum : 15% per tahun");
        System.out.println("\t| 2. BNI Card Gold/Classic : 18% per tahun");
        System.out.println("\n\tSuku bunga pinjaman online BNI :");
        System.out.println("\t| 1. Pinjaman Tunai BNI (PT BNI) : 2,95% per tahun");
        System.out.println("\t| 2. Kredit Tanpa Agunan (KTA) BNI : 11,88% per tahun");
    }
}
