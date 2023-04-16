/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module5_1302213015;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author glori
 */
public class DataPeminjaman {
    private String namaPeminjam;
    private Buku[] daftarBuku;
    private LocalDateTime tanggalPinjam;

    public DataPeminjaman(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public void setDaftarBuku_1302213015(Buku[] daftarBuku) {
        this.daftarBuku = daftarBuku;
    }
    public void mulaiPinjamBuku_1302213015(){
        this.tanggalPinjam = LocalDateTime.now();
    }
    
    public String waktuPengembalian_1302213015(){
    LocalDateTime tglKembali = this.tanggalPinjam.plusHours(100);
    DateTimeFormatter formatString = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return tglKembali.format(formatString);
    }
     public void tampilkanDaftarBuku_1302213015() {
        System.out.println("User " + this.namaPeminjam + " dengan deadline " + waktuPengembalian_1302213015());
        System.out.println("Harus mengembalikan buku-buku berikut ini:");
        for (Buku buku : this.daftarBuku) {
            System.out.println("Judul " + buku.getJudul_1302213015() + " dengan genre " + buku.getGenre_1302213015() + " berjumlah " + buku.getKuantitas_1302213015());
        }
}
}
