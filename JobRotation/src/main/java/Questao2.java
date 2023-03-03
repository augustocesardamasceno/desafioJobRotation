import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int anterior;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int fibonacciCheck = scanner.nextInt();

        List<Integer> fibonacciList = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            anterior = a;
            a = a + b;
            b = anterior;
            fibonacciList.add(a);
        }
        System.out.println(fibonacciList);

        if (fibonacciList.contains(fibonacciCheck)){
            System.out.println("Pertence a sequência de Fibonacci");
        } else System.out.println("Não pertence a sequência de Fibonacci");
    }
}
