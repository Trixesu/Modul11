package com.mycompany.modullast;
import java.util.Scanner;
public class ray3 {
    public static void main(String[] args) {
        int[] skor;
        int[] cadangan;
        skor = new int [5];
        cadangan = new int [5];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Skor");
        for (int i = 0; i <= 4; i++) {
            System.out.print("Data ke "+(i+1)+" : ");
            skor [i] = input.nextInt();
        }
        System.out.println();
        for (int i = 0; i <= 4; i++) {
            cadangan [i] = skor [i];
        }
        System.out.println("Skor");
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke "+(i+1)+" adalah "+skor[4-i]);
        }
        System.out.println();
        System.out.println("Cadangan");
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke "+(i+1)+" adalah "+cadangan[4-i]);
        }
        input.close();
    }
}