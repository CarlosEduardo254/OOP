package questao_5;

public abstract class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract boolean validarDocumento();

    public abstract int calcularIdade();

    @Override
    public String toString() {
        return "questao_5.Pessoa[" + "nome: " + nome + ']';
    }


}
