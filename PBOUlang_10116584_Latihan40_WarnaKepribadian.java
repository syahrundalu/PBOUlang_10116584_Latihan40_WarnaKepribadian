/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan40_warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NIM : 10116584
 * Nama : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan40_WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String color;
        String Nama;
        
        warnaKepribadian warna = new warnaKepribadian();
        Scanner scan = new Scanner(System.in);
        
        System.out.println(warna.ANSI_RED+"YUK "+warna.ANSI_RESET);
            System.out.print(warna.ANSI_GREEN+"CEK "+warna.ANSI_RESET);
            System.out.print(warna.ANSI_YELLOW+"KEPRIBADIANMU "+warna.ANSI_RESET);
            System.out.print(warna.ANSI_CYAN+"DARI "+warna.ANSI_RESET);
            System.out.print(warna.ANSI_PURPLE+"WARNA "+warna.ANSI_RESET);
            System.out.print(warna.ANSI_BLUE+"FAVORITMU "+warna.ANSI_RESET);
            
            System.out.println("");
            System.out.println(warna.ANSI_RED_BACKGROUND+warna.ANSI_WHITE+"\t MERAH \t\t"+warna.ANSI_RESET);
            System.out.println(warna.ANSI_GREEN_BACKGROUND+warna.ANSI_WHITE+"\t HIJAU \t\t"+warna.ANSI_RESET);
            System.out.println(warna.ANSI_YELLOW_BACKGROUND+warna.ANSI_WHITE+"\tKUNING \t\t"+warna.ANSI_RESET);
            System.out.println(warna.ANSI_BLUE_BACKGROUND+warna.ANSI_WHITE+"\t BIRU \t\t"+warna.ANSI_RESET);
            System.out.println(warna.ANSI_PURPLE_BACKGROUND+warna.ANSI_WHITE+"\t UNGU \t\t" +warna.ANSI_RESET);
    
            System.out.print("Pilih Warna Favoritmu : ");
            color = scan.next();
            
            //output
            System.out.println("");
            System.out.println("===========HASIL TEST KEPRIBADIANMU=============");
            warna.kepribadian(color);
            
    }
    
}
