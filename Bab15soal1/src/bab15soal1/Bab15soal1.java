/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab15soal1;

/**
 *
 * @author ACER
 */
public class Bab15soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();

        // Menguji metode penjumlahan
        System.out.println("Penjumlahan: " + kalkulator.penjumlahan(10, 5)); // Output: 15

        // Menguji metode pengurangan
        System.out.println("Pengurangan: " + kalkulator.pengurangan(10, 5)); // Output: 5

        // Menguji metode pembagian
        System.out.println("Pembagian: " + kalkulator.pembagian(10.0f, 5.0f)); // Output: 2.0

        // Menguji metode perkalian
        System.out.println("Perkalian: " + kalkulator.perkalian(10.0f, 5.0f)); // Output: 50.0
    }
}
