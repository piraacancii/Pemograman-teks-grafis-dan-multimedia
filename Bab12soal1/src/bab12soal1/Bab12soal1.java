/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab12soal1;

/**
 *
 * @author ACER
 */
public class Bab12soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                class Karyawan {
    String nama;
    double gaji;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
}
    class SystemAnalyst extends Karyawan {
    double bonus;
    double tunjanganMakan;
    double transport;

    public SystemAnalyst(String nama, double gaji, double bonus, double tunjanganMakan, double transport) {
        super(nama, gaji);
        this.bonus = bonus;
        this.tunjanganMakan = tunjanganMakan;
        this.transport = transport;
    }
     public double hitungGajiTotal() {
        double gajiTotal = gaji + bonus + tunjanganMakan + transport;
        return gajiTotal;
    }
}

        SystemAnalyst systemAnalyst = new SystemAnalyst("System Analyst", 400000, 100000, 40000, 50000);
        double gajiTotal = systemAnalyst.hitungGajiTotal();

        System.out.println("Gaji " + systemAnalyst.nama + " : " + systemAnalyst.gaji);
        System.out.println("Bonus : " + systemAnalyst.bonus);
        System.out.println("Tunjangan Makan : " + systemAnalyst.tunjanganMakan);
        System.out.println("Transport : " + systemAnalyst.transport);
        System.out.println("Gaji Total : " + gajiTotal);
    }
}
