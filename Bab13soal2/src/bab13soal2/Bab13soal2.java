/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab13soal2;

/**
 *
 * @author ACER
 */
public class Bab13soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Segitiga dengan alas dan tinggi
        Segitiga segitiga = new Segitiga(10, 5);

        // Menampilkan hasil perhitungan
        System.out.println("Alas: " + segitiga.getAlas());
        System.out.println("Tinggi: " + segitiga.getTinggi());
        System.out.println("Luas: " + segitiga.getLuas());
    }
}
