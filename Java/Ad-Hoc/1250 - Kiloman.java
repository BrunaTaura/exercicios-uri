import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, tiros, ans=0;
        n = sc.nextInt();
        String pulos, alturas;
        String[] arrayAlturas;

        while(n > 0){

            tiros = sc.nextInt();

            sc.nextLine();
            alturas = sc.nextLine();
            arrayAlturas = alturas.split(" ");

            pulos = sc.nextLine();

            for (int i = 0; i < tiros; i++){
                if((Integer.parseInt(arrayAlturas[i]) == 1 || Integer.parseInt(arrayAlturas[i]) == 2) && pulos.charAt(i) == 'S'){
                    ans++;
                }
                if(Integer.parseInt(arrayAlturas[i]) > 2 && pulos.charAt(i) == 'J'){
                    ans++;
                }
            }
            System.out.println(ans);

            ans=0;
            n--;
        }

    }
}