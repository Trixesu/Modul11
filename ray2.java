package com.mycompany.modullast;
import java.util.Scanner;
public class ray2 {
    public static void main(String[] args) {
        int[] skor;
        skor = new int [5];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i <= 4; i++) {
            System.out.print("Data ke "+(i+1)+" : ");
            skor [i] = input.nextInt();
        }
        for (int i = 0; i <= 4; i++)System.out.println("Data ke "+(i+1)+" adalah "+skor[4-i]);
    }
}