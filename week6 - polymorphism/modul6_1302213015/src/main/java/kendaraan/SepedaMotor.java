/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author glori
 */
public class SepedaMotor {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;

    public SepedaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
        ukuranTangki = 3;
        waktuIsiBensin = null;
    }
    
    public void isiTangkiFull(){
        waktuIsiBensin = LocalDateTime.now();
    }
    
    public String cekKapanHabis(){
        LocalDateTime waktuHabis = waktuIsiBensin.plusMinutes(ukuranTangki*60);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return waktuHabis.format(format);
    }
    
    public boolean jalan(){
        if (this.waktuIsiBensin == null) {
            System.out.println("Bensin habis, sepeda motor tidak dapat jalan");
            return false;
        }else {
            System.out.println("Sepeda motor sedang berjalan");
            return true;
        }

    }
}
