/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5_Tugas_Enkapsulasi;

/**
 *
 * @author mmccom
 */
public class EXO {
   
   String nama;
   String unit;
   String posisi;
   private String agensi;
   private String kontrak;
   
   public void Setagensi(String agensi){
       this.agensi = agensi;
   }
   public void Setkontrak (String kontrak){
       this.kontrak = kontrak;
   }
    public String Getagensi(){
        return this.agensi;
    }
    public String Getkontrak(){
        return this.kontrak;
    }
  
    void member(){
        System.out.println("Nama Member, Unit, Posisi, Berita :");
        System.out.println("+=========================+");
    }
    void Group(){
        System.out.println("Dari Boy Group : EXO");
    }
}
