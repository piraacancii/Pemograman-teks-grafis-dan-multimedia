/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab17soal2;

/**
 *
 * @author ACER
 */
public class Bab17soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] negaraDanIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Mengakses dan menampilkan data dari array
        for (int i = 0; i < negaraDanIbukota.length; i++) {
            String negara = negaraDanIbukota[i][0];
            String ibukota = negaraDanIbukota[i][1];
            System.out.println("Ibukota " + negara + " adalah " + ibukota);
        }
    }
    
}
