package questao_5;

public class ColecaoPessoa implements Colecao {

    private Pessoa[] dados = new Pessoa[5];
    int posicaoCorrente = 0;

    @Override
    public boolean inserir(Pessoa p) {
        if (dados != null && posicaoCorrente >= 0) {
            dados[posicaoCorrente] = p;
            posicaoCorrente++;
            return true;
        } else if (posicaoCorrente >= 100) {
            return false;
        }
        return false;
    }


    @Override
    public boolean remover() {
        if (dados == null) {
            return false;
        } else {
            dados[posicaoCorrente] = null;
            posicaoCorrente--;
            return true;
        }
    }

    @Override
    public boolean remover(int i) {
        if (dados == null) {
            return false;
        } else {
            dados[i] = null;
            posicaoCorrente--;
            return true;
        }
    }

    @Override
    public void atualizar(int i, Pessoa p) {
        if (i >= 100 || p == null || i < 0) {
            System.out.println("Indice inválido");
        } else {
            dados[i] = p;
        }
    }

    @Override
    public boolean pesquisar(Pessoa p) {
        if (dados != null) {
            for (Pessoa pessoa : dados) {
                if (pessoa != null && pessoa.equals(p)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean colecaoEstaVazia() {
        for (int i = 0; i < posicaoCorrente; i++) {
            if (dados[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void imprimirDadosColecao() {
        int i = 0;
        if (dados != null) {
            for (Pessoa pessoa : dados) {
                System.out.println("questao_5.Pessoa " + i + "]: " + pessoa);
                i++;
            }
        } else {
            System.out.println("Coleção vazia!");
        }
    }

    @Override
    public Pessoa retornarObjeto(int i) {
        if (dados[i] != null) {
            return dados[i];
        }
        return null;
    }
}
