public class OperacaoColaborador {

    public static void checagem_dados(Colaborador[] colaboradores){
        if(colaboradores.length == 0){
            System.out.println("Não existe colaboradores para que possa ser feita a checagem");
            return;
        }
        for(Colaborador colaborador : colaboradores){
            if(colaborador.validar_cpf() && colaborador.validar_admissao()){
                System.out.println("Colaborador válido: " + colaborador);
            } else {
                System.out.println("Colaboador inválido: " + colaborador);
            }
        }
    }

    public static void busca_cpf(Colaborador[] colaboradores, String cpf_procurado){
        if(colaboradores.length == 0){
            System.out.println("Não existe colaboradores para que possa ser feita a checagem");
            return;
        }
        if(cpf_procurado.length() != 14){
            System.out.println("CPF de tamanho inválido!");
            return;
        }
        for (Colaborador colaborador:colaboradores){
            if(colaborador.getCpf().equals(cpf_procurado)){
                System.out.println("Colaborador encontrado: " + colaborador);
            }
        }
    }

    public static void funcionarioMaisAntigo(Colaborador[] colaboradores){
        if(colaboradores.length == 0){
            System.out.println("Não existe colaboradores para que possa ser feita a checagem");
            return;
        }
        Colaborador maisAntigo = colaboradores[0];

        for (Colaborador colaborador:colaboradores){
            if(!(maisAntigo.maior_tempo_empregado(colaborador))){
                maisAntigo = colaborador;
            }
        }

        System.out.println("Colaborado com maior tempo empregado: " + maisAntigo);
    }

}
