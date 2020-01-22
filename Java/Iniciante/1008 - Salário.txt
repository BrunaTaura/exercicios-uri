import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcNum, horas;
        double valHor, total;

        funcNum = sc.nextInt();
        horas = sc.nextInt();
        valHor = sc.nextDouble();

        total = horas * valHor;

        System.out.printf("NUMBER = %d\n", funcNum);
        System.out.printf("SALARY = U$ %.2f\n", total);
    }
}