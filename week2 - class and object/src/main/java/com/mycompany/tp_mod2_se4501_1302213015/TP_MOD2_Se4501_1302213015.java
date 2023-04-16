/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod2_se4501_1302213015;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author glori
 */
public class TP_MOD2_Se4501_1302213015 {
    static void printArray(){
        int[][] err = new int[3][] ;
        err[0] = new int[3];
        err[1] = new int[5];
        err[2] = new int[7];
        
        int i = 0;
        for (int j = 0; j < 3; j++) {
            err[i][j] = (j+1) * 2;
        }
        i++;
        int m = 1;
        for (int k = 0; k < 5; k ++ ) {
            err [i][k] = m;
            m = 2 + m;
        }
        i++;
        int firstTerm = 0, secondTerm = 1;
        for (int l = 1; l <= 7; l ++) {
            err[i][l-1] = firstTerm;
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(Arrays.deepToString(err));
        
    }
    static int FPB(int a, int b){
        if ( b == 0) {
            return a;
        }else {
        return (FPB(b,a % b));}
        
    }
    static int KPK(int a, int b) {
        return (a*b) / FPB(a,b);
    }
    static void FPBKPK(){
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Input bilangan 1: ");
        int bilangan1 = myObj.nextInt();
        
         System.out.print("Input bilangan 2: ");
        int bilangan2 = myObj.nextInt();
        
        int fpb;
        fpb = FPB(bilangan1,bilangan2);
        int kpk;
        kpk = KPK (bilangan1,bilangan2);
        System.out.print("KPK:");
        System.out.print(kpk);
        System.out.print("FPB:");
        System.out.print(fpb);
    }
    public static void main(String[] args) {
 
        printArray();
      FPBKPK();

}
}

