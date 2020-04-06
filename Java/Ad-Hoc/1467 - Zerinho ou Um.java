import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        char ans;

        while (sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if(a != b && a != c){
                ans = 'A';
            }else if(b != a && b != c){
                ans = 'B';
            }else if(c != a && c != b){
                ans = 'C';
            }else{
                ans = '*';
            }

            System.out.println(ans);
        }

    }
}