/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab13soal1;

/**
 *
 * @author ACER
 */
public class CalculatorSederhana {
      // Kelas CalculatorSederhana sebagai kelas bersarang statis
        // Metode untuk penambahan dengan dua parameter
        int tambah(int a, int b) {
            return a + b;
        }

        // Metode untuk penambahan dengan tiga parameter
        int tambah(int a, int b, int c) {
            return a + b + c;
        }

        // Metode untuk pengurangan dengan dua parameter
        int pengurangan(int a, int b) {
            return a - b;
        }

        // Metode untuk perkalian dengan dua parameter
        int perkalian(int a, int b) {
            return a * b;
        }
        
        // Metode untuk pembagian dengan dua parameter
        double pembagian(int a, int b) {
            if (b != 0) {
                return (double) a / b;
            } else {
                System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                return Double.NaN; // Menandakan hasil tidak valid
            }
        }
}
