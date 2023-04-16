/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module5_1302213015;
import java.time.LocalDateTime;
/**
 *
 * @author glori
 */
public class Module5_1302213015 {

    public static void main(String[] args) {
        Buku buku1 = new Buku("BUKU1", 4);
        buku1.setKodeBuku_1302213015("FIC0001");

        Buku buku2 = new Buku("BUKU2", 2);
        buku2.setKodeBuku_1302213015("NFC0001");

        Buku buku3 = new Buku("BUKU3", 1);
        buku3.setKodeBuku_1302213015("TXT0002");

        // Membuat objek peminjaman
        DataPeminjaman peminjaman = new DataPeminjaman("ABCDE");
        peminjaman.setDaftarBuku_1302213015(new Buku[]{buku1, buku2, buku3});

        // Memulai peminjaman buku
        peminjaman.mulaiPinjamBuku_1302213015();

        // Menampilkan daftar buku yang harus dikembalikan
        peminjaman.tampilkanDaftarBuku_1302213015();

        // Menampilkan waktu pengembalian
        System.out.println(peminjaman.waktuPengembalian_1302213015());
    }
}
