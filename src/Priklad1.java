import java.util.Scanner;
public class Priklad1 {
    public Priklad1() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Ahoj, jak se jmenuješ?");
        String jmeno = scanner.nextLine();

        System.out.println("Jaký jsi?");
        String povaha = scanner.nextLine();

        System.out.println(jmeno + " je " + povaha);
    }
}
