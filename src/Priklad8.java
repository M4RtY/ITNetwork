import java.util.Scanner;

public class Priklad8 {
    public Priklad8() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadej smajlíka:");
        String smajlik = scanner.nextLine();

        switch (smajlik) {
            case ":-)":
            case ":)":
                System.out.println("Tvůj smajlík je veselý");
                break;
            case ":-(":
            case ":(":
                System.out.println("Tvůj smajlík je smutný");
                break;
            case ":-*":
            case ":*":
                System.out.println("Tvůj smajlík je zamilovaný");
                break;
            case ":-P":
            case ":P":
                System.out.println("Tvůj smajlík je s vyplazeným jazykem");
                break;
            default:
                System.out.println("Tvůj smajlík je neznámý");
        }

    }
}
