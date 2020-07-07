package perulangan;

import java.util.Scanner;
public class javaa {
    
    public static void main(String[] args) {
       
        String bahasaindonesia;
        String bahasainggris;
        String bahasamandarin;
        int umur;
        int tinggi ;
        Double  nilai;
        Double ipk;
        Scanner input = new Scanner(System.in);
        //
        System.out.println("==========");
        System.out.print("bahasaindonesia : ");
        bahasaindonesia = input.next();
        System.out.print("bahasainggris :");
        bahasainggris = input.next();
        System.out.print("bahasamandarin : ");
        bahasamandarin = input.next();
        System.out.print("umur  :");
        umur = input.nextInt();
        System.out.print("Tinggi :");
        tinggi = input.nextInt();
        System.out.print("Nilai  :");
        nilai = input.nextDouble();
        System.out.print("Ipk    :");
        ipk = input.nextDouble();
        //
        System.out.println("=========");
        System.out.println("nilai bahasa indonesia     : " + bahasaindonesia);
        System.out.println(" nilai bahasa inggris   : " + bahasainggris);
        System.out.println("nilai bahasa mandarin    :"  + bahasamandarin);
        System.out.println("umur berapa      :" + umur );
        System.out.println("tinggi anda : "+ tinggi);
        System.out.println("nilai rata-rata        :"  +nilai);
        System.out.println("berapa ipk anda :"      +ipk);
        
    
} 
}