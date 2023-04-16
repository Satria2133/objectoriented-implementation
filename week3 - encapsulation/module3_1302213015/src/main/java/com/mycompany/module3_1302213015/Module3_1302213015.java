/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module3_1302213015;

/**
 *
 * @author glori
 */
public class Module3_1302213015 {

    public static void main(String[] args) {
       Lingkaran lingkaran = new Lingkaran();
       lingkaran.printWarna("Biru");
       lingkaran.printKeliling(14);
       lingkaran.printLuas(21);
    }
}

class Lingkaran {
    static final double PHI_VALUE = 22/7;
    String warna;
    double jariJari;
    void printWarna(String warna) {
        this.warna = warna;
        System.out.println("Warna lingkaran adalah " + this.warna);
};
    void printKeliling(double jariJari) {
        this.jariJari = jariJari;
        double keliling = PHI_VALUE * this.jariJari * 2;
        System.out.println("Keliling lingkaran adalah " + keliling);
        
    };
    void printLuas(double jariJari) {
        this.jariJari = jariJari;
        double luas = PHI_VALUE * this.jariJari * this.jariJari;
        System.out.println("Luas lingkaran adalah " + luas);
    };
}
