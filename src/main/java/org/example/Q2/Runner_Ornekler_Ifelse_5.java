package org.example.Q2;

public class Runner_Ornekler_Ifelse_5 {
    public static void main(String[] args) {
        boolean kosul1 = true;
        boolean kosul2 = false;
        if (kosul1 && kosul2) {
            System.out.println("Her iki koşul da doğru.");
        } else if (kosul1 || kosul2) {
            System.out.println("En az bir koşul doğru.");
        } else {
            System.out.println("Koşullar yanlış.");
        }

    }
}
