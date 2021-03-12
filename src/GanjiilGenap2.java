/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
import javax.swing.JOptionPane;
public class GanjiilGenap2 {
    public static void main (String [] args){
        int [] bilngan = new int [2];
        int bil1, bil2;
        int i;
        
       for (i = 0; i<2; i++){
           String nilai = JOptionPane.showInputDialog("Masukkan NIM :");
           bilngan [i] = Integer.parseInt(nilai);
           System.out.println("Input Bilngan :" +nilai);
       }
       for (i = 0; i<2; i++){
           if (bilngan [i] %2 == 1){
               System.out.println("Bilngan "+ "Bilngan[A]+ Ganjil");
           }
           else  
               
               System.out.println("Bilangan "+ "Bilangan[B]+ Genap");
       }
    }
}
