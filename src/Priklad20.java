import java.util.Scanner;

public class Priklad20 {
    public Priklad20() {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadejte zprávu k zakódování:");
        String zprava = scanner.nextLine().trim().toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        String sifra = "";

        String abeceda = "abcdefghijklmnopqrstuvwxyz";
        String[] morseovka = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        for (int i = 0; i < zprava.length(); i++) {
            sifra += morseovka[abeceda.indexOf(zprava.charAt(i))] + " ";
        }

        System.out.println("Zakódovaná zpráva: " + sifra);
    }
}
