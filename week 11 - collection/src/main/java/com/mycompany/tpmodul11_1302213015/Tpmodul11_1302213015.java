/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmodul11_1302213015;

import gloriousSatria_1302213015.Kantor;
import gloriousSatria_1302213015.Pegawai;
import java.util.ArrayList;

/**
 *
 * @author glori
 */
public class Tpmodul11_1302213015 {

    public static void main(String[] args) {
        Kantor kantor = new Kantor("Kamar Pelajar");
        
        //tambah pegawai
         kantor.tambahPegawai(new Pegawai("Angela", 33, 8000000));
        kantor.tambahPegawai(new Pegawai("Kevin", 38, 5000000));
        kantor.tambahPegawai(new Pegawai("Stanley", 51, 10000000));
        kantor.tambahPegawai(new Pegawai("Michael", 41, 15000000));
        kantor.tambahPegawai(new Pegawai("Pam", 31, 4500000));
        kantor.tambahPegawai(new Pegawai("Jim", 33, 8500000));
        kantor.tambahPegawai(new Pegawai("Creed", 55, 7500000));
        kantor.tambahPegawai(new Pegawai("Dwight", 33, 9000000));
        kantor.tambahPegawai(new Pegawai("Meredith", 43, 7500000));
        kantor.tambahPegawai(new Pegawai("Oscar", 38, 8000000));
        kantor.tambahPegawai(new Pegawai("Phyllis", 46, 8500000));
        
        // Tampilkan daftar pegawai sebelum diurutkan
        System.out.println("Daftar Pegawai Sebelum Diurutkan:");
        ArrayList<Pegawai> daftarPegawai = kantor.getDaftarPegawai();
        for (Pegawai pegawai : daftarPegawai) {
            System.out.println("Nama: " + pegawai.getNama() + ", Umur: " + pegawai.getUmur() + ", Gaji: " + pegawai.getGaji());
        }

        // Urutkan pegawai berdasarkan nama
        kantor.urutkanSesuaiNama();

        // Tampilkan daftar pegawai setelah diurutkan berdasarkan nama
        System.out.println("\nDaftar Pegawai Setelah Diurutkan Berdasarkan Nama:");
        daftarPegawai = kantor.getDaftarPegawai();
        for (Pegawai pegawai : daftarPegawai) {
            System.out.println("Nama: " + pegawai.getNama() + ", Umur: " + pegawai.getUmur() + ", Gaji: " + pegawai.getGaji());
        }

        // Urutkan pegawai berdasarkan gaji
        kantor.urutkanSesuaiGaji();

        // Tampilkan daftar pegawai setelah diurutkan berdasarkan gaji
        System.out.println("\nDaftar Pegawai Setelah Diurutkan Berdasarkan Gaji:");
        daftarPegawai = kantor.getDaftarPegawai();
        for (Pegawai pegawai : daftarPegawai) {
            System.out.println("Nama: " + pegawai.getNama() + ", Umur: " + pegawai.getUmur() + ", Gaji: " + pegawai.getGaji());
        }
       
        
        //Hapus pegawai bernama Pam
        kantor.hapusPegawai("Pam");
         System.out.println("\nDaftar Pegawai Setelah Pam resign:");
        daftarPegawai = kantor.getDaftarPegawai();
        for (Pegawai pegawai : daftarPegawai) {
            System.out.println("Nama: " + pegawai.getNama() + ", Umur: " + pegawai.getUmur() + ", Gaji: " + pegawai.getGaji());
        }
    }
}
