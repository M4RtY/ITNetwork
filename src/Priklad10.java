import java.util.Scanner;

public class Priklad10 {
    public Priklad10() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Kolik ryb si dáš k večeři?");
        int pocet = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < pocet; i++) {
            System.out.println("<° )))-<");
        }
    }
}
