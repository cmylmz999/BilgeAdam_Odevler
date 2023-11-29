package org.example;


import java.util.*;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Random rnd = new Random();
        int [] dizi = new int[10_000];
        int sayiUstLimit = 100;

        /**
         * 1. SORU
         */

        for(int i=0; i<dizi.length;i++){

            dizi[i] = rnd.nextInt(1,sayiUstLimit+1); // diziye 10000 tane (0,100] sayi ekleniyor.

        }

        Map<Integer,Long> map = new HashMap<>();
        for(int i=1;i<sayiUstLimit+1;i++){
            int finalI = i;
            map.put(i,Arrays.stream(dizi).filter(n->n== finalI).count()); // 1 sayidan kac tane odlugu bulunup mape ekleniyor.

        }

        System.out.println(map); // 1. sorunun cevabi

        /**
         * 2. SORU
         */

        List<Integer> integerList = new ArrayList<>();
        for(int i=1; i<sayiUstLimit+1;i++) {

            for (int j = 1; j <= map.get(i); j++) { // mapteki key degeri o sayiyi, value degeri o sayidan kac tane bulundugunu ifade ediyor.
                integerList.add(i);  // sayilarin value degeri kadar diziye o sayidan ekleme yapiliyor.
            }
        }
        System.out.println(integerList);
        System.out.println(integerList.size());

        /**
         * 3. SORU
         */

        // BU SORUYU TAM ANLAMADIM.


    }
}