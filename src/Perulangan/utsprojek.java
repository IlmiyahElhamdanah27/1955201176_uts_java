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
import java.util.Scanner;

public class utsprojek {
    public static void main(String[] args) {
      //Java Library Scanner
       Scanner scan = new Scanner(System.in);
       
        System.out.println("===========================================");
            System.out.println("||          DAFTAR PESANAN             ||");
            System.out.println("========================================");
            System.out.println("o NAMA              | o HARGA      ");
            System.out.println("1.NASI GORENG       | Rp. 10.000    ");
            System.out.println("2.MIE GORENG        | Rp. 10.000    ");
            System.out.println("3.MIE REBUS         | Rp. 10.000    ");
            System.out.println("======================================");
            

        //Pembayaran & kembalian
        int bayar, kembalian;
        //Harga awal
        int harga  = 0;
        //Harga Per-Item Menu
        int t1 = 10000, t2 = 10000, t3 = 20000;
        String pesanan = null;
        
        //Variable Menu
        int njNomor = 0, njJumlah = 0;
        
        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("_____________________________________");
        //Input No Pesanan pada menu
        System.out.print("Pilih pesanan yang anda pilih : ");
        njNomor = scan.nextInt();
        System.out.print("Masukkan Jumlah pesanan : ");
        njJumlah = scan.nextInt();
        System.out.println("_____________________________________");
           String mie = null ;
        
            switch (njNomor) {
                case 1:
        String menu = " nasigoreng-mie goreng";
                    System.out.println("Pilihan nasi goreng " +njNomor + " mie goreng");
                    harga = harga + t1 * njJumlah;
                    break;
                case 2:                 
                    menu = " ayam geprek  ";
                    System.out.println("Pilihan anda nomor " +njNomor + " adalah");
                    harga = harga + t2 * njJumlah;
                    break;
                case 3:
                    menu= " mie ayam";
                    System.out.println("Pilihan anda " +njNomor + " adalah");
                    harga = harga + t3 * njJumlah;
                    break;
               
                default:
                    System.out.println("Nomor pesanan yang dipilih tidak ada pada daftar menu di atas.");
                    break;
            }
            
            System.out.println("Total Yang harus di bayar = Rp."+harga);
            System.out.println("Masukkan Jumlah Uang : ");
            bayar = scan.nextInt();
            kembalian = bayar-harga;
            System.out.println("======================================");
            System.out.println("||                LOKET             ||");
            System.out.println("||               PEMBAYARAN         ||");           
            System.out.println("======================================");
            System.out.println("Anda Memesan :                        ");
            System.out.println(" " + pesanan +"   " + "X"+njJumlah +"   " + "Rp"+ harga);
            System.out.println("--------------------------------------");
            System.out.println("Total                " + "Rp" + harga);
            System.out.println("Jumlah Uang          " + "Rp" + bayar);
            System.out.println("Kembalian            " + "Rp" + kembalian);
            System.out.println("======================================");
            System.out.println("||            Terima Kasih          ||");
            System.out.println("||          Selamat Menikmati       ||");
            System.out.println("======================================");

            
            System.out.print("Apakah anda ingin Memesan Lagi? [Y/T] : ");
            i = scan.next();
            
        }
        
}
}


    
