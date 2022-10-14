import java.util.Scanner;

public class Priklad17 {
    public Priklad17() {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Zadej palindrom:");

        int pokus = 0;
        String palindrom = scanner.nextLine();

        for (int i = 0; i < palindrom.length(); i++) {
            if( (int)palindrom.charAt(i) != ((int)palindrom.charAt((palindrom.length() - 1) - i))) {
                pokus++;
            }
        }

        if(pokus > 0) {
            System.out.println("Toto není palindrom.");
        } else {
            System.out.println("Ano, toto je palindrom.");
        }

    }
}
