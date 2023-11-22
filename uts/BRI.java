/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author mmccom
 */
public class BRI extends Sistem {
    
      public void suku_bunga(){
        System.out.println("\tSuku Bunga Deposit Bank BRI : ");
        System.out.println("\n\t| 1. 1 bulan: 2.25%\n");
        System.out.println("\t| 2. 3 bulan: 2.5%\n");
        System.out.println("\t| 3. 6 bulan: 2.75%\n");
        System.out.println("\t| 4. 12 bulan: 3%\n");
    }
    
    public void uji_satu_bulan(int saldo){
        System.out.println("\tJumlah Saldo : " + saldo);
        int bunga = (int) (saldo * 0.0225);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 1 Bulan : " + bunga);
        System.out.println("\tJumlah Total Uang : " + saldo);
    }
    
    public void uji_tiga_bulan(int saldo){
        int bunga = (int) (saldo * 0.025);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 3 Bulan : " + bunga);
        System.out.println("\tJumlah Total : " + saldo);
    }
     
    public void uji_enam_bulan(int saldo){
        int bunga = (int) (saldo * 0.0275);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 6 Bulan : " + bunga);
        System.out.println("\tJumlah Total : " + saldo);
    }
    
    public void uji_satu_tahun(int saldo){
        int bunga = (int) (saldo * 0.03);
        saldo += bunga;
        System.out.println("\n\tHasil Deposit 1 Tahun : " + bunga);
        System.out.println("\tJumlah Total : " + saldo);
    }
    
     @Override
    public void Lainnya(){
        System.out.println("\n\tSuku Bunga Acuan (BI Rate) saat ini adalah 5,50%.");
        System.out.println("\n\tSuku bunga kartu kredit BRI :");
        System.out.println("\t| 1. BRIZZI Platinum : 15% per tahun");
        System.out.println("\t| 2. BRIZZI Gold: 18% per tahun");
        System.out.println("\n\tSuku bunga pinjaman online BRI :");
        System.out.println("\t| 1. BRI Mobile Cash : 2,85% per tahun (untuk nasabah prioritas)");
        System.out.println("\t| 2. Mikrokredit Online BRI : 14% per tahun");
    }

}
