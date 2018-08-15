
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
    
  
        
    }
}
