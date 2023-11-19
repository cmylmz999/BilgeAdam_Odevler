package org.example.Q4_Q5_Q6_Q7.entity;

public class Balik extends Hayvan{


    public Balik(String ad) {
        super(ad);
        this.setKilo(Math.random());
        this.setHareket(HareketTipi.YUZEBILIR);
        this.setYas(0);
        this.setAyakSayisi(0);
        this.setAclik(0);
        this.setSaglik(100);
        this.setMutluluk(100);
    }
}
