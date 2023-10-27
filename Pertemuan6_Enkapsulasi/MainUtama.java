/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6_Enkapsulasi;

/**
 *
 * @author mmccom
 */
public class MainUtama {
    public static void main(String[] args) {
        User user = new User();
        
        user.SetUsername("Achmad Alvi");
        user.SetPasword("Secret");
        
        System.out.println("Usernamenya = " + user.GetUsername());
        System.out.println("Passwordnya = " + user.GetPassword());
    }
}
