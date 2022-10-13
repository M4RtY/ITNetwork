import java.util.Arrays;
import java.util.Scanner;

public class Priklad15 {
    public Priklad15() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadej počet čísel:");

        int pocet = Integer.parseInt(scanner.nextLine());
        int[] cisla = new int[pocet];

        for (int i = 1; i <= pocet; i++) {
            System.out.println("Zadej " + i + ". číslo:");
            cisla[i-1] = Integer.parseInt(scanner.nextLine());
        }

        int[] cisla_copy = new int[cisla.length];

        for (int i = 0; i < cisla.length; i++) {
            cisla_copy[i] = cisla[i];
        }
        Arrays.sort(cisla_copy);

        float median = cisla_copy[cisla_copy.length / 2];

        for (int i: cisla) {
            System.out.printf("%d se od mediánu odchyluje o %f \n", i, i - median);
        }
    }
}
