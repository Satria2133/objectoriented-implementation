/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul14_1302213015;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author glori
 */
public class ConfigHelper {
    private static final String CONFIG_FILENAME = "config.txt";
    public static void saveConfigToFile(AppConfig config) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CONFIG_FILENAME))) {
            oos.writeObject(config);
            System.out.println("Konfigurasi berhasil disimpan dalam file " + CONFIG_FILENAME);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan konfigurasi ke file " + CONFIG_FILENAME);
            e.printStackTrace();
        }
    }

    public static AppConfig loadConfigFromFile() {
        AppConfig config = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CONFIG_FILENAME))) {
            config = (AppConfig) ois.readObject();
            System.out.println("Konfigurasi berhasil dimuat dari file " + CONFIG_FILENAME);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal memuat konfigurasi dari file " + CONFIG_FILENAME);
            e.printStackTrace();
        }
        return config;
    }
}
