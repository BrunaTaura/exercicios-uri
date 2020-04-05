import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, x, soma = 0, km = 0, k ;
        int[] fib = new int[21];
        int[] bits = new int[21];

        fib[0] = 1;
        fib[1] = 2;
        for(int i = 2; i < fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        t = sc.nextInt();

        while (t > 0){
            x = sc.nextInt();

            for(int i = fib.length - 1; i >= 0; i--){
                if(fib[i] + soma <= x){
                    soma += fib[i];
                    bits[i] = 1;
                }
            }

            for(int i = bits.length - 1; i > 0; i--){
                if(bits[i] == 1){
                    k = 0;
                    for(int j = 1; j <= i; j++){
                        km += bits[j] * fib[k];
                        k++;
                    }
                    break;
                }
            }

            for(int i = 0; i < bits.length; i++){
                bits[i] = 0;
            }
            System.out.println(km);
            km = 0;
            soma = 0;
            t--;
        }
    }
}