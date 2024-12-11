package com.mycompany.modullast;
import java.util.Scanner;
public class ray5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data : ");
        int n = input.nextInt();
        System.out.println("Masukkan nilai data");
        double[] array = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke "+(i+1)+" : ");
            array[i] = input.nextDouble();
        }
        System.out.print("Data yang diisi : ");
        for (double data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
        
        double total = 0, max = array[0], min = array[0];
        for (double data : array) {
            total += data;
            if (data > max) {
                max = data;
            }
            if (data < min) {
                min = data;
            }
        }
        double rataRata = total / n;
        
        System.out.println("\nHasil :");
        System.out.println("Rata-rata\t: " + rataRata);
        System.out.println("Nilai maksimum\t: " + max);
        System.out.println("Nilai minimum\t: " + min);
        input.close();
    }
}
