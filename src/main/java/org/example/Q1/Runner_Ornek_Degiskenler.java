package org.example.Q1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Runner_Ornek_Degiskenler {
    public static void main(String[] args) {

        /**
         * *********DEGISKENLER************
         *
         * Primitive veri tipleri
         * Byte -> 8 bittir. 1 byte yer kaplar. Tamsayi turunde -128 ve 127 arasinda degerler alir.
         * Short -> Tam sayi degerler alir. -2^15 ve 2^15-1 arasinda degerler alir. 16 bit, 2 bytetir.
         * Integer -> Tam sayi degiskeni. 2^31-1 ve -2^31 arasi degerler alabilir. 32 bit yani 4 bytetir.
         * Ayrica tam sayilar icin default veri tipidir.
         * Long -> 64  bittir. -2^63 ve 2^63-1 arasi tam sayi degerleri alir.
         * Float -> Ondalik sayi turunde -3.4*10^38 ile 3.4*10^38 degerler alir. Uzunlugu 32 bittir.
         * Double -> Ondalik sayi turunde -1.7*10^308 ve 1.7*10^308 araliginda deger alir. 64 bittir.
         * Char -> Veri tipinin uzunlugu 16 bittir. Karakter turunde deger alir. Deger tek tirnasina yazilir. Escape
         * karakterleri kullanilabilir.
         * Boolean -> true ya da false deger alir. Bellekte 1 bit yer kaplar.
         *
         * Referans veri tipleri
         * String -> Bir char arrayidir. Bir metin girilebilir
         *
         */

        byte s1 = 125;
        short s2 = -5;
        int s3 = 3000000;
        long s4 = 342411414;
        float s5 = 241414.25425f;
        double s6 = 24.14d;
        char karakter = 'd';
        boolean kontrol = true;
        String metin = "Bu benim metinim.";

        //Casting

        long a = 24L + 5; //int deger long a atanabiliyor.
        System.out.println("a degeri : " + a);
        // int a = 24L; // HATA: long deger int'e atanmaya calisiyor.


        float sayi = (float) 2414.34d + 4252.424f; // double degiskeni floata cast etme
        System.out.println(sayi); // sonuc : 6666.7637
        // float sayi = 2414.34d + 4252.424f; // HATA : float degiskene double atanmaya calisiliyor.

        double sayi2 = 2414.34f + 4252.424f; // double, floati kapsadigi icin cast etmeden kullaniyoruz.
        System.out.println(sayi2); // sonuc : 6666.763671875

        int sayi3 = (byte) 5+ (byte) 6; // 2 byte degeri toplayip integera atiyoruz.
        System.out.println(sayi3); // sonuc : 11

        byte sayi4 = 5 +  6; // 2 int degeri toplayip, byte degiskene atiyoruz.
        System.out.println(sayi4); // sonuc : 11

        byte sayi5 = (int) 5 + (int) 6; // UYARI: 5 ve 6 sayi degerleri int'e cast edilmese de int tipinde.
        System.out.println(sayi5); // Yine de sorunsuz calisiyor.

        byte sayi6 = (byte) 120+ (byte) 240; // Int degeri bytea cast ediyoruz.
        System.out.println(sayi6); // sonuc : 104 (360-256 = 104)
        // byte sayi6 = 120+240; HATA : Int degeri bytea atamaya calisiliyor.


    }
}