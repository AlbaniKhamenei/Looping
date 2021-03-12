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
public class InvalidnumberIfElse {
    public static void main (String [] args){
        String angka ="";
        angka=JOptionPane.showInputDialog("Silahkan Masukkan Angka");
        int z = Integer.valueOf(angka).intValue();
        
        String hasil = "";
        if (z>=1&&z<=10){
            hasil += "Valid number";
        }
        else{
            hasil += "Invalid number";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}

