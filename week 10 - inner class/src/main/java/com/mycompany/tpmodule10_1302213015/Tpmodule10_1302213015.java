/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmodule10_1302213015;

import java.time.LocalDateTime;

/**
 *
 * @author glori
 */
public class Tpmodule10_1302213015 {

    public static void main(String[] args) {
        Orang orang = new Orang("nama_praktikan", 1, 10);

        LocalDateTime waktuJanji1 = LocalDateTime.of(2022, 12, 2, 10, 0, 0);
        LocalDateTime waktuJanji2 = LocalDateTime.of(2022, 12, 3, 9, 0, 0);
        LocalDateTime waktuJanji3 = LocalDateTime.of(2022, 12, 3, 18, 30, 0);
        LocalDateTime waktuJanji4 = LocalDateTime.of(2022, 12, 4, 7, 30, 0);
        LocalDateTime waktuJanji5 = LocalDateTime.of(2022, 12, 4, 15, 0, 0);

        orang.tambahJanji(waktuJanji1, "bos");
        orang.tambahJanji(waktuJanji2, "temen");
        orang.tambahJanji(waktuJanji3, "pacar");
        orang.tambahJanji(waktuJanji4, "dosen");
        orang.tambahJanji(waktuJanji5, "temen");

        orang.tampilkanSemuaWaktuDatang();
    }
}
