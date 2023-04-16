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
public class HandoBaet extends SepedaMotor {
    
    public HandoBaet(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 4; 
    }
    
    @Override
    public boolean jalan(){
        String waktuHabis = cekKapanHabis();
        System.out.println("Sepeda motor sedang berjalan");
        System.out.println("Bensin akan habis pada " + waktuHabis);
        return true;
    };
    
}
