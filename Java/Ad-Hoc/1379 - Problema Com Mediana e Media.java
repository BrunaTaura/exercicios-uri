import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b, c;

        a = sc.nextInt();
        b = sc.nextInt();

        while(a != 0 && b != 0){

            c = (a * 3) - (a+b);

            System.out.println(c);

            a = sc.nextInt();
            b = sc.nextInt();
        };

    }
}