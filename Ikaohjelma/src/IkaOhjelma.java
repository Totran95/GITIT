import java.util.Scanner;

public class IkaOhjelma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anna ikäsi: ");
        int ika = scanner.nextInt();

        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");
        } else {
            System.out.println("Olet aikuinen");
        }
    
if (ika >= 15) {
    System.out.println("Saat ajaa mopoa");
}

if (ika >= 16 && ika <= 17) {
    System.out.println("Saat ajaa kevaria");
}

    }
}