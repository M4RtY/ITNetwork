import java.util.Scanner;

public class Priklad5 {
    public Priklad5() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadejte delší slovo:");
        String delsi_slovo = scanner.nextLine().trim();

        System.out.println("Zadejte kratší slovo:");
        String kratsi_slovo = scanner.nextLine().trim();

        int rozdil = delsi_slovo.length() - kratsi_slovo.length();

        System.out.println("Slova se liší délkou o " + rozdil + " znaků");

    }
}
