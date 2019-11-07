/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan59.conan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan59Conan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Daftar Karakter Conan====");
        Keahlian k = new Keahlian();
        System.out.print("Masukan Nomor Untuk Mengetahui Keahlian [1-6] : ");
        Scanner no = new Scanner(System.in);
        k.ahli(no.nextInt());
        
        
    }
    
}
