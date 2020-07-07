package Perulangan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
        
public class IFels {
    public static void main(String[] args) {
        
        String alamat = JOptionPane.showInputDialog( null,"Alamatnya dimana");
        String desa = JOptionPane.showInputDialog( null, "Di desa mana kamu tinggal");
        int suhu  = Integer.parseInt(JOptionPane.showInputDialog( null,"Cek Suhu Dulu"));
        
        
       if(suhu <=37){
            String nama = null;
           JOptionPane.showMessageDialog(null,"Ternyata" + nama+"kamu di alamat disini");
       }else{
            String nama = null;
            JOptionPane.showMessageDialog(null,"Ternyata " + nama + ",Anda di rt sini");
                   
           
       }
        
                
        
    }
    
}
