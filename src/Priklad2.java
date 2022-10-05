import java.util.Scanner;

public class Priklad2 {
    public Priklad2() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadej číslo k umocnění:");
        int cislo = Integer.parseInt(scanner.nextLine());

        System.out.println("Výsledek: " + cislo * cislo);
    }
}
