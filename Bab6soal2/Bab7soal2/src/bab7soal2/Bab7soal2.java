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
        // Todo code aplication logic here
        String nim = "1111111";
        String nama = "Agustav";
        int tahun = 3;
        char peminatan = 'M'; // Pilihan peminatan: M untuk Pemograman Mobile, J untuk java
        
        // Menampilkan input yang di tetapkan
        System.out.println("### Pendataan siswa ###");
        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("TAHUN : " + tahun);
        System.out.println("PILIH PEMINATAN : " + peminatan);
        
       // Menentukan output berdasarkan pilihan peminatan
       System.out.println("\nOutput : ");
       switch (peminatan) {
           case 'M':
               System.out.println("PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA 2");
               break;
           case 1:
               System.out.println("Bahasa inggris, Matematika, sains");
               break;
           case 2:
               switch (peminatan) {
                   case 'C':
                       System.out.println("Sistem operasi, pemograman java, Struktur data");
                       break;
                   case 'E':
                       System.out.println("Algoritma, Logika Informatika");
                       break;
                  case 'M':
                      System.out.println("DBMS,Manajemen proyek");
                      break;     
               }
                      break;
           case 3:
               switch (peminatan) {
                   case 'C':
                       System.out.println("Organisasi komputer, multimedia");
                       break;
                   case 'E':
                       System.out.println("Peracangan sistem, pemograman web");
                       break;
                   case 'M':
                       System.out.println("Pemograman mobile, pemograman java 2");
                       break;
               }
           case 4:
               switch (peminatan) {
                   case 'C':
                       System.out.println("KOMUNIKASI DATA,MULTIMEDIA");
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

     