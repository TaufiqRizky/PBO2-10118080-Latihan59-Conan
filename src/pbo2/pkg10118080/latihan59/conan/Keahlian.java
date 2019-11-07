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
public class Keahlian extends Karakter{
    private String keahlian;

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
    
    @Override
    public void ahli (int i){
        switch (i) {
            case 1:
                setNama("Conan Edogawa");
                setKeahlian("Detektif");
                break;
            case 2:
                setNama("Ran Mouri");
                setKeahlian("Karate");
                break;
            case 3:
                setNama("Eri Kisaki");
                setKeahlian("Pengacara");
                break;
            case 4:
                setNama("Heiji Hattori");
                setKeahlian("Karate");
                break;
            case 5:
                setNama("Kogoro Mouri");
                setKeahlian("Detektif");
                break;
            default:
                System.out.println("Masukan 1-5 !!");
                break;
        }
        
        System.out.println("Nama\t: "+getNama());
        System.out.println("Keahlian : "+getKeahlian());
    }
    
}
