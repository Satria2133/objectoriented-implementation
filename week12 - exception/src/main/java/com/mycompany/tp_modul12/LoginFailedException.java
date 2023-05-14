/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_modul12;

import java.util.HashMap;

/**
 *
 * @author glori
 */
class LoginFailedException extends Exception {
    private static HashMap<Integer,Integer> failedCount = new HashMap<>();
    private int userId;
    
    public LoginFailedException(String msg, int userId) {
        super(msg);
        this.userId = userId;
        
        if (failedCount.containsKey(userId)) {
            failedCount.put(userId, failedCount.get(userId) + 1);
        } else {
            failedCount.put(userId, 1);
        }
    }
    
    public int getUserId(){
        return userId;
    }
    
    public static int getFailedCount(int userId) {
        if (failedCount.containsKey(userId)) {
            return failedCount.get(userId);
        }
        return 0;
    }

}
