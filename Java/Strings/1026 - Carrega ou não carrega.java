import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long dec1, dec2;

        while(sc.hasNext()){
            dec1 = sc.nextLong();
            dec2 = sc.nextLong();

            System.out.println(dec1 ^ dec2);
        }
    }
}