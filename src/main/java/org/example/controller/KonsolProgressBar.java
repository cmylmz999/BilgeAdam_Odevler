package org.example.controller;

public class KonsolProgressBar {

/*
    public void simuleEt(int totalTasks) {
        System.out.print("İşlem devam ediyor: ");

        Thread progressThread = new Thread(() -> {
            for (int i = 0; i <= totalTasks; i++) {
                try {
                    // Simüle edilen bir görev için bekleme süresi (50 milisaniye)
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int progress = (i * 100) / totalTasks;
                updateProgressBar(progress);
            }

            System.out.println("\nİşlem tamamlandı!");
        });

        progressThread.start();
    }

    private void updateProgressBar(int progress) {
        System.out.print("\r[");

        int numberOfBars = 50;
        int completedBars = (progress * numberOfBars) / 100;

        for (int i = 0; i < numberOfBars; i++) {
            if (i < completedBars) {
                System.out.print("=");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print("] " + progress + "%");
    }

    public static void main(String[] args) {
        int totalTasks = 100;

        KonsolProgressBar progressBar = new KonsolProgressBar();
        progressBar.simuleEt(totalTasks);
    }

 */
}
