package org.example.Q5;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;



public class TurkceString  {

    private String metin;





    public char karakterAl(int index){

        return metin.charAt(index);

    }

    public int indexBul(String karakter){

        return metin.indexOf(karakter);

    }

    public String altifade(int baslangic, int bitis){

        return metin.substring(baslangic, bitis);

    }

    public TurkceString(String metin) {
        this.metin = metin;
    }

    public String getMetin() {
        return metin;
    }

    public void setMetin(String metin) {
        this.metin = metin;
    }

    @Override
    public String toString() {
        return "TurkceString{" +
                "metin='" + metin + '\'' +
                '}';
    }
}

