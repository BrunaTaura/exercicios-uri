import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002, senhaDigitada;

        do{
            senhaDigitada = sc.nextInt();

            if(senhaDigitada == senhaCorreta){
                System.out.println("Acesso Permitido");
            }else{
                System.out.println("Senha Invalida");
            }
        } while(senhaDigitada != senhaCorreta);
    }
}