import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X, i, N, in = 0, out = 0;

        X = sc.nextInt();
        for(i = 0; i < X; i++){
            N = sc.nextInt();

            if(N >= 10 && N <= 20){
                in++;
            }else{
                out ++;
            }
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}