import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        salario = sc.nextDouble();

        if(salario < 2000.01){
            System.out.println("Isento");
        }
        if(salario >= 2000.01 && salario <= 3000){
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
        if(salario >= 3000.01 && salario <= 4500){
            imposto = 80 + ((salario - 3000) * 0.18) ;
            System.out.printf("R$ %.2f\n", imposto);
        }
        if(salario > 4500){
            imposto = 350 + ((salario - 4500) * 0.28);
            System.out.printf("R$ %.2f\n", imposto);
        }

    }
}