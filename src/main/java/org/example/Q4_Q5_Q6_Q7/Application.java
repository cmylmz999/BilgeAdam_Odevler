package org.example.Q4_Q5_Q6_Q7;

import org.example.Q4_Q5_Q6_Q7.entity.Hayvan;

import java.util.Random;
import java.util.Scanner;

public class Application extends Thread {

    private final Hayvan hayvan;

    public Application(Hayvan hayvan) {
        this.hayvan = hayvan;
    }

    Thread thread1 =  new Thread(new Runnable() {

        @Override
        public void run() {

            System.out.println("Oyun basladi. Bakalim "+hayvan.getAd()+" kac yasina kadar yasayabilecek?");

            try {

                long baslangic = System.currentTimeMillis();
                Random rnd = new Random();
                Scanner sc = new Scanner(System.in);
                long baslangicZamani = System.currentTimeMillis();
                long beklemeSuresi = 10000;

                boolean kontrol = true;

                while (!Thread.interrupted()) {

                    Thread.sleep(rnd.nextInt(25000,70000));

                    int zaman = rnd.nextInt(1,9);

                    System.out.println(zaman+" saat gecti.");
                    hayvan.setAclik(hayvan.getAclik()+zaman);

                    if(hayvan.getAclik()>2) {
                        while (System.currentTimeMillis() - baslangicZamani < beklemeSuresi || kontrol) {

                                System.out.println(hayvan.getAd() + " acikti. Yemek yesin mi? [E/H] DEFAULT: [E]");
                                String kullaniciGirisi = sc.nextLine();

                                switch (kullaniciGirisi) {
                                    case "E":
                                        System.out.println(hayvan.getAd()+": Hmmmmm yemek cok nefisti.");
                                        hayvan.setKilo(hayvan.getKilo() + Math.random());
                                        hayvan.setAclik(hayvan.getAclik() - rnd.nextInt(1, 7));
                                        kontrol=false;
                                        break;
                                    case "H":
                                        hayvan.setKilo(hayvan.getKilo() - Math.random());
                                        kontrol=false;
                                        break;
                                    default :
                                        hayvan.setKilo(hayvan.getKilo() + Math.random());
                                        hayvan.setAclik(hayvan.getAclik() - rnd.nextInt(1, 7));
                                        break;

                                }



                            try{
                                Thread.sleep(2000);
                            }catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    hayvan.setYas(hayvan.getYas() + 1);
                    System.out.println(hayvan.toString());


                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });




}

