/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gloriousSatria_1302213015;
import komparasi.NamaComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 *
 * @author glori
 */
public class Kantor {
    private String nama;
    private ArrayList<Pegawai> daftarPegawai;

    public Kantor(String nama) {
        this.nama = nama;
        this.daftarPegawai = new ArrayList<>();
    }

    public ArrayList<Pegawai> getDaftarPegawai() {
        return daftarPegawai;
    }
    
    public void tambahPegawai(Pegawai peg){
        daftarPegawai.add(peg);
    }
    
    public void hapusPegawai(String namaPegawai){
        Iterator<Pegawai> iterator = daftarPegawai.iterator();
        while (iterator.hasNext()) {
            Pegawai pegawai = iterator.next();
            if (pegawai.getNama().equals(namaPegawai)) {
                iterator.remove();
        }
    }
    }
    public void urutkanSesuaiGaji(){
        Collections.sort(daftarPegawai);
    }
    public void urutkanSesuaiNama(){
        Collections.sort(daftarPegawai,new NamaComparator());
    }
    public ArrayList<Pegawai> urutkanSesuaiUmur(int umur){
        return daftarPegawai.stream().filter(pegawai -> pegawai.getUmur() == umur).collect(Collectors.toCollection(ArrayList::new));
    }
}
