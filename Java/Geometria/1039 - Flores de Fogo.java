import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R1, X1, Y1, R2, X2, Y2;
        double distancia;

        while(sc.hasNext()){
            R1 = sc.nextInt();
            X1 = sc.nextInt();
            Y1 = sc.nextInt();
            R2 = sc.nextInt();
            X2 = sc.nextInt();
            Y2 = sc.nextInt();

            distancia = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 -Y1, 2));
            if (R1 >= R2 + distancia){
                System.out.println("RICO");
            }else{
                System.out.println("MORTO");
            }
        }
    }
}