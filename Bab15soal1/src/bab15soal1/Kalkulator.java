/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab15soal1;

/**
 *
 * @author ACER
 */
public class Kalkulator {
     // Method untuk penjumlahan
    public int penjumlahan(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk pembagian
    public float pembagian(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }
     
      // Method untuk perkalian
    public float perkalian(float a, float b) {
        return a * b;
    }
     
}
