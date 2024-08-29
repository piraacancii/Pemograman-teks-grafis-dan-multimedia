/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab13soal2;

/**
 *
 * @author ACER
 */
public class Segitiga {
     // Kelas Segitiga
        private double alas;
        private double tinggi;
        private double luas;

        // Konstruktor dengan parameter
        public Segitiga(double alas, double tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.luas = hitungLuas();
        }

        // Metode untuk menghitung luas segitiga
        private double hitungLuas() {
            return (alas * tinggi) / 2;
        }

        // Metode untuk mendapatkan nilai alas
        public double getAlas() {
            return alas;
        }
        
        // Metode untuk mendapatkan nilai tinggi
        public double getTinggi() {
            return tinggi;
        }

        // Metode untuk mendapatkan nilai luas
        public double getLuas() {
            return luas;
        }
}
