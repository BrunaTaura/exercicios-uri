import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i, fatorial = 1;

        N = sc.nextInt();

        for(i = N; i > 1; i--){
            fatorial *= i;
        }

        System.out.printf("%d\n", fatorial);
    }
}