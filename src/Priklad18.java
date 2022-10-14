import java.util.Scanner;

public class Priklad18 {
    public Priklad18() {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadejte text k zašifrování:");
        String text = scanner.nextLine().trim().toLowerCase();

        System.out.println("Zadejte heslo:");
        String heslo = scanner.nextLine().trim().toLowerCase();

        String sifra = "";

        int znak_a = 'a';
        int znak_z = 'z';

        for (int i = 0; i < text.length(); i++) {
            char znak_text = text.charAt(i);
            char znak_heslo = heslo.charAt(i % heslo.length());
            int posun = znak_heslo - znak_a + 1;

            if ((int) text.charAt(i) + posun > znak_z) {
                posun -= znak_z - znak_a + 1;
            }

            sifra += (char)((int) znak_text + posun);

        }

        System.out.println(sifra);

    }
}
