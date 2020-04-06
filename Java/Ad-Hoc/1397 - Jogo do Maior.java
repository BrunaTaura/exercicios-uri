import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, a, b, countA=0, countB=0;

        n = sc.nextInt();

        while (n != 0){

            for(int i = 0; i < n; i++){
                a = sc.nextInt();
                b = sc.nextInt();

                if(a > b){
                    countA++;
                }else if(b > a){
                    countB++;
                }
            }

            System.out.printf("%d %d\n", countA, countB);

            countA = 0;
            countB = 0;

            n = sc.nextInt();
        }

    }
}