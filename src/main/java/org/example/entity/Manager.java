package org.example.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager {

    private static int managerIndex = 1;
    private String haftalar;
    List<Menu> menuList = new ArrayList<>();




    Menu pazartesiMenu = new Menu();
    Menu saliMenu = new Menu();
    Menu carsambaMenu = new Menu();
    Menu persembeMenu = new Menu();
    Menu cumaMenu = new Menu();
    Menu cumartesiMenu = new Menu();
    Menu pazarMenu = new Menu();

    public Manager() {
        this.haftalar = managerIndex++ + " Hafta";
        this.menuList.add(pazartesiMenu);
        this.menuList.add(saliMenu);
        this.menuList.add(carsambaMenu);
        this.menuList.add(persembeMenu);
        this.menuList.add(cumaMenu);
        this.menuList.add(cumartesiMenu);
        this.menuList.add(pazarMenu);
    }

    @Override
    public String toString() {
        return "\n"+haftalar + " Menu Listesi\n" + "----------------------\n" + menuList;


    }
}
