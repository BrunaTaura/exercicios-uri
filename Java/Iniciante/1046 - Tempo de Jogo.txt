import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, horas;

        A = sc.nextInt();
        B = sc.nextInt();

        if(A == B){
            horas = 24;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", horas);
        }else if(A < B){
            horas = B - A;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", horas);
        }else{
            horas = (24 - A) + B;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", horas);
        }
    }
}
