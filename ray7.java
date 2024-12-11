package com.mycompany.modullast;
public class ray7 {
    public static void main(String[] args) {
        
        int[] usia1 = {18,39,45,50,65,70,90};
        int[] usia2 = {20,32,54,66,75,80,85,89,90,95,96};
        
        int[] usiaGabung = new int [usia1.length + usia2.length];
        
        int i = 0, j = 0, k = 0;
        
        while (i < usia1.length && j < usia2.length) {
            if (usia1[i] <= usia2[j]) {
                usiaGabung[k++] = usia1[i++];
            } else {
                usiaGabung[k++] = usia2[j++];
            }
        }
        while (i < usia1.length) {
            usiaGabung[k++] = usia1[i++];
        }
        while (j < usia2.length) {
            usiaGabung[k++] = usia2[j++];
        }
        System.out.print("Array usiaGabung : ");
        for (int usia : usiaGabung) {
            System.out.print(usia+" ");
        }
    }
}
