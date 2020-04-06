import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, n, m, ans;

        t = sc.nextInt();

        while (t > 0){

            n = sc.nextInt();
            m = sc.nextInt();

            ans = (int)Math.ceil(((n-2)/3.0)) * (int)Math.ceil(((m-2)/3.0));

            System.out.println(ans);
            t--;
        }

    }
}