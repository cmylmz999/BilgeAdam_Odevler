package org.example.repository;

import org.example.entity.Insan;
import org.example.entity.Saglik;
import org.example.entity.enums.AsiliMi;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Insan_Repository {
    private List<Insan> insanlar;

    public Insan_Repository() {
        this.insanlar = new ArrayList<>();
    }

    public void ekle(Insan insan) {
        insanlar.add(insan);
    }

    public Insan getById(UUID id) {
        for (Insan insan : insanlar) {

            if (insan.getId() == id) {
                return insan;
            }
        }
        return null;
    }

    public Insan getByAsi() {
        for (Insan insan : insanlar) {

            if (insan.getSaglik().getAsiliMi() == AsiliMi.ASILI) {
                return insan;
            }
        }
        return null;
    }

    public List<Insan> getList() {
        return new ArrayList<>(insanlar);
    }

    public void guncelle(Insan updatedInsan) {
        for (int i = 0; i < insanlar.size(); i++) {

            if (insanlar.get(i).getId() == updatedInsan.getId()) {
                insanlar.set(i, updatedInsan);
                break;
            }
        }
    }

    public void sil(int id) {

    }
}
