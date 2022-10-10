import java.util.Scanner;

public class Priklad4 {
    public Priklad4() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadej jméno:");
        String jmeno = scanner.nextLine();

        System.out.println("Zadej příjmení:");
        String prijmeni = scanner.nextLine();

        System.out.println("Zadej svůj věk:");
        int vek = Integer.parseInt(scanner.nextLine());

        System.out.println((jmeno + " " + prijmeni).toUpperCase());
        System.out.println("Za rok ti bude " + (vek + 1) + " let.");

    }
}
