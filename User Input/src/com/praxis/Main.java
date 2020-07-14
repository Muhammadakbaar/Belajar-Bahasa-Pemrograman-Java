package com.praxis;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai pertama = ");
        int data1 = input.nextInt();

        System.out.println("masukan nilai kedua = ");
        int data2 = input.nextInt();

        int data3 = data1 + data2;
        System.out.println("Jumlah nilai keduanya adalah = " + data3);
    }
}
