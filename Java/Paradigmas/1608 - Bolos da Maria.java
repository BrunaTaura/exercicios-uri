import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, dinheiro, ingrediente, bolos, qi, indice, quantidade, soma = 0, menorValor, total;
        int [] preco = new int[110];

        t = sc.nextInt();

        while(t > 0){

            dinheiro = sc.nextInt();
            ingrediente = sc.nextInt();
            bolos = sc.nextInt();

            for(int i = 0; i < ingrediente; i++){
                preco[i] = sc.nextInt();
            }

            menorValor = dinheiro + 1;
            for(int i = 0; i < bolos; i++){
                qi = sc.nextInt();

                for(int j = 0; j < qi; j++){
                    indice = sc.nextInt();
                    quantidade = sc.nextInt();
                    soma += preco[indice] * quantidade;
                }
                if(soma < menorValor){
                    menorValor = soma;
                }
                soma = 0;
            }

            total = dinheiro / menorValor;

            System.out.println(total);
            t--;
        }
    }
}