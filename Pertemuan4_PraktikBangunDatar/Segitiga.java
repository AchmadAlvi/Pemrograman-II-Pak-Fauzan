/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4_PraktikBangunDatar;

/**
 *
 * @author mmccom
 */
public class Segitiga extends BangunDatar {
float alas;
float tinggi;
float a;
float b;
float c;

@Override
float luas(){
    float luas = (alas * tinggi)/2;
    System.out.println("Luas Segitiga : " + luas);
    return luas;
}

@Override
float keliling(){
    float keliling = a + b + c;
    System.out.println("Keliling Segitiga : " + keliling + "\n");
    return keliling;
}
}
