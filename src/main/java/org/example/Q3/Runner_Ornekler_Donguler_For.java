package org.example.Q3;

import java.util.Date;

public class Runner_Ornekler_Donguler_For {
    public static void main(String[] args) {

        long baslangicZamani = System.currentTimeMillis();

        String a = "";
        for(int i=0; i<1000000;i++){
            a += Integer.toString(i);

        }
        long bitisZamani = System.currentTimeMillis();


        System.out.println("Gecen sure :  "+ (bitisZamani-baslangicZamani));
        //sonuc : 330134 ms
        // sonuclara gore en hizlisi for dongusu
    }
}
