import java.util.Scanner;

public class Priklad23 {
    public Priklad23() {
        String znaky = "0123456789ABCDEF";
        int cisloVstup;
        int mezivysledek;
        int soustava;
        String vysledek = "";
        String obracenyVysledek = "";

        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("Číslo v desítkové soustavě: ");
        cisloVstup = Integer.parseInt(scanner.nextLine());

        System.out.print("Číselná soustava (2-16): ");
        soustava = Integer.parseInt(scanner.nextLine());

        mezivysledek = cisloVstup;

        do {
            int zbytek = mezivysledek % soustava;
            mezivysledek /= soustava;

            obracenyVysledek += znaky.charAt(zbytek);
        }
        while (mezivysledek != 0);

        for (int i = obracenyVysledek.length() - 1; i >= 0; i--) {
            vysledek += obracenyVysledek.charAt(i);
        }

        System.out.println("Číslo ve zvolené soustavě: " + vysledek);
    }
}
