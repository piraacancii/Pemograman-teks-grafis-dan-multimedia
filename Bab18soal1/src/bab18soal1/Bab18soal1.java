/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab18soal1;

/**
 *
 * @author ACER
 */
public class Bab18soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] numbers = {1, 2, 3};

        try {
            // Mencoba mengakses elemen yang tidak ada
            System.out.println("Elemen ke-4: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menangkap dan menangani exception
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        System.out.println("Program berlanjut setelah menangani exception.");
    }
    
}
