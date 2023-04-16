/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod7_se4501_1302213015_abp;

/**
 *
 * @author glori
 */
public class TP_MOD7_SE4501_1302213015_ABP {

    public static void main(String[] args) {
        WebPage homepage = new HomePage("Home");
        WebPage dashboard = new DashboardPage("Dashboard");
        
        // show pages before login
        System.out.println("=== BEFORE LOGIN ===");
        homepage.showFullPage();
        dashboard.showFullPage();
        
        // simulate login
        System.out.println("=== AFTER LOGIN ===");
        homepage.loggedUsername = "john";
        homepage.showFullPage();
        dashboard.loggedUsername = "jane";
        dashboard.showFullPage();
    }
}
