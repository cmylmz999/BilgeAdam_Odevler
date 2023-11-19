package org.example.Q3;

public class Runner_Ornekler_Donguler_While {
    public static void main(String[] args) {

        long baslangicZamani = System.currentTimeMillis();
        int i = 0;
        String a = "";


        while(i<=1000000){
            a += Integer.toString(i);
            i++;
        }
        long bitisZamani = System.currentTimeMillis();


        System.out.println("Gecen sure :  "+ (bitisZamani-baslangicZamani));
        //SONUC : 338019 ms
        // en yavas
    }
}
