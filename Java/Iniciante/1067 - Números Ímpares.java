import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X, i;
        X = sc.nextInt();

        for(i = 1; i <= X; i++){
            if(i % 2 != 0){
                System.out.printf("%d\n", i);
            }
        }
    }
}