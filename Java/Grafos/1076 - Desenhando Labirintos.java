import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, n, v, a, no1, no2, ans = 0;
        int[][] matriz;

        t = sc.nextInt();

        while(t > 0){
            n = sc.nextInt();

            v = sc.nextInt();
            a = sc.nextInt();

            matriz = new int [v][v];

            for(int i = 0; i < a; i++){
                no1 = sc.nextInt();
                no2 = sc.nextInt();
                matriz[no1][no2] = 1;
                matriz[no2][no1] = 1;
            }

            for(int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz.length; j++){
                    if(matriz[i][j] == 1){
                        ans++;
                    }
                }
            }

            System.out.println(ans);
            ans = 0;
            t--;
        }
    }
}