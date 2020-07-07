/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ASUS
 */
public class ContohPerulanganDoWhile {
     public static void main(String[] args) {
         int n = 1;
        String esnutrisari = "" ;
    System.out.println("Mulai");
     System.out.println("Siapkan es batu,air dan nutrisari  ");
     System.out.println("siapkan gelas dan sendok");
        System.out.println("masukkan air dan nutrisari lalu di aduk dan di beri");
        
    esnutrisari = "sudah jadi";
       System.out.println("apakah es nutrisari sudah jadi");
   if("sudahjadi".equals(esnutrisari)){
        System.out.println("sudah jadi");
    }
   else {
   System.out.println("belum jadi");
}
   int i = 1; 
   
   do{
   
       System.out.println(" buat es lagi - "+i);
       i++;
   }
    while (i < 8);
     System.out.println("kembalikan gelas dan sendok");
     System.out.println("selesai");  
    }
    
}
