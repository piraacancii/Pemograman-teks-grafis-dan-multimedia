/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab18soal2;

/**
 *
 * @author ACER
 */
public class Bab18soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {     
            // Kode di bawah ini tidak akan melemparkan exception     
            Float data = 500 / 15f;     
            System.out.println(data);     
        } catch (NullPointerException e) {   
            System.out.println(e);   
        } finally {   
            System.out.println("blok finally akan selalu di eksekusi");   
        }     
    }     
    
}
