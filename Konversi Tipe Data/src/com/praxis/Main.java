package com.praxis;

public class Main {

    public static void main(String[] args) {
	// program untuk konversi tipe data

        int nilai = 225;
        System.out.println("nilai " + nilai);

        long nilai2 = nilai;
        System.out.println("nilai2 " + nilai2);

        byte nilai3 = (byte) nilai2;
        System.out.println("nilai3 " + nilai3);
        System.out.println(Byte.MAX_VALUE);

        int a = 5;
        float b = 2;

        float c = a/b;
        System.out.printf("%d / %f = %f \n", a,b,c);

        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);


    }
}
