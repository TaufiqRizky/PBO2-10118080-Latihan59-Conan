/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan59.conan;

/**
 *
 * @author USER
 */
public class Karakter {
    private String Nama;

    public Karakter() {
        System.out.println("1. Conan Edogawa");
        System.out.println("2. Ran Mouri");
        System.out.println("3. Eri Kisaki");
        System.out.println("4. Heiji Hattori");
        System.out.println("5. Kogoro Mouri");
    }
    

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void ahli(int i){
        System.out.println("Nafas");
    }
    
    
}
