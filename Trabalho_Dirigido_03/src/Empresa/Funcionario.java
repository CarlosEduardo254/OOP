package Empresa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;


@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class Funcionario {
    private String cpf;
    private String nome;
    private char sexo;
    private double salario_Bruto;
    private GregorianCalendar data_Nascimento;
    private GregorianCalendar data_Admissao;

    public Funcionario() {
        this.data_Admissao = new GregorianCalendar();
    }

    public Funcionario(String cpf, String nome, GregorianCalendar data_Admissao) {
        this.cpf = cpf;
        this.nome = nome;
        this.data_Admissao = data_Admissao;
    }

    public Funcionario(String cpf, String nome, char sexo, double salario_Bruto, GregorianCalendar data_Nascimento, GregorianCalendar data_Admissao) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.salario_Bruto = salario_Bruto;
        this.data_Nascimento = data_Nascimento;
        this.data_Admissao = data_Admissao;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getSalario_Bruto() {
        return salario_Bruto;
    }

    public String getData_Nascimento() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(data_Nascimento.getTime());
    }

    public String getData_Admissao() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(data_Admissao.getTime());
    }

    public boolean validarCPF() {
        return cpf != null && cpf.length() == 14;
    }

    public boolean validarNascimento() {
        GregorianCalendar limiteNascimento = new GregorianCalendar(1920, Calendar.JANUARY, 1);
        return (data_Nascimento != null) && (data_Nascimento.after(limiteNascimento));
    }

    public boolean validarAdmissao() {
        GregorianCalendar limiteAdmissao = new GregorianCalendar(1995, Calendar.JANUARY, 1);
        return (data_Admissao != null) && (data_Admissao.after(limiteAdmissao));
    }

    public int calcularIdade() {
        if (data_Nascimento != null) {
            GregorianCalendar anoHoje = new GregorianCalendar();
            int anoNascimento = data_Nascimento.get(Calendar.YEAR);
            int anoAtual = anoHoje.get(Calendar.YEAR);
            return anoAtual - anoNascimento;
        } else {
            return 0;
        }
    }

    public double salarioLiquido() {
        if (salario_Bruto <= 3000) {
            return salario_Bruto * 0.83; // -17%
        } else if (salario_Bruto > 3000) {
            return salario_Bruto * 0.73; // -27%
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return sexo == that.sexo && Objects.equals(cpf, that.cpf) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, sexo);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(data_Admissao.getTime());

        return "Funcionario {" +
                "cpf = " + cpf + " | " +
                "nome = " + nome + " | " +
                "sexo = " + sexo + " | " +
                "salario_Bruto = " + salario_Bruto + " | " +
                "data_Nascimento = " + dateFormat.format(data_Nascimento.getTime()) + " | " +
                "data_Admissao = " + dateFormat.format(data_Admissao.getTime()) +
                '}';
    }
}
