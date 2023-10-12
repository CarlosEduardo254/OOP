import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        int N;

        System.out.print("Digite o tamanho do vetor: ");
        N = scanner.nextInt();
        scanner.nextLine();

        int[] A = new int[N];

        for (int i = 0; i < N; i++){
            A[i] = gerador.nextInt(); // Gerador de números aleatórios
            System.out.println(A[i]);
        }

        System.out.println("\n");
        System.out.println("Quantidade de números pares: " + contPar(A));
        System.out.println("Quantidade de números impares: " + contImpar(A));
        System.out.println("Quantidade de números positivos: " + contPositivo(A));
        System.out.println("Quantidade de números negativos: " + contNegativo(A));
        System.out.println("Quantidade de números neutros: " + contNeutro(A));

    }

    static int contPar (int[] v){
        int cont = 0;
        for (int num:v){
            if (num % 2 == 0){ // Se o resto da divisão por 2 for igual a 0 (par), incrementa mais 1 no contador de par
                cont++;
            }
        }
        return cont;
    }

    static int contImpar (int[] v){
        int cont = 0;
        for (int num:v){
            if (num % 2 != 0){ // Se o resto da divisão por 2 for diferente de 0 (impar), incrementa mais 1 no contador de impar
                cont++;
            }
        }
        return cont;
    }

    static int contPositivo (int[] v){ // Função para retornar a quantidade de números positivos
        int cont = 0;
        for (int num:v){
            if (num > 0){
                cont++;
            }
        }
        return cont;
    }

    static int contNegativo (int[] v){ // Função para retornar a quantidade de números negativos
        int cont = 0;
        for (int num:v){
            if (num < 0){
                cont++;
            }
        }
        return cont;
    }

    static int contNeutro (int[] v){ // Função para retornar a quantidade de números neutros (iguais a 0)
        int cont = 0;
        for (int num:v){
            if (num == 0){
                cont++;
            }
        }
        return cont;
    }
}