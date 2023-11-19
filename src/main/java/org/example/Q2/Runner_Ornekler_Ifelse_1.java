package org.example.Q2;

public class Runner_Ornekler_Ifelse_1 {
    public static void main(String[] args) {

        /**
         * Dizinin en buyuk degerini bulalim.
         */

        int[] dizi = {512, 1242, 5152, 11, 22, 44, 66, 22 , 44 , 444 ,242};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<dizi.length;i++ ){

            if(max<dizi[i]){

                max = dizi[i];
            }

        }
        System.out.println(max);



    }
}
