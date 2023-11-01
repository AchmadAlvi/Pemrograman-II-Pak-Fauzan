/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4_PraktikEnemy;

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
        
        monster.attack();
        System.out.println("Ketika Monster melihat user, Monster akan menyerang\n" );  
        
        // Variable
        zumbi.name = "Josh";
        System.out.println("Nama Zombie : " + zumbi.name);
        zumbi.hp = 1000;
        System.out.println("Health Poin Zombie : " + zumbi.hp);
        zumbi.attackpoin = 50;
        System.out.println("Attack Poin Zombie : " + zumbi.attackpoin);
        zumbi.attack();
        zumbi.walk();
        
        hantuPocong.name = "Yanto";
        System.out.println("Nama Pocong : " + hantuPocong.name);
        hantuPocong.hp = 1000;
        System.out.println("Health Poin Pocong : " + hantuPocong.hp);
        hantuPocong.attackpoin = 40;
        System.out.println("Attack Poin Pocong : " + hantuPocong.attackpoin);
        hantuPocong.attack();
        hantuPocong.jump();
        
        garuda.name = "Dread Queen";
        System.out.println("Nama Burung : " + garuda.name);
        garuda.hp = 5000;
        System.out.println("Health Poin Burung : " + garuda.hp);
        garuda.attackpoin = 100;
        System.out.println("Attack Poin Burung : " + garuda.attackpoin);
        garuda.attack();
        garuda.walk();
        garuda.jump();
        garuda.Fly();
    }
}
