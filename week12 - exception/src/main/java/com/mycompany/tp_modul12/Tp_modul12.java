 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_modul12;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class Tp_modul12 {

    public static void main(String[] args) {
         Scanner scanner;
        scanner = new Scanner(System.in);
        
        // menerima input userid dan password
        System.out.print("Masukkan user id: ");
        int userId = scanner.nextInt();
        System.out.print("Masukkan password: ");
        int password = scanner.nextInt();
        
        UserData userData = new UserData(userId, password);
        
        try {
            userData.login();
            System.out.println("Login berhasil");
        } catch (LoginFailedException e) {
            System.out.println("Login gagal");
            int failedCount = LoginFailedException.getFailedCount(userId);
            System.out.println("Login user " + userId + " gagal, telah gagal login " + failedCount + " kali");
        }
        
        scanner.close();
    }
}
