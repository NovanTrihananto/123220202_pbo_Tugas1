/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author ASUS
 */
public class Pisang extends Buah{
    public Pisang(String Nama){
        super();
        this.setNama(Nama);
    }
    @Override
    public void Rasabuah(){
        System.out.println(super.getNama()+ " memiliki rasa manis");
    }
    @Override
       public void Warnabuah(){
        System.out.println(super.getNama()+ " memiliki warna kuning");
    }
}
