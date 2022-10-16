import java.util.Scanner;

public class Priklad24 {
    public Priklad24() {
        int[] pole;
        String[] poleRetezcu;
        String zadanyRetezec;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej čísla pro seřazení (oddělená čárkou):");
        zadanyRetezec = sc.nextLine();

        String vysledek = "";

        poleRetezcu = zadanyRetezec.split(",");
        pole = new int[poleRetezcu.length];

        for (int i = 0; i < poleRetezcu.length; i++) {
            pole[i] = Integer.parseInt(poleRetezcu[i].trim());
        }

        for (int i = 0; i < pole.length - 1; i++) {
            int minimalniCislo = pole.length - 1;

            for (int j = i; j < (pole.length - 1); j++) {
                if (pole[minimalniCislo] > pole[j]) {
                    minimalniCislo = j;
                }
            }

            int docasneCislo = pole[minimalniCislo];
            pole[minimalniCislo] = pole[i];
            pole[i] = docasneCislo;
        }


        for (int i = 0; i < pole.length; i++) {
            vysledek += pole[i] + ", ";
        }

        System.out.println("Seřazená čísla: \n" + vysledek.substring(0, vysledek.length()-2));
    }
}
