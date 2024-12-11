package com.mycompany.modullast;
import java.util.Scanner;
public class ray9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyak elemen: ");
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Hasil Pengurutan: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        input.close();
    }
}
