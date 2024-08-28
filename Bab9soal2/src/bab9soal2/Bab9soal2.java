/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal2;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Bab9soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
       
       // Input nilai awal
       System.out.print("Masukan bilangan awal: ");
       int nilaiAwal = scanner.nextInt();
       
       // Input nilai akhir
       System.out.print("Masukan bilangan akhir: ");
       int nilaiAkhir = scanner.nextInt();
       
       // Mencetak deret bilangan
       System.out.print("Hasil deret bilangan: ");
       
       for (int i = nilaiAwal; i <= nilaiAkhir; i +=5) {
           System.out.print(i);
           if (i + 5 <= nilaiAkhir) { // Menambahksn koma kecuali bilangan akhir
               System.out.print(",");
           }
       }
       
       // Menutup scanner
       scanner.close();
}
}
