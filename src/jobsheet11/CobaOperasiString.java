/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

import java.util.Locale;

/**
 *
 * @author user
 */
public class CobaOperasiString {
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
        
        System.out.println("Perbandingan isi X dengan y :"+x.compareTo(y));
        System.out.println("Perbandingan isi X dengan z (Case Sensitive) :"+x.compareTo(z));
        System.out.println("isi X sama dengan r (Not Sensitive Case)     :"+x.compareTo(r));
        System.out.println("isi X sama dengan r (Not Sensitive Case)     :"+x.compareToIgnoreCase(r)); 
          
        String s ="OperasI";
        System.out.println("Isi Variabel s  :"+s);
        System.out.println("Perbandingan isi r dengan s (Case Sensitive) :"+x.compareTo(s));
        
        System.out.println("pada x terdapat huruf 'a'  :"+x.contains("a"));
        System.out.println("isi variabel x besar semua :"+x.toUpperCase());
        System.out.println("isi variabel x kecil semua :"+x.toLowerCase());
        
        String t ="Operasi string";
        System.out.println("Isi Variabel t :\""+t+"\"");
        System.out.println("isi variabel t tanpa spasi    :\""+t.trim()+"\"");
        System.out.println("gabungan isi variabel X dan r :"+x.concat(r));
        
        System.out.println("Karakter mulai posisi 3 di variable x   : " +x.substring(3));
        System.out.println("Karakter mulai posisi 3-5 di variable x : " +x.substring(3,6));
        String tclean = t.trim();
        System.out.println("isi variable tclean : " +t.trim());
        System.out.println("rubah 'i' jadi 'E'  di variable tclean : "+tclean.replace("i", "E") );
       
        String[] arrT = tclean.split(" ");
        System.out.println("pecah kata di variable tclean : ");
        for(int i=0;i<arrT.length;i++)
        System.out.println(arrT[i]);
        
       String[] arrTr = tclean.split("r");
       System.out.println("pecah berdasarkan huruf 'r' di variable tclean : ");
       for(int i=0;i<arrTr.length;i++)
       System.out.println(arrTr[i]);
       double d = 1545454000;
       System.out.println(String.format("Uang saya Rp %, .4f",d));
       System.out.println(String.format(Locale.forLanguageTag("in-ID"),"Uang saya Rp %,.2f",d));
       
       
    }
}
