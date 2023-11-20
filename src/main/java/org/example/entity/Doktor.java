package org.example.entity;

import org.example.entity.enums.AsiliMi;
import org.example.entity.enums.Cinsiyet;
import org.example.entity.enums.Hastalik;

import java.util.UUID;

public class Doktor extends Insan{



    public Doktor() {
        this.setSaglik(new Saglik(Hastalik.BILINMIYOR, AsiliMi.ASILI));
    }

    public Doktor(UUID id, String ad, String soyAd, Cinsiyet cinsiyet, String adres, int tcKimlik, boolean karantinadaMi) {
        super(id, ad, soyAd, cinsiyet, adres, tcKimlik, karantinadaMi);
        this.setSaglik(new Saglik(Hastalik.BILINMIYOR, AsiliMi.ASILI));
    }


}
