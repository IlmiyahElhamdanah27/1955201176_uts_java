/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemian4;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
        
public class contoh2joption {
    public static void main(String[] args) {
         String minuman = JOptionPane.showInputDialog("Mau Pesan Minuman Apa");
         String antrian = JOptionPane.showInputDialog("nomer antrian berapa ");
         String rasa = JOptionPane.showInputDialog("mau pesan yang rasa apa");
        String jumlah = null;
         
         
         
         int Jumlah = Integer.parseInt(jumlah);
         int harga  = 50000;
         double total = Jumlah*harga;
         
         System.out.println("Mau pesan minuman apa  :");
         System.out.println("nomer antrian berapa :");
         System.out.println("maupesan yang rasa apa :");
         System.out.println("Total yang Harus Dibayar :"+total);
         
         
         
                
                
        
    }
}
