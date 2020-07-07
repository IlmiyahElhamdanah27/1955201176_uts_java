/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

/**
 *
 * @author ASUS
 */
public class FOR {
    public static void main(String[] args) {
        int n = 3;
   String Laptop =("");
        System.out.println("Mulai");
        System.out.println("Klik power on");
        System.out.println("laptop akan menyala");
       
        String laptop;
        laptop = "nyala";
        System.out.println("apakah laptop sudah menyala");
         if("menyala".equals(laptop)){
        System.out.println("sudah menyala");
        }
         else {
        System.out.println("belum menyala");
         }
        for (int i = 1; i <n;   i++){
        System.out.println("nyalakan laptop lagi - " + i);
        
       }
        System.out.println("selesai");
    }
}
