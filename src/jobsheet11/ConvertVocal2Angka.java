/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas" +identitas);
        System.out.println("\nConvert Kalimat Alay Angka (Vokal ke Angka)\n");
    }
    public static void main(String[] args) {
    String identitas = "Nurafiif Almas Azhari / XRPL5/ 33";
    tampilJudul(identitas);
    
    }
     private static String tampilInput(){
         Scanner scanner = new Scanner(System.in);
     System.out.println("Masukkan kalimat :");
     String kalimat = scanner.nextLine();
     System.out.println("Kalimat asli : "+ kalimat);
     
     return kalimat;
 

     }
     private static String Vocal2Angka(String kalimat){

           char [][] arConvert =
           {{'a','4'},{'i','1'},{'e','3'},{'o','0'}};
           kalimat = kalimat.toLowerCase();
           for(int i=0;i<arConvert.length;i++)
               kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
           return kalimat;
           
       }
               
               
           }
   
       
                   