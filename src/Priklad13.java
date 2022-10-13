import java.util.Scanner;

public class Priklad13 {
    public Priklad13() {
        int cisla[] = new int[10];

        for (int i = 10; i > 0; i--) {
            cisla[cisla.length - i] = i;
        }

        for (int cislo: cisla) {
            System.out.println(cislo);
        }
    }
}
