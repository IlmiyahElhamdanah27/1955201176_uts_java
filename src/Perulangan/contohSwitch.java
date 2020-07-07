package Perulangan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
        
public class contohSwitch {
    public static void main(String[] args) {
        String alamat = JOptionPane.showInputDialog( null, "alamatnya dimana mbak");
        String desa  =JOptionPane.showInputDialog( null,"di desa apa namanya");
        
        switch(desa){
            case "P":
                JOptionPane.showMessageDialog(null, "Astaga" +desa+ "Anda P");
                //P = POSITIF
            
            break ;
            case "N":
             JOptionPane.showMessageDialog(null, "Alhamdulillah" +desa+ "Anda N");
             //N = NEGATIF
             
            break ;
            case "O":
                 JOptionPane.showMessageDialog(null, "Astaga" +desa+ "Anda O");
                 //O = ODP
                 
            break ;
            
            
            
            default :JOptionPane.showMessageDialog(null, "desa yang anda tuju  Salah");   
            
        }
        
        
        
    }
}
