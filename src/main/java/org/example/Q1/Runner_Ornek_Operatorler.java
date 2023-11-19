package org.example.Q1;

public class Runner_Ornek_Operatorler {

    public static void main(String[] args) {


        /**
         * *********OPERATORLER************
         * Sirasiyla toplama, cikarma,carpma, bolme, mod alma operatorleri : + , - , *, / , %
         * 1 arttirma veya 1 azaltma operatorleri operatorleri : ++sayi, --sayi, sayi++, sayi--
         * Karsilastirma operatorleri : < , >, <=, >=, == , !=
         * Mantiksal ve, veya operatorleri : %% , ||
         * Atama operatorleri : += , -=, *=, /=
         *
         *
         */

        // ARITMATIK ISLEM OPERATORLERI
        int toplam = 10 + 5;
        int cikartma = 10 - 5;
        int carpim = 10 * 5;
        int bolum = 10 / 5;
        int mod = 10 % 5;
        System.out.println("Toplam : "+ toplam +"\nCikartma : "+ cikartma+
                "\nCarpim : "+ carpim + "\nBolum : "+bolum+"\nMod : "+mod);
        //Toplam : 15
        //Cikartma : 5
        //Carpim : 50
        //Bolum : 2
        //Mod : 0

        //1 ARTTIRMA, 1 AZALTMA OPERATORLERI
        int s1= 5;
        System.out.println(s1++); // sonuc : 5
        System.out.println(s1); // sonuc : 6
        int s2 = 5;
        System.out.println(++s2); // sonuc : 6

        //MANTIKSAL VE, VEYA OPERATORLERI
        boolean kontrol = s1==s2;
        System.out.println(kontrol); // sonuc : true

        boolean kontrol2 = (s1==6 || s2 ==5);
        System.out.println(kontrol2); // sonuc : true

        boolean kontrol3 = (s1!=6 || s2!=6);
        System.out.println(kontrol3); // sonuc : false

        //Atama Operatorleri
        int s4 = 5;
        int s5 = 10;
        s4 += s5;
        System.out.println(s4);// sonuc : 15


    }
}
