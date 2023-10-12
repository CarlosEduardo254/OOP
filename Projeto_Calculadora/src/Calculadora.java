import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Digite qual operação você quer realizar (soma, subtrair, multiplicar ou dividir): ");
            scanner.nextLine();
            String operation = scanner.nextLine();
            System.out.println("Digite o primeiro número: ");
            double x = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            double y = scanner.nextDouble();
            switch (operation) {
                case "soma" -> soma(x, y);
                case "subtrair" -> subtracao(x, y);
                case "multiplicar" -> multipliacao(x, y);
                case "dividir" -> {
                    if (y == 0) {
                        System.out.println("Valor inválido! Divisão por 0");
                    } else {
                        divisao(x, y);
                    }
                }
                default -> System.out.println("Insira uma operação válida");
            }
            System.out.println("Deseja sair do programa (1-Sim | 0-Não) ? ");
            int stop = scanner.nextInt();

            if(stop == 1){
                break;
            }
        }
    }

    static void soma(double x, double y) {
        System.out.println(x + y);
    }

    static void subtracao(double x, double y) {
        System.out.println(x - y);
    }

    static void multipliacao(double x, double y) {
        System.out.println(x * y);
    }

    static void divisao(double x, double y) {
        System.out.println(x / y);
    }
}
