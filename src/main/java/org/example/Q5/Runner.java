package org.example.Q5;

public class Runner {
    public static void main(String[] args) {


        String c = "deneme metnidir. ";

        TurkceString deneme = new TurkceString(c);

        System.out.println(deneme.altifade(0,7));

        System.out.println(deneme.karakterAl(2));

        System.out.println(deneme.indexBul("e"));




    }
}
