import java.util.Scanner;

public class Priklad3 {
    public Priklad3() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadej poloměr kruhu (cm):");
        float polomer = Float.parseFloat(scanner.nextLine());
        float pi = 3.1415f;
        float obvod = 2 * pi * polomer;
        float obsah = 2 * pi * polomer;

        System.out.println("Obvod zadaného kruhu je: " + obvod + " cm");
        System.out.println("Jeho obsah je " + pi * polomer * polomer + " cm^2");
    }
}
