import java.util.Scanner;

public class IkaOhjelma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna ikäsi: ");
        int ika = scanner.nextInt();

        System.out.println("Syötetty ikä: " + ika);

        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");

            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }

            if (ika >= 16 && ika <= 17) {
                System.out.println("Saat ajaa kevaria");
            }

        } else if (ika >= 65) { 
            System.out.println("Olet eläkeläinen");

            if (ika == 65) {
                System.out.println("Hyviä eläkepäiviä!");
            }

            if (ika >= 100) {
                System.out.println("Onneksi olkoon 100-vuotiaalle!");
                System.out.println("Upea saavutus!");
                System.out.println("Toivotamme pitkää ikää!");
            }

        } else if (ika >= 58) { 
            System.out.println("Olet aikuinen");
            System.out.println("Voit mennä varhaiseläkkeelle");

        } else {
            if (ika == 18) {
                System.out.println("Olet juuri täysi-ikäinen!");
                System.out.println("Saat ajaa autoa");
            } else {
                System.out.println("Olet aikuinen");
            }

            if (ika % 10 == 0) {
                System.out.println("Onnittelut tasavuosista!");
            }

            if (ika >= 40 && ika <= 50) {
                System.out.println("Parasta keski-ikää!");
            }
        }
    }
}