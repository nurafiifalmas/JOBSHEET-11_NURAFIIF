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
public class CobaOperasiString {
    public static void main(String[] args) {
        
        String identitas ="NURAFIIF ALMAS AZHARI / X RPL 5 / 33";
        System.out.println("Identitas :"+identitas);
     
        String x ="Operasi";
        System.out.println("Isi Variabel :"+x);
        System.out.println("\""+x+"\" panjang karakter = "+x.length());
        System.out.println("X adalah kosong :"+x.isEmpty());
        String y ="";
        System.out.println("Isi Variabel y :"+y);
        
        System.out.println("X adalah kosong :"+x.isEmpty());
        
        System.out.println("isi X sama dengan y :"+x.equals(y));
        String z ="Operasi";
        System.out.println("Isi Variabel z :"+z);
        System.out.println("isi X sama dengan z(Case Sensitive) :"+x.equals(z));
        String r ="Operasi";
        System.out.println("Isi Variabel z :"+r);
        System.out.println("isi X sama dengan y :"+x.equals(r));
        System.out.println("isi X sama dengan r(Not Case Sensitive) :"+x.equalsIgnoreCase(r));
        
          System.out.println("Perbandingan isi X dengan y :"+x.compareTo(y));
          System.out.println("Perbandingan isi X dengan z (Case Sensitive) :"+x.concat(z));
          System.out.println("Isi Variabel z :"+x.compareTo(r));
          System.out.println("isi X sama dengan r (Not Sensitive Case):"+x.compareToIgnoreCase(r)); 
      String s ="Operasi";
        System.out.println("Isi Variabel s :"+s);
        System.out.println("isi X sama dengan s(Case Sensitive) :"+x.equals(s));
        System.out.println("pada x terdapat huruf 'a' :"+x.contains("a"));
        System.out.println("isi variabel x besar semua :"+x.toUpperCase());
        System.out.println("isi variabel x kecil semua :"+x.toLowerCase());
         String t ="Operasi string";
        System.out.println("Isi Variabel t :\""+t+"\"");
        System.out.println("isi variabel t tanpa spasi :\""+t.trim()+"\"");
        System.out.println("gabungan isi variabel X dan r :"+x.concat(r));
        
        
       System.out.println("Karakter mulai posisi 3 di variable x : " +x.substring(3));
       System.out.println("Karakter mulai posisi 3 di variable x : " +x.substring(3,6));
       String tclean = t.trim();
       System.out.println("isi variable tclean : " +t.trim());
       System.out.println("rubah 'i' jadi 'E'  di variable tclean : "+tclean.replace("i", "E") );
       String[] arrT = tclean.split("r");
       System.out.println("pecah berdasarkan huruf 'r' di variable tclean : ");
       for(int i=0;i<arrT.length;i++);
       System.out.println(arrT[1]);
       System.out.println(arrT[1]);
       
    }
    
   
}
