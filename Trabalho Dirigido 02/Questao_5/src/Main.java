import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
      //X = média
      //S = Desvio Padrão

        System.out.print("Digite o tamanho do vetor: ");
        n = scanner.nextInt();

        float[] v = new float[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite o valor do vetor[" + (i+1) +"]: ");
            v[i] = scanner.nextFloat();
        }
        System.out.println("Média: " + X(v));
        System.out.println("Desvio Padrão: " + S(v));
    }

    static float X(float[] vet) {
        float somatorioX = 0, media;
        for (float num : vet) {
            somatorioX += num;  // Percorrer todo o vetor e fazer o somatório para a média
        }
        media = somatorioX / vet.length;
        return media;
    }

    static float S(float[] vet) {
        float media = X(vet);
        float somatorioS = 0;

        for (float num : vet) {
            somatorioS += (num - media) * (num - media); // Percorrer todo o vetor e fazer o somatório para o desvio padrão
        }
        return (float) sqrt(somatorioS / (vet.length - 1));
    }
}