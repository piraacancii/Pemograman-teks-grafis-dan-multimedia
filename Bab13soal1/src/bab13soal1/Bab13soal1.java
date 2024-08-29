/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab13soal1;

/**
 *
 * @author ACER
 */
public class Bab13soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Membuat objek CalculatorSederhana
        CalculatorSederhana objek = new CalculatorSederhana();

        // Menampilkan hasil operasi
        System.out.println("Hasil Pertambahan : " + objek.tambah(10, 20));
        System.out.println("Hasil Pertambahan (3 angka) : " + objek.tambah(10, 20, 30));
        System.out.println("Hasil Pengurangan : " + objek.pengurangan(20, 10));
        System.out.println("Hasil Perkalian : " + objek.perkalian(20, 10));
        System.out.println("Hasil Pembagian : " + objek.pembagian(20, 10));
    }
}