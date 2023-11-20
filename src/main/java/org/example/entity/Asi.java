package org.example.entity;

import org.example.repository.AsiRepository;

import java.time.LocalDate;
import java.util.List;

public class Asi {
    private int asiSiraNumarasi;
    private LocalDate asiTarihi;
    public static int asiStok;
    public static int sayac = 0;




    public Asi(int asiSiraNumarasi, LocalDate asiTarihi) {
        this.asiSiraNumarasi = asiSiraNumarasi;
        this.asiTarihi = asiTarihi;

    }

    public int getAsiSiraNumarasi() {
        return asiSiraNumarasi;
    }

    public void setAsiSiraNumarasi(int asiSiraNumarasi) {
        this.asiSiraNumarasi = asiSiraNumarasi;
    }

    public LocalDate getAsiTarihi() {
        return asiTarihi;
    }

    public void setAsiTarihi(LocalDate asiTarihi) {
        this.asiTarihi = asiTarihi;
    }



    public static void asiSirasiVer(Insan insan){

        LocalDate bugun = LocalDate.now();
        AsiRepository.asiListesi.add(new Asi(sayac,(bugun.plusDays(sayac / 10))));

        System.out.println("Asi tarihi : " + AsiRepository.asiListesi.get(sayac) + "\nBu tarihe kadar lutfen karantinada kaliniz.");
        sayac++;
    }
}
