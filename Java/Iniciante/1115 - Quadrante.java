import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X,Y;

        do{
            X = sc.nextInt();
            Y = sc.nextInt();

            if(X > 0 && Y > 0){
                System.out.println("primeiro");
            }else if(X > 0 && Y < 0){
                System.out.println("quarto");
            }else if(X < 0 && Y < 0){
                System.out.println("terceiro");
            }else if(X < 0 && Y > 0){
                System.out.println("segundo");
            }
        }while(X != 0 && Y != 0);
    }
}