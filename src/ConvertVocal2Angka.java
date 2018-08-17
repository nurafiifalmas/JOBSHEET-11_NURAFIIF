
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ConvertVocal2Angka {
    private static void TampilJudul(String identitas) {
        System.out.println("Identitas : " +identitas);
        System.out.println("\nCorvent Kalimat Alay Angka (Vokal ke Angka)\n");
    } public static void main(String[] args) {
      String identitas = "Nurafiif Almas Azhari / X RPL 5 / 33";
      TampilJudul(identitas);
    
    } private static String tampilInput(){
         Scanner scanner = new Scanner (System.in);
         System.out.println("Masukkan Kalimat : ");
         String kalimat = scanner.nextLine();
         System.out.println("Kalimat Asli : "+kalimat);
         
         return kalimat;
         
    }
    private static String vokal2Angka (String kalimat) {
        char [][] arConvert = {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        kalimat = kalimat.toLowerCase();
        for(int i=0;i<arConvert.length;i++)
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        return kalimat;
        
        
    }
    private static void tampilPerkata(String kalimat, String convert){
     String[] arrKal = kalimat.split(" ");
     String[] arrCon = kalimat.split(" ");
     for(int i=0;i<arrKal.length;i++)
         System.out.println(arrKal[i]+"=>"+arrCon);
     
     
     
    }
    
   
}