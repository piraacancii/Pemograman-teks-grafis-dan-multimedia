/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab16soal1;

/**
 *
 * @author ACER
 */
public abstract class OperasiAritmatika {
   protected double a;
    protected double b;

    public OperasiAritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected abstract double hitung();
}

