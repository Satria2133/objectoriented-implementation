/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod7_se4501_1302213015_abp;

/**
 *
 * @author glori
 */
public class HomePage extends WebPage implements Loginable {
    public HomePage(String webTitle){
        super(webTitle);
    }
    @Override
    public void login(String loggedUsername){
        System.out.println("Selamat datang di halaman Home, " + loggedUsername);
    }
    
   protected void ShowMainPage(){
      if (loggedUsername == null || loggedUsername.isEmpty()) {
        System.out.println("# Selamat datang ##");
        System.out.println("# Anda sedang berada di home page ##");
        System.out.println("# Ini penjelasan umum home page ##");
    } else {
        System.out.println("# Selamat datang, " + loggedUsername + "! ##");
        System.out.println("# Anda sedang berada di home page ##");
        System.out.println("# Ini penjelasan khusus home page ##");
    }   
    }
    
    
}
