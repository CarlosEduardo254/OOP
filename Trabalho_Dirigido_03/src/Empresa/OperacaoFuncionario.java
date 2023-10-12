package Empresa;


import org.jetbrains.annotations.NotNull;



public class OperacaoFuncionario {
    public static void dadosInvalido (Funcionario[] funcionarios){
        if (funcionarios.length == 0){
            System.out.println("Não existe funcionários para fazer a checagem dos dados");
            return;
        }
        for (Funcionario funcionario : funcionarios){
            if (funcionario.validarCPF() && funcionario.validarNascimento() && funcionario.validarAdmissao()){
                System.out.println("Funcionário válido: " + funcionario);

            } else {
                System.out.println("Funcionário inválido: " + funcionario);
                if (!funcionario.validarCPF()){
                    System.out.println("CPF inválido");
                }
                if (!funcionario.validarNascimento()){
                    System.out.println("Data de nascimento inválida");
                }
                if (!funcionario.validarAdmissao()){
                    System.out.println("Data de admisão inválida");
                }
            }
        }

    }

    public static void contarSexoFuncionario (Funcionario[] funcionarios){
        if (funcionarios.length == 0){
            System.out.println("Não existe funcionários para fazer a contagem dos sexos");
            return;
        }

        int sexoMasculino = 0;
        int sexoFeminino = 0;

        for(Funcionario funcionario : funcionarios){
            if (funcionario.getSexo() == 'M'){
                sexoMasculino++;
            }
            if (funcionario.getSexo() == 'F'){
                sexoFeminino++;
            }
        }

        System.out.println("Número de funcionários do sexo masculino: " + sexoMasculino);
        System.out.println("Número de funcionários do sexo feminino: " + sexoFeminino);
    }

    public static void compararSalario (Funcionario @NotNull [] funcionarios){
        if (funcionarios.length == 0){
            System.out.println("Não existe nenhum funcionário para faazer a comparação de salário");
            return;
        }

        Funcionario maior_salario = funcionarios[0];
        Funcionario menor_salario = funcionarios[0];

        for (Funcionario funcionario:funcionarios){
            if (funcionario.salarioLiquido() > maior_salario.salarioLiquido()){
                maior_salario = funcionario;
            }
            if (funcionario.salarioLiquido() < menor_salario.salarioLiquido()){
                menor_salario = funcionario;
            }
        }
        System.out.println("Funcionário com o maior salário: " + maior_salario);
        System.out.println("Funcionário com o menor salário: " + menor_salario);
    }

    public static void compararIdade (Funcionario[] funcionarios){
        if (funcionarios.length == 0){
            System.out.println("Não existe nenhum funcionário para faazer a comparação de idade");
            return;
        }

        Funcionario maior_idade = funcionarios[0];
        Funcionario menor_idade = funcionarios[0];

        for (Funcionario funcionario:funcionarios){
            if (funcionario.calcularIdade() > maior_idade.calcularIdade()){
                maior_idade = funcionario;
            }
            if (funcionario.calcularIdade() < menor_idade.calcularIdade()){
                menor_idade = funcionario;
            }
        }
        System.out.println("Funcionário com o maior idade: " + maior_idade);
        System.out.println("Funcionário com o menor idade: " + menor_idade);
    }



}
