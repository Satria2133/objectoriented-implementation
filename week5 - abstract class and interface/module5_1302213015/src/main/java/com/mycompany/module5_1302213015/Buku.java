/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module5_1302213015;

/**
 *
 * @author glori
 */
public class Buku {

  
    private String judul;
    private String KodeBuku;
    private int kuantitas;

    public Buku(String judul, int kuantitas) {
        this.judul = judul;
        this.kuantitas = kuantitas;
    }

    public String getJudul_1302213015() {
        return judul;
    }

    public void setJudul_1302213015(String judul) {
        this.judul = judul;
    }

    public String getGenre_1302213015() {
        if(KodeBuku != null && KodeBuku.startsWith("OTH")){
            return "Tidak tersedia";
        }else{
        return KodeBuku.substring(0, 3);
        }
    }
    public void setKodeBuku_1302213015(String KodeBuku) {
        if (KodeBuku.matches("(FIC|NFC|TXT)\\d{4}")){
        this.KodeBuku = KodeBuku;
    }else {
        this.KodeBuku = "OTH9999";
        }
    }

    public int getKuantitas_1302213015() {
        return kuantitas;
    }
    
}
