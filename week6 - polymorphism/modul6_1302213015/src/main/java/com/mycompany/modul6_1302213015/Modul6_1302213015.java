/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul6_1302213015;

import kendaraan.SepedaMotor;
import pabrikan.HandoBaet;
import pabrikan.YahamaMoi;

/**
 *
 * @author glori
 */
public class Modul6_1302213015 {

    public static void main(String[] args) {
       YahamaMoi yamaha = new YahamaMoi("Hijau");
       yamaha.isiTangkiFull();
       yamaha.cekKapanHabis();
       yamaha.jalan();
       
       HandoBaet honda = new HandoBaet("Hijau");
       honda.isiTangkiFull();
       honda.cekKapanHabis();
       honda.jalan();
       
       SepedaMotor motor = new SepedaMotor("Kuning");
       motor.jalan();
       motor.isiTangkiFull();
       motor.cekKapanHabis();
       motor.jalan();
       
    }
}
