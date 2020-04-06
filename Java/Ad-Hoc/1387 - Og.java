import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r,l;

        r = sc.nextInt();
        l = sc.nextInt();

        while(r != 0 && l != 0){

            System.out.println(r+l);

            r = sc.nextInt();
            l = sc.nextInt();
        };

    }
}