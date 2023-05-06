/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komparasi;

/**
 *
 * @author glori
 */
import java.util.Comparator;
import gloriousSatria_1302213015.Pegawai;

public class NamaComparator implements Comparator<Pegawai>{
    @Override
    public int compare(Pegawai o1, Pegawai o2) {
        return o1.getNama().compareTo(o2.getNama());
    }
}