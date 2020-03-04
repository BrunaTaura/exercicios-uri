import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count, num;
        int vetor[] = new int[2001];

        count = sc. nextInt();

        for(int i = 0; i < count; i++){
            num = sc.nextInt();
            vetor[num]++;
        }

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > 0){
                System.out.printf("%d aparece %d vez(es)\n", i, vetor[i]);
            }
        }
    }
}