import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i;

        N = sc.nextInt();

        for(i = 1; i <= N; i++){
            System.out.printf("%d %d %d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }
}