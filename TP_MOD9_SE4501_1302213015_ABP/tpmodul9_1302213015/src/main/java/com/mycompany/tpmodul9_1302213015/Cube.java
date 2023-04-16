/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul9_1302213015;

/**
 *
 * @author glori
 */
public class Cube extends Square implements HasVolume {
    private final double sidelength;
    public Cube(double sidelength) {
        super(sidelength);
        this.sidelength = sidelength;
    }

    @Override
    public double getVolume() {
        return sidelength * sidelength * sidelength;
    }
    
}
