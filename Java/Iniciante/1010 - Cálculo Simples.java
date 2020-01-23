import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, quant1, cod2, quant2;
        double val1, val2, tot;

        cod1 = sc.nextInt();
        quant1 = sc.nextInt();
        val1 = sc.nextDouble();
        cod2 = sc.nextInt();
        quant2 = sc.nextInt();
        val2 = sc.nextDouble();
        tot = quant1 * val1 + quant2 * val2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", tot);
    }
}