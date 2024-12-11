package com.mycompany.modullast;
import java.util.Scanner;
public class ray6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] A = {2,7,3,9,4,1,34,25,76,80,90,54,21,78};
        
        System.out.print("Array A : ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
            
        }
        System.out.println();
        
        System.out.print("Masukkan nilai yang dicari : ");
        int nilaiDicari = input.nextInt();
        
        int index = -1;
        for (int i = 0; i <= A.length; i++) {
            if (A[i] == nilaiDicari) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Nilai "+nilaiDicari+" berada di index    : "+(index+1));
        } else {
            System.out.println("Tidak ada");
        }
        input.close();
    }
}
