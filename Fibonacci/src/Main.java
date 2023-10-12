import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para poder receber o limite
        int f1 = 0; // Caso de inicio
        int f2 = 1; // Caso de inicio
        int limit = scanner.nextInt(); // Recebo o limite
        while (f2 < limit) {
            int fn = f1 + f2; // Calculo o próximo valor
            if (fn > limit) // Se esse próximo valor ja for maior que o limite já nem executa o código
                break; // Se for só uma linha de código não precisa do bloco
            System.out.print(fn + " -> ");
            f1 = f2;// Substituição dos valores para os próximos
            f2 = fn;
        }
    }
}