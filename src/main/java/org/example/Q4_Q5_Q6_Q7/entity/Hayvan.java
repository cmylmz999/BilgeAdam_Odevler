package org.example.Q4_Q5_Q6_Q7.entity;

public abstract class Hayvan implements IHayvan {


    private String ad;
    private int yas;
    private double kilo;
    private int ayakSayisi;
    private HareketTipi hareket;
    private int aclik;
    private int saglik;
    private int mutluluk;

    public Hayvan(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", kilo=" + kilo +
                ", ayakSayisi=" + ayakSayisi +
                ", hareket=" + hareket +
                ", aclik=" + aclik +
                ", saglik=" + saglik +
                ", mutluluk=" + mutluluk +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    public HareketTipi getHareket() {
        return hareket;
    }

    public void setHareket(HareketTipi hareket) {
        this.hareket = hareket;
    }

    public int getAclik() {
        return aclik;
    }

    public void setAclik(int aclik) {
        this.aclik = aclik;
    }

    public int getSaglik() {
        return saglik;
    }

    public void setSaglik(int saglik) {
        this.saglik = saglik;
    }

    public int getMutluluk() {
        return mutluluk;
    }

    public void setMutluluk(int mutluluk) {
        this.mutluluk = mutluluk;
    }

    public void sesCikar(){
        System.out.println("Hayvan ses cikariyor.");
    }

    public void hareketEt(){
        System.out.println("Hayvan hareket etti.");
    }

    public void yemekYe(){
        System.out.println("Hayvan yemek yedi.");
    }

    public void suIc(){
        System.out.println("Hayvan su icti.");
    }




}
