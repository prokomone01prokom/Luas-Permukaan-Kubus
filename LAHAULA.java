/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahaula;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LAHAULA {
    

    static int kubus(int s){
        return (s * s * 6);
    }
    public static void main(String[] args) {
        
        int c;
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        System.out.print("Luas Permukaan Kubus \n");
        System.out.print("Masukkan Panjang sisi : ");
        
        int s;
        s = scanner.nextInt();
        
        c = kubus(s);
        
        System.out.print("c = s * s * 6");
        System.out.print("\n");
        
        int threshold = 10;
        
        System.out.print("\n");
        if (s > (threshold+1)) {
            System.out.print(String.format("sisi: %d lebih dari: %d maka kubus berukuran besar", s, threshold));
        } else if (s == 600) {
            System.out.print(String.format("sisi: %d sama dengan: %d maka kubus berukuran sedang", s, threshold));
        } else {
            System.out.print(String.format("sisi: %d kurang dari: %d maka kubus berukuran kecil", s, threshold));
        }
        
        System.out.print("\n");
        System.out.print(String.format("Luas Permukaan Kubus = %d", c));
        }
}
