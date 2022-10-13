import java.util.Arrays;
import java.util.Scanner;

public class Priklad14 {
    public Priklad14() {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        String[] zelenina = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
        String[] ovoce = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};

        String odpoved = "ano";
        int pocet_slov = 0;

        Arrays.sort(zelenina);
        Arrays.sort(ovoce);

        while(odpoved.equals("ano")) {
            System.out.println("Zadej název libovolného ovoce nebo zeleniny:");
            String plodina = scanner.nextLine().trim().toLowerCase();

            if(Arrays.binarySearch(zelenina, plodina) >= 0) {
                System.out.println("Zadal jsi zeleninu");
            } else if(Arrays.binarySearch(ovoce, plodina) >= 0) {
                System.out.println("Zadal jsi ovoce");
            } else {
                System.out.println("Tvoje slovo nemám v seznamu");
            }

            System.out.println("Přeješ si zadat další slovo? (ano/ne)");
            odpoved = scanner.nextLine();

            pocet_slov++;
        }

        System.out.println("Zadal jsi " + pocet_slov + " slov");
    }
}
