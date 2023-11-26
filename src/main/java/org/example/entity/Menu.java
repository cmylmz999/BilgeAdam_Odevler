package org.example.entity;

import java.util.ArrayList;
import java.util.Random;

public class Menu {


    Corbalar corba;
    Yemekler yemek;
    Icecekler icecek;
    Tatlilar tatli;
    Gunler gun;

    Random rnd = new Random();
    private static int index =0;

    Menu() {
        this.gun = Gunler.values()[index++];
        this.corba = Corbalar.values()[rnd.nextInt(0,Corbalar.values().length)];
        this.yemek = Yemekler.values()[rnd.nextInt(0,Yemekler.values().length)];
        this.icecek = Icecekler.values()[rnd.nextInt(0,Icecekler.values().length)];
        this.tatli = Tatlilar.values()[rnd.nextInt(0,Tatlilar.values().length)];
    }


    @Override
    public String toString() {
        return  "\n"+"Menu{" +
                " gun = " + gun +
                ", corba = " + corba +
                ", yemek = " + yemek +
                ", icecek = " + icecek +
                ", tatli = " + tatli +
                '}';
    }
}
