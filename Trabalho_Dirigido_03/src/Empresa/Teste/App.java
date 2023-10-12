package Empresa.Teste;

import Empresa.Funcionario;
import Empresa.OperacaoFuncionario;

import java.util.*;

public class App {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número de funcionários a cadastrar: ");
            int numeroFuncionarios = scanner.nextInt();

            Funcionario[] funcionario = new Funcionario[numeroFuncionarios];


            while (true){
                int opcao = 0;
                System.out.println("O que você quer fazer: \n[1] - Inserir funcionário \n[2] - Fazer checagem dos funcinários\n[3] - Sair do programa");
                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 1){
                    for(int i = 0; i < numeroFuncionarios; i++) {
                        System.out.println("Inserindo os dados do funcionário " + (i+1));
                        System.out.print("Insira o CPF do/a funcionário/a [Exemplo: 111.111.111-11]: ");
                        String cpf = scanner.nextLine(); // Deixarei sem condicionais para poder testar o OperacaoFuncionario

                        System.out.print("Insira o nome do/a funcionario/a: ");
                        String nome = scanner.nextLine();

                        System.out.println("Insira o sexo do/a funcionario/a:\n[M] - Masculino\n[F] - Feminino");
                        char sexo = scanner.next().trim().charAt(0);
                        while (!(sexo == 'M' || sexo == 'F')) {
                            System.out.println("Entrada erra, digite novamente:\n[M] - Masculino\n[F] - Feminino");
                            sexo = scanner.next().trim().charAt(0);
                        }

                        System.out.print("Digite o salário bruto do/a funcionario/a: ");
                        double salario = scanner.nextDouble();

                        System.out.println("Digite a data de nascimento do/a funcionario/a: ");
                        System.out.print("Ano:");
                        int anoNasc = scanner.nextInt();

                        System.out.print("Mês [0 - 11]:");
                        int mesNasc = scanner.nextInt();
                        while (mesNasc < 0 || mesNasc > 12) {
                            System.out.print("Mês inválido, digite novamente: ");
                            mesNasc = scanner.nextInt();
                        }

                        System.out.print("Dia [1 - 31]:");
                        int diaNasc = scanner.nextInt();
                        while (diaNasc < 0 || diaNasc > 32) {
                            System.out.print("Dia inválido, digite novamente: ");
                            diaNasc = scanner.nextInt();
                        }

                        System.out.println("Digite a data de admissão do/a funcionario/a: ");

                        System.out.print("Ano:");
                        int anoAdm = scanner.nextInt();

                        System.out.print("Mês [0 - 11]:");
                        int mesAdm = scanner.nextInt();
                        while (!(mesAdm > 0 && mesAdm < 12)) {
                            System.out.print("Mês inválido, digite novamente: ");
                            mesAdm = scanner.nextInt();
                        }

                        System.out.print("Dia [1 - 31]:");
                        int diaAdm = scanner.nextInt();
                        scanner.nextLine();
                        while (!(diaAdm > 0 && diaAdm < 32)) {
                            System.out.print("Dia inválido, digite novamente: ");
                            diaAdm = scanner.nextInt();
                            scanner.nextLine();
                        }

                        funcionario[i] = new Funcionario(cpf, nome, sexo, salario, new GregorianCalendar(anoNasc, mesNasc, diaNasc), new GregorianCalendar(anoAdm, mesAdm, diaAdm));
                    }
                }

                else if (opcao == 2){          // Ocorre um bug se escolher a opção 2 primeiro, sem inserir os dados dos funcionários
                    if (funcionario != null) { // tentei fazer essa verificação mas o bug persistiu
                        OperacaoFuncionario.dadosInvalido(funcionario);
                        OperacaoFuncionario.contarSexoFuncionario(funcionario);
                        OperacaoFuncionario.compararSalario(funcionario);
                        OperacaoFuncionario.compararIdade(funcionario);
                    } else {
                        System.out.println("O array de funcionários está nulo. Certifique-se de inicializá-lo corretamente.");
                    }

                }

                else if (opcao == 3){
                    break;
                }

                else {
                    System.out.println("O número digitado é inválido, digite um número válido: ");
                    System.out.println("\n");
                }
            }
        }



}



