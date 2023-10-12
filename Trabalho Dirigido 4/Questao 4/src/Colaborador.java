import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Colaborador {
    private String cpf;
    private String nome;
    private char sexo;
    private double salario_bruto;
    private GregorianCalendar data_admissao;


    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getSalario_bruto() {
        return salario_bruto;
    }

    public String getData_admissao() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(data_admissao.getTime());
    }

    public void setCpf(String cpf) {
        if(validar_cpf()){
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setSalario_bruto(double salario_bruto) {
        this.salario_bruto = salario_bruto;
    }

    public void setData_admissao(GregorianCalendar data_admissao) {
        this.data_admissao = data_admissao;
    }

    public boolean validar_cpf(){
        return this.cpf.length() == 14;
    }

    public boolean validar_admissao(){
        GregorianCalendar limiteAdmissao = new GregorianCalendar(1990, Calendar.JANUARY, 1);
        return this.data_admissao.after(limiteAdmissao);
    }

    public boolean maior_tempo_empregado(Colaborador c){
        return !this.data_admissao.after(c.data_admissao);
    }

    @Override
    public String toString() {
        return "Colaborador[" +
                "cpf: '" + cpf + "'|" +
                " nome: '" + nome + "'|" +
                " sexo: " + sexo + " |" +
                " salario_bruto: " + salario_bruto + " |" +
                " data_admissao: " + data_admissao +
                ']';
    }
}
