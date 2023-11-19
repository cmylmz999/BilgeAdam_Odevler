package org.example.Q4_Q5_Q6_Q7.entity;

public class Yilan extends Hayvan{

    public Yilan(String ad) {
        super(ad);
        this.setKilo(Math.random());
        this.setHareket(HareketTipi.SURUNEBILIR);
        this.setYas(0);
        this.setAyakSayisi(0);
        this.setAclik(0);
        this.setSaglik(100);
        this.setMutluluk(100);
    }
}
