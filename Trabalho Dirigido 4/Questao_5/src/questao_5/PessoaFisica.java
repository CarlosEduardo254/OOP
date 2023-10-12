package questao_5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.Objects;


public class PessoaFisica extends Pessoa {

    private String cpf;
    private GregorianCalendar dataNascimento;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf, GregorianCalendar dataNascimento) {
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public GregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(GregorianCalendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    @Override
    public boolean validarDocumento() {
        return this.cpf != null && this.cpf.length() == 14;
    }

    @Override
    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        GregorianCalendar dataNascimento = getDataNascimento();

        if (dataNascimento != null) {
            LocalDate nascimento = dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Period periodo = Period.between(nascimento, hoje);
            return periodo.getYears();
        } else {
            // Trate o caso em que a data de nascimento seja nula ou inválida.
            return -1; // Ou outro valor que indique que a data é inválida.
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataNascimentoFormatada = dateFormat.format(dataNascimento.getTime());

        return "questao_5.PessoaFisica[" + "nome: " + getNome() + " | " +
                "cpf: '" + cpf + "' | " +
                "dataNascimento: " + dataNascimentoFormatada +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
