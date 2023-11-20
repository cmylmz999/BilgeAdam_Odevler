package org.example.entity;

import org.example.entity.enums.AsiliMi;
import org.example.entity.enums.Hastalik;

import java.util.Random;

public class Saglik {

    private Hastalik hastaMi;
    private AsiliMi asiliMi;
    private Asi asi;

    public Saglik(Hastalik hastaMi, AsiliMi asiliMi) {
        this.hastaMi = hastaMi;
        this.asiliMi = asiliMi;
    }

    public Asi getAsi() {
        return asi;
    }

    public void setAsi(Asi asi) {
        this.asi = asi;
    }

    public Hastalik getHastaMi() {
        return hastaMi;
    }

    public void setHastaMi(Hastalik hastaMi) {
        this.hastaMi = hastaMi;
    }

    public AsiliMi getAsiliMi() {
        return asiliMi;
    }

    public void setAsiliMi(AsiliMi asiliMi) {
        this.asiliMi = asiliMi;
    }



    private static void asiYap(Insan insan){

        if(insan instanceof Normal_Insan){

            if(insan.getSaglik().asiliMi== AsiliMi.ASISIZ){

                Asi.sayac+= 1; // Her asi kaydindan sonra sayac 1 artiyor. Her 10 insanda randevuyu ertesi gune vermek icin.

                if (Asi.sayac % 10 == 0) {  // Her gun 10 hastaya asi yapilabiliyor. 10 hastadan sonrasi icin bir gun sonrasina randevu veriliyor.
                    Asi.asiSirasiVer(insan);
                }
                else{
                    insan.getSaglik().asiliMi= AsiliMi.ASILI; //Asilama yapildi.
                    System.out.println("Asi yapildi. Saglikli gunler dileriz");
                    System.out.println(insan.toString());
                    Asi.asiStok-=1; //Stok 1 azaldi.
                }

            }
        }
        else{
            System.out.println("Asi vurunmaniza gerek yoktur.");
        }

    }




    public static void hastaMiKontrolEt(Insan insan){

        Random rnd = new Random();

        if(insan instanceof Normal_Insan || insan instanceof Doktor){

           boolean hastalik = rnd.nextBoolean();
           if(hastalik){
               insan.setKarantinadaMi(true);
               asiYap(insan);
           }
           else{
               System.out.println("Hasta degilsiniz.");
               insan.setKarantinadaMi(false);
               System.out.println(insan.toString());
           }
        }


    }

    @Override
    public String toString() {
        return "Saglik{" +
                "hastaMi=" + hastaMi +
                ", asiliMi=" + asiliMi +
                ", asi=" + asi +
                '}';
    }
}
