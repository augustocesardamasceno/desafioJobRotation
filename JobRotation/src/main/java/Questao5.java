import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        String palavraParaReverter;
        Scanner sc=new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        palavraParaReverter=sc.nextLine();
        System.out.print("Palavra revertida: ");
        for(int i=palavraParaReverter.length();i>0;--i)
        {
            System.out.print(palavraParaReverter.charAt(i-1));
        }
    }
}
