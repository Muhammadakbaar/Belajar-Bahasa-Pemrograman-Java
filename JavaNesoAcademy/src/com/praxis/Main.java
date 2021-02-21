package com.praxis;

public class Main {

    public static void main(String[] args) {

        // public = access modifier di dlam class, luar class, dalam package, luar package
        // private = access modifier hanya didalam class
        // static keyword = memungkinkan kita untuk mengakses field/method menggunakan nama class

        Akbar akbar = new Akbar();

        Akbar.sayHi();
        akbar.fungsi();


    }
}
