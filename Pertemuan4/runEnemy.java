/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author mmccom
 */
public class runEnemy {
    public static void main(String[] args) {
        // Objek master class
        Enemy monster = new Enemy();
        // Objek Inheritance
        Zombie zumbi = new Zombie();
        Pocong hantuPocong = new Pocong();
        Burung garuda = new Burung ();
        
        // Variable
        zumbi.attack();
        zumbi.walk();
        
        hantuPocong.attack();
        hantuPocong.jump();
        
        garuda.attack();
        garuda.walk();
        garuda.jump();
        garuda.Fly();
    }
}
