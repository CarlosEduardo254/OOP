import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int contPar = 0;
        String direito = "D";
        String esquerdo = "E";
        Bota[] botas = new Bota[10000];

        System.out.print("Insira o número de botas  a ser registradas \n[Observações: deve ser um número par e deve estar entre 2 e 10000]\nNúmero de casos: ");
        N = scanner.nextInt();

        while (N % 2 != 0 || (N < 2 || N > 10000)){
            if (N % 2 != 0) {
                System.out.println("Digite um número par: ");
                N = scanner.nextInt();
            }
            if (N < 2 || N > 10000) {
                System.out.println("Digite um número entre 2 e 10000: ");
                N = scanner.nextInt();
            }
        }


        for (int i = 0; i < N; i++) {
            int auxM;
            String auxL;

            System.out.print("Digite o tamanho da bota " + (i + 1) + " [entre 30 e 60]:");
            auxM = scanner.nextInt();
            scanner.nextLine();

            while(auxM<30 || auxM>60 ){
                System.out.println("Digite um tamanho válido");
                auxM = scanner.nextInt();
                scanner.nextLine();
            }


            System.out.print("Digite o pé da bota " + (i + 1) + " [D - Direito | E - Esquerdo]:");
            auxL = scanner.nextLine();

            while (true) {
                if (auxL.equals(direito) || auxL.equals(esquerdo)) {
                    break;
                }
                System.out.print("Digite um valor válido para o pé (D - Direito | E - Esquerdo):");
                auxL = scanner.nextLine();
            }
            botas[i] = new Bota(auxM, auxL);


        }


        for (int i = 0; i < N; i++) {
            for (int j = 1 + i; j < N; j++) {
                if (botas[i].getM() == botas[j].getM()) {
                    if (!(botas[i].getL().equals(botas[j].getL()))) {
                        contPar++;
                    }
                }
            }
        }

        System.out.println("Número de pares: " + contPar);


    }


}