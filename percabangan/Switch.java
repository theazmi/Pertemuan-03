/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percabangan;

/**
 *
 * @author Axioo Class Program
 */
public class Switch {
     public static void main(String[] args){
       int jalanjalan = 3;
       
       switch(jalanjalan){
           case 1: 
               System.out.println("Urang Lapas");
               break;
           case 2:
               System.out.println("Urang Acayaan");
               break;
           case 3: 
               System.out.println("Ubat Nyamuk ");
               break;
           case 4: 
               System.out.println("dubil dit");
               break;
           default :
               System.out.println("Mahluk halus");
               break;
       }
       
       char nilai = 'D';
       switch(nilai){
           case 'A':
               System.out.println("Mhs    : \"Terima Kasih pak\"");
               System.out.println("Dosen  :\"Selamat ya !!\"");
               break;
           case 'B':
               System.out.println("Mhs    : \"Kenapa Ulun kada dapat A, Pak ? \"");
               System.out.println("Dosen  :\"!@#$%\"");
               break;
           case 'C':
               System.out.println("Mhs    : \"Ulun turun pul pak ai, tugas pul jua\"");
               System.out.println("Dosen  :\"Tapi bisa menjawan ujian?\"");
               System.out.println("Mhs    : \"Hihihi.....\"");
               break;
           default :
               System.out.println("Mhs    : \"Ulun turun pul Pak ai, Tugas pul jua\"");
               System.out.println("Dosen  : \"Bujur jua kah?\"");
               System.out.println("Dosen  : \"*memeriksa berkas\"");
               System.out.println("Dosen  : \"*menceleng\"");
               System.out.println("Mhs    : \"Kabur\"");
               break;
       }
   }
}
