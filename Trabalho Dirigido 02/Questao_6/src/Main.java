import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempoDormir;
//      H1 -> Hora atual
//      M1 -> Minuto atual
//      H2 -> Hora do alarme
//      M2 -> Minuto do alarme

        System.out.println("Digite o horário atual: ");

        System.out.print("Horas: ");
        int H1 = scanner.nextInt();
        while (H1 < 0 || H1 > 24) { //Validação da Hora
            System.out.println("Hora inválida! Digite uma hora válida");
            H1 = scanner.nextInt();
        }

        System.out.print("Minutos: ");
        int M1 = scanner.nextInt();
        while (M1 < 0 || M1 > 60) { //Validação dos Minutos
            System.out.println("Hora inválida! Digite uma hora válida");
            M1 = scanner.nextInt();
        }
        System.out.println("O horário atual é: " + H1 + ":" + M1);


        System.out.println("Digite o horário para despertar: ");

        System.out.print("Horas: ");
        int H2 = scanner.nextInt();
        while (H2 < 0 || H2 > 24) { //Validação da Hora
            System.out.println("Hora inválida! Digite uma hora válida");
            H2 = scanner.nextInt();
        }

        System.out.print("Minutos: ");
        int M2 = scanner.nextInt();
        while (M2 < 0 || M2 > 60) { //Validação dos Minutos
            System.out.println("Hora inválida! Digite uma hora válida");
            M2 = scanner.nextInt();
        }
        System.out.println("O horário para despertar é: " + H2 + ":" + M2);


        if ((H1 * 60 + M1) <= (H2 * 60 + M2)) {
            tempoDormir = H2 * 60 + M2 - (H1 * 60 + M1);              // Caso seja dias iguais basta diminuir os horários
        } else {
            tempoDormir = (24 * 60 - (H1 * 60 + M1)) + (H2 * 60 + M2);// Caso seja dias diferentes devo pegar o tempo entre um dia e o outro e somar, ou seja,
        }                                                             // subtraio de 24 horas o horário atual e somo ao horário do alarme.



        System.out.println("O tempo total de sono que você terá será de " + tempoDormir + " minutos.");
    }
}