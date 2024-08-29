/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab16soal2;

/**
 *
 * @author ACER
 */
public class Bab16soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double a = 9.5;
        double b = 2.5;

        // Membuat array dari tipe OperasiAritmatika
        OperasiAritmatika[] operasi = new OperasiAritmatika[]{
            new Penjumlahan(a, b),
            new Pengurangan(a, b),
            new Perkalian(a, b),
            new Pembagian(a, b)
        };

        // Menggunakan polimorfisme untuk memanggil metode hitung()
        for (OperasiAritmatika op : operasi) {
            try {
                System.out.println("Hasil: " + op.hitung());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

