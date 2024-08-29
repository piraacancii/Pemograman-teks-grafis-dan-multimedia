/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab17soal1;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Bab17soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat instance Scanner untuk input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Minta pengguna memasukkan jumlah kota
        System.out.print("Masukan Jumlah Kota : ");
        int jumlahKota = scanner.nextInt();  // Membaca jumlah kota yang dimasukkan
        scanner.nextLine();  // Membersihkan newline setelah membaca integer

        // Membuat array untuk menyimpan nama kota
        String[] kota = new String[jumlahKota];

        // Membaca nama kota dari pengguna
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + " : ");
            kota[i] = scanner.nextLine();
        }

        // Menutup scanner
        scanner.close();

        // Menampilkan nama kota yang telah dimasukkan
        System.out.println("Kota-kota yang dimasukan:");
        for (String k : kota) {
            System.out.println(k);
        }
    }
}
