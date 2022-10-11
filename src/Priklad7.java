import java.util.Scanner;

public class Priklad7 {
    public Priklad7() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadej své jméno:");
        String jmeno = scanner.nextLine();

        if(jmeno.length() > 3 && jmeno.length() < 10) {
            System.out.println("Normální jméno.");
        } else {
            System.out.println("Máš moc krátké nebo moc dlouhé jméno!");
        }

    }
}
