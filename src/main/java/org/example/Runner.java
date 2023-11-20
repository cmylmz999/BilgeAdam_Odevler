package org.example;

import org.example.entity.Doktor;
import org.example.entity.Insan;
import org.example.entity.Normal_Insan;
import org.example.entity.SuperInsan;
import org.example.entity.enums.Cinsiyet;
import org.example.repository.Insan_Repository;

import java.util.Random;

public class Runner {

    public static void main(String[] args) {

        Insan_Repository insanrep = new Insan_Repository();

        insanrep.ekle(new Doktor());
        insanrep.ekle(new Normal_Insan());
        insanrep.ekle(new Normal_Insan());
        insanrep.ekle(new Normal_Insan());
        insanrep.ekle(new Normal_Insan());
        insanrep.ekle(new Normal_Insan());
        insanrep.ekle(new Normal_Insan());
        insanrep.ekle(new Normal_Insan());
        insanrep.ekle(new Normal_Insan());
        insanrep.ekle(new Normal_Insan());
        insanrep.ekle(new Normal_Insan());

        System.out.println(insanrep.getList());





    }
}
