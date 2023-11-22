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
public class Login extends Sistem {
    // Variabel yang menggunakan konsep enkapsulasi
    // private artinya variabel ini hanya bisa diakses di dalam class ini sendiri, 
    // tidak bisa diakses dari subclass atau class lain.
    private String username;
    private String pass;
    
    // Constructor pada class login 
    public Login(){
        this.username = username;
        this.pass = pass;
    }
    
    // Sebuah method dengan konsep Overidding
    @Override
    public void tampilan(){
         System.out.println("\t=======           LOGIN SISTEM           =======\n");
    }
    
    // Method yang akan di gunakan untuk menampilkan sistem login
    public void login(){ 
        do{
    Scanner input = new Scanner(System.in);
        System.out.println("\tMasukkan Username dan Password");
        System.out.print("\tUsername : ");
        username = input.nextLine();
        System.out.print("\tPassword : ");
        pass = input.nextLine();
        
        if(username.equals("Alvi") && pass.equals("1034")) {
        // jika sudah benar, hentikan perulangan
        break;
      }
      else {
        System.out.println("\tUsername atau password salah!");
      }

    // ulangi jika masih salah 
    } while(true);
    
    System.out.println("\tUsername dan password BENAR!");

  }
}

