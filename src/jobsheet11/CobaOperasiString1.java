/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

/**
 *
 * @author user
 */
public class CobaOperasiString1 {
    public static void main(String[] args) {
        
         String identitas ="NURAFIIF ALMAS AZHARI / X RPL 5 / 33";
        System.out.println("Identitas :"+identitas);
        
        String x ="Operasi";
        System.out.println("Isi Variabel X  :"+x);
        System.out.println("\""+x+"\" panjang karakter = "+x.length());
        
        System.out.println("X adalah kosong :"+x.isEmpty());
        
        String y ="";
        System.out.println("Isi Variabel y  :"+y);
        System.out.println("y adalah kosong :"+x.isEmpty());
        
        System.out.println("isi X sama dengan y                    :"+x.equals(y));
        
        String z ="Operasi";
        System.out.println("Isi Variabel z  :"+z);
        System.out.println("isi X sama dengan z(Case Sensitive)    :"+x.equals(z));
        
        String r ="operasi";
        System.out.println("Isi Variabel r  :"+r);
        System.out.println("isi X sama dengan r (Case Sensitive)   :"+x.equals(r));
        System.out.println("isi X sama dengan r(Not Case Sensitive):"+x.equalsIgnoreCase(r));
        
    }
}
