package org.example.entity;

import org.example.entity.enums.AsiliMi;
import org.example.entity.enums.Cinsiyet;
import org.example.entity.enums.Hastalik;

import java.util.UUID;

public class SuperInsan extends Insan{

    public SuperInsan() {
        this.setSaglik(new Saglik(Hastalik.HASTA_DEGIL, AsiliMi.BAGISIK));
    }

    public SuperInsan(UUID id, String ad, String soyAd, Cinsiyet cinsiyet, String adres, int tcKimlik, boolean karantinadaMi) {
        super(id, ad, soyAd, cinsiyet, adres, tcKimlik, karantinadaMi);
        this.setSaglik(new Saglik(Hastalik.HASTA_DEGIL, AsiliMi.BAGISIK));
    }
}
