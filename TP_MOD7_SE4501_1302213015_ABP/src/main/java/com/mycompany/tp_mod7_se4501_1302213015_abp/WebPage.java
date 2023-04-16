/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod7_se4501_1302213015_abp;

/**
 *
 * @author glori
 */
public class WebPage{
    final String webTitle;
    protected String loggedUsername;

    public WebPage(String webTitle) {
        this.webTitle = webTitle;
    }
    protected void showHeader(){
        System.out.println("######################################");
        System.out.printf("### %s ##\n", webTitle);
        System.out.println("#-----------------------------------##");
    }
    protected void showFooter(){
        System.out.println("#-----------------------------------##");
        System.out.println("# Created by Glorious Satria Dhamang Aji ##");
        System.out.println("######################################");
    }
        public void showFullPage() {
        showHeader();
        showMainPage();
        showFooter();
    }
        public void showMainPage() {
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
