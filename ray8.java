package com.mycompany.modullast;
public class ray8 {
    public static void main(String[] args) {
        int[] Bil = {23,26,30,32,33,69,50,70,80,55,53,21};
        
        int jumlahGanjil = 0, jumlahGenap = 0;
        for (int bil : Bil) {
            if (bil%2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }
        }
        
        int[] genap = new int[jumlahGenap];
        int[] ganjil = new int[jumlahGanjil];
        
        int indexGenap = 0, indexGanjil = 0;
        for (int bil : Bil) {
            if (bil%2 == 0) {
                genap [indexGenap++] = bil;
            } else {
                ganjil[indexGanjil++] = bil;
            }
        }
        
        System.out.print("Bilangan Genap : ");
        for (int bil : genap) {
            System.out.print(bil + " ");
        }
        System.out.println();
        
        System.out.print("Bilangan Ganjil : ");
        for (int bil : ganjil) {
            System.out.print(bil + " ");
        }
        System.out.println();
    }
}
