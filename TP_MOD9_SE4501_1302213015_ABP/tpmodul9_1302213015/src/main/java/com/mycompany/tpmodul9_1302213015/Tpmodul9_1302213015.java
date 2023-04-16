/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmodul9_1302213015;


/**
 *
 * @author glori
 */
public class Tpmodul9_1302213015 {
 
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(2.25, 4.0);
        shapes[1] = new Square(4.0);
        shapes[2] = new Circle(10.0);
        shapes[3] = new Cube(5.0);
        shapes[4] = new Tube(10.0, 5.0);

        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Area: " + area);
            if (shape instanceof HasVolume hasVolume) {
                double volume = hasVolume.getVolume();
                System.out.println("Volume: " + volume);
            }
        }
    }
        
}


