import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        double media, valor1, valor2, valor3;

        N = sc.nextInt();

        for(i = 0; i < N; i++) {
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();

            media = valor1 * 0.2 + valor2 * 0.3 + valor3 * 0.5;

            System.out.printf("%.1f\n", media);
        }
    }
}