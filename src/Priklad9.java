import java.util.Scanner;

public class Priklad9 {
    public Priklad9() {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadejte postupně koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 :");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if(a != 0) {

            double d = ((b * b) - (4 * a * c));
            double x_1 = ((-b + (Math.sqrt(d))) / (2 * a));
            double x_2 = ((-b - (Math.sqrt(d))) / (2 * a));

            if (d < 0) {
                System.out.println("Neexistuje řešení v oblasti reálných čísel");
            } else if (d > 0) {
                System.out.println("Rovnice má 2 reálné kořeny x1 = " + x_1 + ", x2 = " + x_2);
            } else {
                System.out.println("Rovnice má jeden kořen x = " + x_1);
            }
        } else {
            System.out.println("Není kvadratická rovnice");
        }
    }
}
