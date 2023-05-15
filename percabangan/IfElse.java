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
public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 5300;
        double uangDiDompet = 2500;
        
        if(uangDiDompet < totalBelanja){
            System.out.println("Uang Kurang, Kurangi jajan anda");
        }else {
            System.out.println("Uang cukup, selamat Menikmati");
        }
        double totalBelanjaan = 5300;
        double uangDiDompetku = 2500;
        if(uangDiDompetku < totalBelanjaan){
            System.out.println("Uang Kurang, Kurangi jajan anda");  
        }else if (uangDiDompetku>totalBelanjaan) {
            double angsul = uangDiDompetku-totalBelanjaan;
            System.out.println("Uang cukup, angsul");
        }else {
            System.out.println("Uang pas.. Uwu...");
        } 
    } 
}
