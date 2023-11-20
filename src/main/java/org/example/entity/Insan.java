package org.example.entity;

import org.example.entity.enums.Cinsiyet;

import java.util.Date;
import java.util.UUID;

public abstract class Insan {

    private UUID id;
    private String ad;
    private String soyAd;
    private Cinsiyet cinsiyet;
    private String adres;
    private int tcKimlik;
    private Saglik saglik;
    private boolean karantinadaMi;


    public Insan() {
        this.id = UUID.randomUUID();

    }

    public Insan(UUID id, String ad, String soyAd, Cinsiyet cinsiyet, String adres, int tcKimlik, boolean karantinadaMi) {
        this.id = id;
        this.ad = ad;
        this.soyAd = soyAd;
        this.cinsiyet = cinsiyet;
        this.adres = adres;
        this.tcKimlik = tcKimlik;
        this.karantinadaMi = karantinadaMi;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(int tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public Saglik getSaglik() {
        return saglik;
    }

    public void setSaglik(Saglik saglik) {
        this.saglik = saglik;
    }

    public boolean isKarantinadaMi() {
        return karantinadaMi;
    }

    public void setKarantinadaMi(boolean karantinadaMi) {
        this.karantinadaMi = karantinadaMi;
    }

    @Override
    public String toString() {
        return  ("Insan{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", adres='" + adres + '\'' +
                ", tcKimlik=" + tcKimlik +
                ", saglik=" + saglik +
                ", karantinadaMi=" + karantinadaMi +
                "}\n");
    }
}
