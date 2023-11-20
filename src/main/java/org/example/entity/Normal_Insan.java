package org.example.entity;

import org.example.entity.enums.AsiliMi;
import org.example.entity.enums.Cinsiyet;
import org.example.entity.enums.Hastalik;

import java.util.UUID;

public class Normal_Insan extends Insan{

    public Normal_Insan() {
        this.setSaglik(new Saglik(Hastalik.BILINMIYOR, AsiliMi.ASISIZ));
    }

    public Normal_Insan(UUID id, String ad, String soyAd, Cinsiyet cinsiyet, String adres, int tcKimlik, boolean karantinadaMi) {
        super(id, ad, soyAd, cinsiyet, adres, tcKimlik, karantinadaMi);
        this.setSaglik(new Saglik(Hastalik.BILINMIYOR, AsiliMi.ASISIZ));
    }
}
