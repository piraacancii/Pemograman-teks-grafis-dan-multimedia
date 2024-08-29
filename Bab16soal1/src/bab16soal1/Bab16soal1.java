/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab16soal1;

/**
 *
 * @author ACER
 */
public class Bab16soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 9.5;
        double b = 2.5;

        OperasiAritmatika penjumlahan = new Penjumlahan(a, b);
        OperasiAritmatika pengurangan = new Pengurangan(a, b);
        OperasiAritmatika perkalian = new Perkalian(a, b);
        OperasiAritmatika pembagian = new Pembagian(a, b);

        System.out.println("Hasil Penjumlahan: " + penjumlahan.hitung());
        System.out.println("Hasil Pengurangan: " + pengurangan.hitung());
        System.out.println("Hasil Perkalian: " + perkalian.hitung());

        try {
            System.out.println("Hasil Pembagian: " + pembagian.hitung());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
