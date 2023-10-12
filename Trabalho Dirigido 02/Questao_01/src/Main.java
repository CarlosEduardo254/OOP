import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Digite o primeiro número: ");
            double x = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double y = scanner.nextDouble();
            System.out.println("Digite qual operação você quer realizar\n[soma: digite -> +]\n[subtração: digite -> -]\n[multiplicação: digite -> *]\n[dividisão: digite -> /]");
            scanner.nextLine();
            String operation = scanner.nextLine();
            switch (operation) { // Switch case para escolha de cada operação
                case "+" -> soma(x, y);
                case "-" -> subtracao(x, y);
                case "*" -> multipliacao(x, y);
                case "/" -> {
                    if (y == 0) {
                        System.out.println("Valor inválido! Divisão por 0"); // Não existe divisão por 0
                    } else {
                        divisao(x, y);
                    }
                }
                default -> System.out.println("Operador inválido!");
            }
            System.out.println("Deseja sair do programa (1-Sim | 0-Não) ? ");
            int stop = scanner.nextInt(); // Validação para se deseja sair ou não da calculadora

            if (stop == 1) {
                break;
            }
        }
    }


    static void soma(double x, double y) {
        System.out.println(x + y);
    } // Função de soma

    static void subtracao(double x, double y) {
        System.out.println(x - y);
    } // Função de subtração

    static void multipliacao(double x, double y) {
        System.out.println(x * y);
    } // Função de multiplicação

    static void divisao(double x, double y) {
        System.out.println(x / y);
    } // Função de divisão
}