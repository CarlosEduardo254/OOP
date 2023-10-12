package questao_5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.Objects;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private GregorianCalendar dataCriacao;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String cnpj, GregorianCalendar dataCriacao) {
        setNome(nome);
        setCnpj(cnpj);
        setDataCriacao(dataCriacao);
    }


    public String getCnpj() {
        return cnpj;
    }

    public GregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setDataCriacao(GregorianCalendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean validarDocumento() {
        return this.cnpj != null && this.cnpj.length() == 18;
    }

    @Override
    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        GregorianCalendar dataCriacao = getDataCriacao();

        if (dataCriacao != null) {
            LocalDate criacao = dataCriacao.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Period periodo = Period.between(criacao, hoje);
            return periodo.getYears();
        } else {
            // Trate o caso em que a data de nascimento seja nula ou inválida.
            return -1; // Ou outro valor que indique que a data é inválida.
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataCriacaoFormatada = dateFormat.format(dataCriacao.getTime());

        return "questao_5.PessoaJuridica[" +
                "nome: " + getNome() + " | " +
                "cnpj: '" + cnpj + "' | " +
                "dataCriacao=" + dataCriacaoFormatada +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }


}
