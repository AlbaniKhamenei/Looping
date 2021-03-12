/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class GanjilGenap1 {
    public static void main (String []args){
        int a;
        Scanner scan = new
    Scanner (System.in);
        
        System.out.print ("Masukkan NIM :");
        a = scan.nextInt();
        
        if (a%2 == 0){
            System.out.print(" Bilangan " + a + " Adalah Genap.\n");
        } else {
            System.out.print("Bilangan " + a + " Adalah Ganjil.\n");
        }
    }
}
