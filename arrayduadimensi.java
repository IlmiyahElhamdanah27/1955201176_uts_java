/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author revnant
 */
public class arrayduadimensi {
     public static void main(String[] args) {
        String teman[][]={
           
           {"shofi","milana","rafines"},
           {"ilham","nabila","yaqin"},
           {"jekky","zaki","nisa"},  
       };
         for (String[] teman1 : teman) {
             for (int col = 0; col<teman.length; col++) {
                 System.out.print(teman1[col] + "\t");
             }
             System.out.println();
         }
    }
    

}
