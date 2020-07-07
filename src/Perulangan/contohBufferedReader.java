/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class contohBufferedReader {
    public static void main(String[] args)
            throws IOException {
       
        
       InputStreamReader isr = new InputStreamReader(System.in);
       //objek buffered
       BufferedReader br = new BufferedReader(isr);
       
       String nama ;
       String status ;
       String alamat ;
       int umur ;
       int tinggi ;
        System.out.println("=======");
       
        System.out.println("Siapa Nama om     :");
        nama = br.readLine();
        
        System.out.println("Udah Punya pacar :");
        status = br.readLine();
        
        System.out.println("Alamat om          :");
        alamat = br.readLine();
        
        System.out.println("Umur Anda Berapa Ya :");
        umur = Integer.parseInt(br.readLine());
       
        System.out.println("Tinggi om          :");
        tinggi = Integer.parseInt(br.readLine());
       //menampilkan nama
        System.out.println("=========");
        System.out.println("Nama Anda Adalah     :" + nama);
        System.out.println("Status Anda          :" + status);
        System.out.println("Alamat Anda          :" + alamat);
        System.out.println("Ternyata Umur Anda   : "+umur);
        System.out.println("Ternyata Tinggi Anda :" + tinggi);
        
        
        
       
      
       
       
      
    }
}
