/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodule10_1302213015;

import java.time.LocalDateTime;

/**
 *
 * @author glori
 */
public class TanggalHelper {
       public static final int WAKTU_MACET = 60;

    public static String tambahMenit(LocalDateTime waktu, int menit) {
        LocalDateTime waktuBaru = waktu.plusMinutes(menit);
        return waktuBaru.toString().replace('T', ' ').substring(0, 16);
    }

    public static String tambahJam(LocalDateTime waktu, int jam) {
        LocalDateTime waktuBaru = waktu.plusHours(jam);
        return waktuBaru.toString().replace('T', ' ').substring(0, 16);
    }
}
