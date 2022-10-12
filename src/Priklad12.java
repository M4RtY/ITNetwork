import java.util.Scanner;

public class Priklad12 {
    public Priklad12() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadejte levou mez 1. intervalu: ");
        int levaMez1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Zadejte pravou mez 1. intervalu: ");
        int pravaMez1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Zadejte levou mez 2. intervalu: ");
        int levaMez2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Zadejte pravou mez 2. intervalu: ");
        int pravaMez2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Dvojice čísel, jejichž součet leží v některém z intervalů:");
        System.out.println("(1. číslo je z prvního intervalu a 2. z druhého intervalu)");

        int soucet;
        for (int i = levaMez1; i <= pravaMez1; i++) {
            for (int j = levaMez2; j <= pravaMez2; j++) {
                soucet = i + j;
                if (((soucet <= pravaMez2) && (soucet >= levaMez2)) || ((soucet <= pravaMez1) && (soucet >= levaMez1))) {
                    System.out.printf("[%d;%d], ", i, j);
                }
            }
        }

    }
}
