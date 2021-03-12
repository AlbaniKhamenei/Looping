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
public class InvalidnumberSwitch {
 public static void main(String []args){
     String angka = "";
     angka = JOptionPane.showInputDialog("Silahkan Masukkan Angka");
     int a = Integer.valueOf(angka).intValue();
     
     String hasil ="";
     switch (a){
         case 1: hasil+= "Valid Number"; break;
         case 2: hasil+= "Valid Number"; break;
         case 3: hasil+= "Valid Number"; break;
         case 4: hasil+= "Valid Number"; break;
         case 5: hasil+= "Valid Number"; break;
         case 6: hasil+= "Valid Number"; break;
         case 7: hasil+= "Valid Number"; break;
         case 8: hasil+= "Valid Number"; break;
         case 9: hasil+= "Valid Number"; break;
         case 10: hasil+= "Valid Number"; break;
         default : hasil+= "Invalid Number"; break;
     }
     JOptionPane.showMessageDialog(null, hasil);
 }   
}
