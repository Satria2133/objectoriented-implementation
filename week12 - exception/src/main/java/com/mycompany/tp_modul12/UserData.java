/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_modul12;

/**
 *
 * @author glori
 */
public class UserData {
    private int userId;
    private int password;
    private boolean isLoggedIn;

     public UserData(int userId, int password) {
        if (String.valueOf(userId).length() != 4 || String.valueOf(password).length() != 4) {
            throw new IllegalArgumentException("User ID and password must be 4 digits long");
        }
        
        this.userId = userId;
        this.password = password;
    }
    
    public void login() throws LoginFailedException {
        if (userId + password != 10000) {
            isLoggedIn = false;
            throw new LoginFailedException("Login user " 
                    + userId 
                    + " gagal, telah gagal login " 
                    + LoginFailedException.getFailedCount(userId) 
                    + " kali", userId);
        }
        
        isLoggedIn = true;
    }
}
