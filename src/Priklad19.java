import java.util.Scanner;

public class Priklad19 {
    public Priklad19() {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Výpočet průměru známek");
        System.out.println("Zadejte známky oddělené čárkou:");

        int soucet_znamek = 0;
        double prumer_znamek = 0;
        String znamky = scanner.nextLine();
        String[] znamky_pole = znamky.split(",");

        for (String znamka: znamky_pole) {
            soucet_znamek += Integer.parseInt(znamka);
        }

        prumer_znamek = (double) soucet_znamek / znamky_pole.length;

        System.out.println("Průměr: " + prumer_znamek);
    }
}
