/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab15soal2;

/**
 *
 * @author ACER
 */
public class Kalkulator {
    // Metode penjumlahan
    public int penjumlahan(int a, int b) {
        return a + b;
    }
    
    // Metode pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    // Metode pembagian
    public float pembagian(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
             throw new ArithmeticException("Pembagi tidak boleh nol");
        }
    }
    
    // Metode perkalian
    public float perkalian(float a, float b) {
        return a * b;
        }
}
