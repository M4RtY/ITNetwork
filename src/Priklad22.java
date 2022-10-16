import java.util.Scanner;

public class Priklad22 {
    public Priklad22() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("██");
                }
            }
            System.out.println();
        }
    }
}
