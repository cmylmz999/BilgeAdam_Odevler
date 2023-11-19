package org.example.Q4;

public class Runner_Ornekler_SwitchCase {
    public static void main(String[] args) {


        Mevsim mevsim = Mevsim.YAZ;

        switch (mevsim) {
            case ILKBAHAR:
                System.out.println("İlkbahar ayları");
                break;
            case YAZ:
                System.out.println("Yaz ayları");
                break;
            case SONBAHAR:
                System.out.println("Sonbahar ayları");
                break;
            case KIS:
                System.out.println("Kış ayları");
                break;
            default:
                System.out.println("Bilinmeyen mevsim");
        }
    }
}
enum Mevsim {
    ILKBAHAR,
    YAZ,
    SONBAHAR,
    KIS
}


