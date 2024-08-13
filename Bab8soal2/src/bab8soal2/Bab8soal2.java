/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8soal2;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Bab8soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
     
     System.out.print("TAHUN AKHIR?:");
     int AKHIR = input.nextInt();
     
     System.out.print("TAHUN AWAL?:");
     int AWAL = input.nextInt();
     
        for (int tahun = AKHIR; tahun >= AWAL; tahun-- ) {
                System.out.println(tahun);
            }
        }
 }
