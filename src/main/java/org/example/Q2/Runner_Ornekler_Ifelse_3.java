package org.example.Q2;

import java.util.Scanner;
import java.util.StringJoiner;

public class Runner_Ornekler_Ifelse_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Lütfen cinsiyetinizi giriniz (E/K): ");
        char cinsiyet = scanner.next().charAt(0);

        if (yas >= 18) {
            if (cinsiyet == 'E' || cinsiyet == 'e') {
                System.out.println("Erkek, 18 yaş ve üstü.");
            } else if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println("Kadın, 18 yaş ve üstü.");
            } else {
                System.out.println("Geçersiz cinsiyet girişi.");
            }
        } else {
            if (cinsiyet == 'E' || cinsiyet == 'e') {
                System.out.println("Erkek, 18 yaş altı.");
            } else if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println("Kadın, 18 yaş altı.");
            } else {
                System.out.println("Geçersiz cinsiyet girişi.");
            }
        }

    }
}
