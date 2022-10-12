import java.util.Scanner;

public class Priklad11 {
    public Priklad11() {
        String objekt = "";

        for (int i = 10; i >= 1; i--) {

            if(i <= 10 && i > 4) {
                objekt = "zelených láhví";
            }
            else if(i <= 4 && i > 1) {
                objekt = "zelené láhve";
            } else {
                objekt = "zelená láhev";
            }

            System.out.println(i + " " + objekt + " stojí na stole a jedna láhev spadne");

        }

    }
}
