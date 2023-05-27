/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul14_1302213015;

import java.io.Serializable;

/**
 *
 * @author glori
 */
public class AppConfig implements Serializable {
    private String selectedLanguage;
    private boolean setFullScreen;
    private boolean autoSave;
    private String defaultUserID;
    private transient String password; 

    public AppConfig() {
    }

    public AppConfig(String selectedLanguage, boolean setFullScreen, boolean autoSave, String defaultUserID, String password) {
        this.selectedLanguage = selectedLanguage;
        this.setFullScreen = setFullScreen;
        this.autoSave = autoSave;
        this.defaultUserID = defaultUserID;
        this.password = password;
    }
    
    public void printConfig() {
        System.out.println("Konfigurasi aplikasi:");
        System.out.println("- Bahasa: " + selectedLanguage);
        System.out.println("- Layar Penuh: " + (setFullScreen ? "Aktif" : "Tidak aktif"));
        System.out.println("- Simpan Otomatis: " + (autoSave ? "Aktif" : "Tidak aktif"));
        System.out.println("- Id Pengguna: " + defaultUserID);
    }
}
