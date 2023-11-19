package org.example.Q3;

public class Runner_Ornekler_Donguler_DoWhile {
    public static void main(String[] args) {

        long baslangicZamani = System.currentTimeMillis();
        int i = 0;
        String a = "";


        do{
            a += Integer.toString(i);
            i++;
        }
        while(i<=1000000);


        long bitisZamani = System.currentTimeMillis();


        System.out.println("Gecen sure :  "+ (bitisZamani-baslangicZamani));

        //sonuc : 332546 ms
        //2. en hizli



    }
}
