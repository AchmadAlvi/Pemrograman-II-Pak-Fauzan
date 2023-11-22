/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;
import java.util.Scanner;

/**
 *
 * @author mmccom
 */
public class RunSistem {
    // Ini mendeklarasikan sebuah variabel bernama menu bertipe data int denganmodifier/access specifier private dan static.
    // private artinya variabel menu ini hanya bisa diakses di dalam class ini sendiri, 
    // tidak bisa diakses dari subclass atau class lain.
    // static artinya variabel menu ini adalah static variable,
    // nilainya sama / common untuk semua object dari class tersebut. Tidak perlu membuat object untuk mengaksesnya.
    private static int menu;
    
    public static void main(String[] args) {
        
        // Objek class yang akan digunakan untuk memanggil method yang berada di class induk atau anak
        Sistem sis = new Sistem();
        Login log = new Login();
        BNI bni = new BNI();
        BRI bri = new BRI();
        BCA bca = new BCA();
        CIMBNIAGA niaga = new CIMBNIAGA();
        
        // Pewarisan atribut atau variabel
        sis.Nama = "Achmad Alvi Yudanuari";
        System.out.println("Nama : " + sis.Nama);
        sis.Nim = "2255201034";
        System.out.println("Nim : " + sis.Nim);
        sis.Matkul = "Pemrograman II";
        System.out.println("Mata Kuliah : " + sis.Matkul);
        sis.Prodi = "Ilmu Komputer";
        System.out.println("Program Studi : " + sis.Prodi + "\n");
        
        // Pemanggilan method pada clas induk Sistem dan class anak login
        sis.tampilan();
        log.tampilan();
        log.login();
        
        // Merupakan inisialisasi objek Scanner yang terhubung dengan input standar (keyboard) pada Java.
        Scanner input = new Scanner(System.in);
        
        // Program yang akan menampilkan tampilan menu
        do{
           System.out.println("\n\t======== Informasi Suku Bunga Deposit ========");
           System.out.println("\t[1] Bank BNI");
           System.out.println("\t[2] BANK BRI");
           System.out.println("\t[3] BANK BCA");
           System.out.println("\t[4] BANK CIMB NIAGA");
           System.out.println("\t[5] KELUAR");  
           System.out.print("\tPilih Opsi : ");
           
           // Merupakan cara untuk menerima input angka dari user dan menyimpannya ke dalam sebuah variabel.
           int pilih = input.nextInt(); 
           
           // menggunakan percabangan swith case untuk pilihan opsi pada menu
           switch (pilih) {
               
            // case yang berisi tampilan dari Method yang di panggil dari class anak BNI dan pewarisan method dari calss induk
                    case 1 -> {
                        bni.tampilan();
                        bni.suku_bunga();
                        bni.uji_satu_bulan(100000);
                        bni.uji_tiga_bulan(100000);
                        bni.uji_enam_bulan(100000);
                        bni.uji_satu_tahun(100000);
                        sis.Lainnya();
                        bni.Lainnya();
                }
                    
             // case yang berisi tampilan dari Method yang di panggil dari class anak BRI dan pewarisan method dari calss induk        
                    case 2 -> {
                        bri.tampilan();
                        bri.suku_bunga();
                        bri.uji_satu_bulan(100000);
                        bri.uji_tiga_bulan(100000);
                        bri.uji_enam_bulan(100000);
                        bri.uji_satu_tahun(100000);
                        sis.Lainnya();
                        bri.Lainnya();
                }
                    
              // case yang berisi tampilan dari Method yang di panggil dari class anak BCA dan pewarisan method dari calss induk       
                    case 3 -> {
                        bca.tampilan();
                        bca.suku_bunga();
                        bca.uji_satu_bulan(100000);
                        bca.uji_tiga_bulan(100000);
                        bca.uji_enam_bulan(100000);
                        bca.uji_satu_tahun(100000);
                        sis.Lainnya();
                        bca.Lainnya();
                }
                    
              // case yang berisi tampilan dari Method yang di panggil dari class anak CIMBNIAGA dan pewarisan method dari calss induk
                    case 4 -> {
                        niaga.tampilan();
                        niaga.suku_bunga();
                        niaga.uji_satu_bulan(100000);
                        niaga.uji_tiga_bulan(100000);
                        niaga.uji_enam_bulan(100000);
                        niaga.uji_satu_tahun(100000);
                        sis.Lainnya();
                        niaga.Lainnya();
                }
                    
             // case yang berisi perintah keluar dari program       
                    case 5 -> System.exit(0);
                    default -> System.out.println("Piihan Anda Tidak Ada!");
                }
           
           // Jika tidak sama dengan 5 angka maka akan muncul pilihan anda tidak ada 
        }while(menu != 5);
    }
}
