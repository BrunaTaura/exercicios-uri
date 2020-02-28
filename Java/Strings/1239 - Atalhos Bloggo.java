import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        int italic = 0, bold = 0;

        while(sc.hasNext()){
            texto = sc.nextLine();

            for(int i = 0; i < texto.length(); i++){

                if(texto.charAt(i) == '_' && italic == 0){
                    texto = texto.replaceFirst(Character.toString(texto.charAt(i)), "<i>");
                    italic = 1;
                }
                else if(texto.charAt(i) == '_' && italic == 1){
                    texto = texto.replaceFirst(Character.toString(texto.charAt(i)), "</i>");
                    italic = 0;
                }
                else if(bold == 0){
                    texto = texto.replaceFirst("\\*", "<b>");
                    bold = 1;
                }
                else if(bold == 1){
                    texto = texto.replaceFirst("\\*", "</b>");
                    bold = 0;
                }

            }
            italic =0;
            bold = 0;
            System.out.printf("%s\n", texto);
        }
    }
}