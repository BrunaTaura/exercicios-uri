import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R, L, total;

        R = sc.nextDouble();
        L = sc.nextDouble();

        total = L / ((4.0 / 3.0) * (3.1415 * Math.pow(R,3)));
        System.out.println((int)total);
    }
}