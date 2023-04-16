/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul9_1302213015;

/**
 *
 * @author glori
 */
public class Tube extends Circle implements HasVolume{
     
    public float height;
    
    public Tube(double radius, double height) {
        super(radius);
        this.height = (float) height;
    }
    
    @Override
     public double getArea(){
        return 3.14 * radius * radius;
    }
     
    @Override
     public double getVolume(){
         return getArea() * height;
     }
    
}
