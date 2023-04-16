/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module2_1302213015;

/**
 *
 * @author glori
 */
public class Movie {
   String title;
   int duration;

   public Movie (String title, int duration) {
       this.duration = duration;
       this.title = title;
   };

    
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
   
    public double calculatePrice(){
        double price = 0;
        if (duration > 150) {
            price = 50000;
        }else if (duration > 89 && duration <= 150) {
            price = 40000;
        }else if (duration < 90) {
            price = 30000;
        }
        return price;
    }
    public void printMovieInfo(){
        double harga = calculatePrice();
        System.out.print("Setiap film dengan judul " + title + " memiliki harga " + harga);
    };
}









