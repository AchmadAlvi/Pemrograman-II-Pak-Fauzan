/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author mmccom
 */
public class CIMBNIAGA extends Sistem {
     
      public void suku_bunga(){
        System.out.println("\tSuku Bunga Deposit Bank CIMB NIAGA : ");
        System.out.println("\n\t| 1. 1 bulan: 2.75%\n");
        System.out.println("\t| 2. 3 bulan: 3.50%\n");
        System.out.println("\t| 3. 6 bulan: 3.75%\n");
        System.out.println("\t| 4. 12 bulan: 4%\n");
    }
    
    public void uji_satu_bulan(int saldo){
        System.out.println("\tJumlah Saldo : " + saldo);
        int bunga = (int) (saldo * 0.275);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 1 Bulan : " + bunga);
        System.out.println("\tJumlah Total Uang : " + saldo);
    }
    
    public void uji_tiga_bulan(int saldo){
        int bunga = (int) (saldo * 0.035);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 3 Bulan : " + bunga);
        System.out.println("\tJumlah Total : " + saldo);
    }
     
    public void uji_enam_bulan(int saldo){
        int bunga = (int) (saldo * 0.0375);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 6 Bulan : " + bunga);
        System.out.println("\tJumlah Total : " + saldo);
    }
    
    public void uji_satu_tahun(int saldo){
        int bunga = (int) (saldo * 0.04);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 1 Tahun : " + bunga);
        System.out.println("\tJumlah Total : " + saldo);
    }
    
     @Override
    public void Lainnya(){
        System.out.println("\n\tSuku Bunga Acuan (BI Rate) saat ini adalah 5,50%.");
        System.out.println("\n\tSuku bunga kartu kredit CIMB NIAGA :");
        System.out.println("\t| 1. Platinum : 15% per tahun");
        System.out.println("\t| 2. Classic : 18% per tahun");
        System.out.println("\n\tSuku bunga pinjaman online CIMB NIAGA :");
        System.out.println("\t| 1. Pinjaman Cepat ANZ : 2,95% per tahun");
        System.out.println("\t| 2. CIMB Niaga Cash Loan : 11,88% per tahun");
        System.out.println("\t| 3. OCTO Clicks CIMB Niaga : 7,5% per tahun");
    }
}

