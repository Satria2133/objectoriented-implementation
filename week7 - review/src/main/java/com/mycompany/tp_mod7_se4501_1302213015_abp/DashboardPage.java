/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod7_se4501_1302213015_abp;

/**
 *
 * @author glori
 */
public class DashboardPage extends WebPage implements Loginable {

    public DashboardPage(String webTitle) {
        super(webTitle);
    }

    @Override
    public void login(String loggedUsername){
        System.out.println(loggedUsername + " berhasil login ke halaman dashboard.");
    }
    protected void ShowMainPage(){
        if (loggedUsername == null || loggedUsername.equals("")) {
            System.out.println("# Akses ditutup untuk user guest ##");
            System.out.println("# Mohon login terlebih dahulu ##");
        } else {
            System.out.printf("# Dashboard Page - %s ##\n", loggedUsername);
            System.out.println("# Opsi-opsi page dashboard ##");
            System.out.println("# dsb. ##");
        }
    }
}
