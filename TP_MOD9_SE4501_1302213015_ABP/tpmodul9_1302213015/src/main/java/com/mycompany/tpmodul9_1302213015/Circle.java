/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul9_1302213015;

/**
 *
 * @author glori
 */
public class Circle extends Shape {
    protected float radius;

    public Circle(double radius ) {
        this.radius = (float) radius;
    }
    
    @Override
    public double getArea(){
        return 3.14 * radius * radius;
    }
    
}
