package org.example.Q4_Q5_Q6_Q7.entity;

public class Kus extends Hayvan{

    public Kus(String ad) {
        super(ad);
        this.setKilo(Math.random());
        this.setHareket(HareketTipi.UCABILIR);
        this.setYas(0);
        this.setAyakSayisi(0);
        this.setAclik(0);
        this.setSaglik(100);
        this.setMutluluk(100);
    }


}
