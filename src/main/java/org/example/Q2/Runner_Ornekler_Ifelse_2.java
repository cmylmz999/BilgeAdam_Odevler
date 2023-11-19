package org.example.Q2;

public class Runner_Ornekler_Ifelse_2 {
    public static void main(String[] args) {

        // Dizideki palindromelari bulalim.
        // Palindrom : tersten yazildiginda ayni olan kelimeler (mum,ada,yapay,kazak)

        String[] dizi = {"kelime","dizi","yapay", "zeka","kazak","java","ufak","kucuk"};


        for(int i=0;i<dizi.length;i++){

            String yeniKelime = "";
            for(int j=dizi[i].length()-1;j>=0;j--){


                yeniKelime += dizi[i].charAt(j);

            }
            if(dizi[i].equals(yeniKelime)){
                System.out.println("Bu kelime bir palindromedur : " + dizi[i]);
            }
            else{
                System.out.println("Bu kelime bir palindrom degildir : " + dizi[i]);
            }

        }
        /**
         * ***********SONUC***************
         * Bu kelime bir palindrom degildir : kelime
         * Bu kelime bir palindrom degildir : dizi
         * Bu kelime bir palindromedur : yapay
         * Bu kelime bir palindrom degildir : zeka
         * Bu kelime bir palindromedur : kazak
         * Bu kelime bir palindrom degildir : java
         * Bu kelime bir palindrom degildir : ufak
         * Bu kelime bir palindromedur : kucuk
         */
    }
}
