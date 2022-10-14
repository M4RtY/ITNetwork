import java.util.Scanner;

public class Priklad21 {
    public Priklad21() {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Zadej text k rozveselení:");

        String text = scanner.nextLine();
        String novy_text = "";

        String[] smajlici = {":)", ":D", ":P"};
        String[] vety = text.split("[.!?]");

        int pozice_oddelovace = 0;
        int puvodni_pozice = 0;

        for (int i = 0; i < vety.length; i++) {
            puvodni_pozice = pozice_oddelovace;
            pozice_oddelovace += vety[i].length() + 1;

            int pozice_smajlika = i % smajlici.length;

            novy_text += text.substring(puvodni_pozice, pozice_oddelovace).replace(".", "") + " " + smajlici[pozice_smajlika];
        }

        System.out.println("Rozveselený text: " + novy_text);
    }
}
