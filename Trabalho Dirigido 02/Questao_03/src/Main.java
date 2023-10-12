import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("ConstantValue")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        int N;

        System.out.print("Digite o tamanho do vetor: ");
        N = scanner.nextInt();
        scanner.nextLine();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = gerador.nextInt(); // Gerador de números aleatórios
            System.out.println(A[i]);
        }

        maiorElem(A);
    }


    static void maiorElem(int[] v) {
        int maior = v[0]; // Pego o primeiro elemento do vetor para a comparação
        for (int n : v) {
            if (n > maior) { // Se for maior que o v[0] ele subistitui o valor do maior por n, até encontrar o maior valor
                if (n == maior) {
                    n = maior;
                }
                maior = n;
            }
        }
        System.out.println("Maior elemento da array: " + maior);
    }
}