import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada;

        entrada = sc.nextInt();

        while (entrada != 0 ) {
            int total = calculaQuantidade(entrada);
            System.out.println(total);

            entrada = sc.nextInt();
        }

    }

    public static int calculaQuantidade(int quadrados) {
        int resultado = 0;

        for(int i = 1; i <= quadrados; i++){
            resultado = i * i + resultado;
        }
        return resultado;
    }
}