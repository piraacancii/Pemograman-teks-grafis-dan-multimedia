/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab15soal2;

/**
 *
 * @author ACER
 */

public class Bab15soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Kalkulator kalkulator = new Kalkulator();
        try {
            float hasil = kalkulator.pembagian(10.0f, 2.0f);
            System.out.println("Hasil Pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } 
        int hasil = kalkulator.pengurangan(10, 5);
        System.out.println("Hasil Pengurangan: " + hasil);   
       }
       
}

