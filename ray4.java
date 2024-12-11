package com.mycompany.modullast;
import java.util.Scanner;
public class ray4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data : ");
        int n = input.nextInt();
        System.out.println("Masukkan nilai data");
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        System.out.print("Data yang diisi : ");
        for (int data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
        
        int total = 0, max = array[0], min = array[0];
        for (int data : array) {
            total += data;
            if (data > max) {
                max = data;
            }
            if (data < min) {
                min = data;
            }
        }
        double rataRata = (double) total / n;
        
        System.out.println("\nHasil :");
        System.out.println("Rata-rata\t: " + rataRata);
        System.out.println("Nilai maksimum\t: " + max);
        System.out.println("Nilai minimum\t: " + min);
        input.close();
    }
}
