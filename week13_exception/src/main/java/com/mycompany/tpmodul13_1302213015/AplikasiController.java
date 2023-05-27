/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul13_1302213015;

/**
 *
 * @author glori
 */
public class AplikasiController implements SimpanListener{
    private javax.swing.JFrame DataInputFrame;
    private javax.swing.JFrame ResultFrame;

    public AplikasiController() {
    }
    
    public void showDefaultView(){
        DataInputFrame input = new DataInputFrame();
        input.setVisible(true);
    }

    @Override
    public void simpanData(String n, String g, String j) {
        ResultFrame result = new ResultFrame(n,g,j);
        result.setVisible(true);
    }
}