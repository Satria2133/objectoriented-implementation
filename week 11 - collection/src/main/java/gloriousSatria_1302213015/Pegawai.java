/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gloriousSatria_1302213015;

/**
 *
 * @author glori
 */
public class Pegawai implements Comparable<Pegawai> {
    private String nama;
    private int umur;
    private double gaji;

    public Pegawai(String nama, int umur, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public double getGaji() {
        return gaji;
    }
    
    @Override
    public int compareTo(Pegawai pegawai) {
        if(this.gaji < pegawai.gaji) {
            return -1;
        } else if(this.gaji > pegawai.gaji) {
            return 1;
        } else {
            return 0;
        }
    }
}

