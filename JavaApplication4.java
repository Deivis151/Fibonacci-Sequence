/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Latitude
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ivesk skaiciu");

        while (true) {
//            System.out.println("0 - baigti");
//            System.out.println("1 - rock");
//            System.out.println("2 - papper");
//            System.out.println("3 - scissors");
            int uc = sc.nextInt();
            int cc = (int) (Math.random()*3+1);
            System.out.println("Players number  " + uc);
            System.out.println("Compiuters number " + cc);
            if (uc == 0) {
                break;
            } else if (uc == cc) {
                System.out.println("lygu");
            } else if (uc == 1 && cc == 2) {
                System.out.println("Kompiuter win");
            } else if (uc == 1 && cc == 3) {
                System.out.println("Player wins");
            } else if (uc == 2 && cc == 1) {
                System.out.println("Player wins");
            } else if (uc == 2 && cc == 3) {
                System.out.println("Kompiuter wins");
            } else if (uc == 3 && cc == 1) {
                System.out.println("Kompiuter wins");
            } else if (uc == 3 && cc == 2) {
                System.out.println("Player wins");
            } else if (uc > 3) {
                System.out.println(" vesti skaicius tik iki 3");
            } 
        }
    }
}
            
