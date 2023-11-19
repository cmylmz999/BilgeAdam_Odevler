package org.example.Q4_Q5_Q6_Q7;

import org.example.Q4_Q5_Q6_Q7.entity.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Runner_SanalBebek {
    public static void main(String[] args) {

        /**
         * YAPIM ASAMASINDA........
         */

        Scanner sc = new Scanner(System.in);
        ArrayList<Hayvan> hayvanlar=  new ArrayList<>();


        System.out.println("***************************************");
        System.out.println("********  SANAL BEBEK OYUNU  **********");
        System.out.println("***************************************");



            System.out.println("Oyunu oynamak istediginiz hayvani secin :\t" +
                    "\tKus\t||" +
                    "\tYilan\t||" +
                    "\tBalik\t||" +
                    "\tKedi");
            String hayvanTuru = sc.nextLine();


            System.out.println("Peki, adi ne olsun ? ");
            String isim = sc.nextLine();

            Hayvan hayvan = switch (hayvanTuru) {
                case "Kus" -> new Kus(isim);

                case "Kedi" -> new Kedi(isim);

                case "Balik" -> new Balik(isim);

                case "Yilan" -> new Yilan(isim);

                default -> throw new IllegalStateException("Bilinmeyen hayvan türü: " + hayvanTuru);
            };

            hayvanlar.add(hayvan);

        Application yeni = new Application(hayvanlar.get(0));
        yeni.thread1.start();




    }
}
