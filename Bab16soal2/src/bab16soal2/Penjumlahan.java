/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab16soal2;

/**
 *
 * @author ACER
 */
public class Penjumlahan extends OperasiAritmatika {
    public Penjumlahan(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {
        return a + b;
    }
}

