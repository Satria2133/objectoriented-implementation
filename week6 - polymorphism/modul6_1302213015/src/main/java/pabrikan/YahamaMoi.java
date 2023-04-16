/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pabrikan;

import kendaraan.SepedaMotor;

/**
 *
 * @author glori
 */
public class YahamaMoi extends SepedaMotor {
    
    public YahamaMoi(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 5;
    }
     @Override
    public boolean jalan(){
        String waktuHabis = cekKapanHabis();
        System.out.println("Sepeda motor sedang berjalan");
        System.out.println("Bensin akan habis pada " + waktuHabis);
        return true;
    };
}
