/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author ASUS
 */
public abstract class Buah implements Rasa {
        private String nama;

    public String getNama() {
        return nama;
    }
    public void setNama(String Nama) {
        this.nama = Nama;
    } 
        @Override
        public void Rasabuah(){
    System.out.println("belum diketahui");
}    
        @Override
         public void Warnabuah(){
    System.out.println("belum diketahui");
}
}
