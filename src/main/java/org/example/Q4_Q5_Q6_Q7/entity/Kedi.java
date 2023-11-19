package org.example.Q4_Q5_Q6_Q7.entity;

public class Kedi extends Hayvan{

    public Kedi(String ad) {
        super(ad);
        this.setKilo(Math.random());
        this.setHareket(HareketTipi.KOSABILIR);
        this.setYas(0);
        this.setAyakSayisi(0);
        this.setAclik(0);
        this.setSaglik(100);
        this.setMutluluk(100);
    }
}
