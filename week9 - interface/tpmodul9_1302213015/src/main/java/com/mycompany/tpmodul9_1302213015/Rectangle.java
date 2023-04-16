/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul9_1302213015;

/**
 *
 * @author glori
 */
public class Rectangle extends Shape {
    protected float length;
    protected float width;

    public Rectangle(double length, double width) {
        this.length = (float) length;
        this.width = (float) width;
    }
    @Override
    public double getArea(){
        return length * width;
    }
}
