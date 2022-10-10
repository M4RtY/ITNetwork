import java.util.Scanner;

public class Priklad6 {
    public Priklad6() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadej řetězec:");
        String retezec = scanner.nextLine().trim().toLowerCase();

        if(retezec.contains("itnetwork")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
