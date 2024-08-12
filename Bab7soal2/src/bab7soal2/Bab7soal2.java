/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab7soal2;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Bab7soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nim = "1111111";
        String nama = "Agustav";
        int tahun = 3;
        char peminatan = 'M'; // Pilihan peminatan: M untuk Pemograman Mobile, J untuk java
        
        // Menampilkan input yang ditetapkan
        System.out.println("### Pendataan Mahasiswa ###");
        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("TAHUN : " + tahun);
        System.out.println("PILIH PEMINATAN : " + peminatan);
        
        // Menentukan output berdasarkan pilihan peminatan
        System.out.println("\noutput : ");
        switch (peminatan) {
            case 'M':
                System.out.println("PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA 2");
                break;
            case 4:
                switch ( peminatan ) {
                    case 'C':
                        System.out.println("KOMUNIKASI DATA, MULTIMEDIA");
                        break;
                    case 'E':
                        System.out.println("SISTEM TERDISTRIBUSI, IMAGE PROCESSING");
                        break;
                    case 'M':
                        System.out.println("SIM, sistem jaringan");
                        break;
                }
                        break;
        }
    }
    
}
