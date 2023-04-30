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
public class Orang {
    public class Prokrastinasi {
    private int ngaretJam;
    private int ngaretMenit;

    public Prokrastinasi(int ngaretJam, int ngaretMenit) {
        this.ngaretJam = ngaretJam;
        this.ngaretMenit = ngaretMenit;
    }
    
     public int getNgaretJam() {
        return ngaretJam;
    }

    public int getNgaretMenit() {
        return ngaretMenit;
    }
    private int waktuSiapSiap(String input ){
        return switch (input) {
            case "pacar" -> 20;
            case "temen" -> 35;
            case "bos" -> 10;
            default -> 45;
        };
    }
    
    private int waktuKarenaLupa(){
        if (jumlahJanji < 3) {
            return 0;
        } else if (jumlahJanji < 5) {
            return 15;
        } else {
            return 45;
        }
    };
}
    private String nama;
    private String[] waktuDatang;
    private int jumlahJanji;
    private Prokrastinasi sifatNgaret;

    public Orang(String nama,  int ngaretJam, int ngaretMenit) {
        this.jumlahJanji = 0;
        this.nama = nama;
        this.waktuDatang = new String[10];
        this.sifatNgaret = new Prokrastinasi( ngaretJam, ngaretMenit );
        
    }
    public void tambahJanji(LocalDateTime waktuJanji, String siapa) {
        int menitNgaret = this.sifatNgaret.getNgaretJam() * 60 + this.sifatNgaret.getNgaretMenit();
        int menitSiapSiap = sifatNgaret.waktuSiapSiap(siapa);
        int menitKarenaLupa = sifatNgaret.waktuKarenaLupa();
        String waktuDatangBaru = TanggalHelper.tambahMenit(waktuJanji, menitNgaret + menitSiapSiap + menitKarenaLupa);
        if (jumlahJanji < 10) {
            this.waktuDatang[jumlahJanji] = waktuDatangBaru;
            this.jumlahJanji++;
        } else {
            System.out.println("Maaf, tidak dapat menambah janji baru karena sudah mencapai batas maksimum");
        }
    }


    public void tampilkanSemuaWaktuDatang() {
        for (int i = 0; i < jumlahJanji; i++) {
            System.out.println(waktuDatang[i]);
        }
    }
}
