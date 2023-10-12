import java.util.Objects;

public class Lembrete {
    private String descricao;
    private int dia;
    private int mes;
    private int ano;

    public Lembrete() {
    }

    public Lembrete(String descricao, int dia, int mes, int ano) {
        this.descricao = descricao;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lembrete lembrete = (Lembrete) o;
        return dia == lembrete.dia && mes == lembrete.mes && ano == lembrete.ano && Objects.equals(descricao, lembrete.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, dia, mes, ano);
    }


    @Override
    public String toString() {
        return descricao + " - " + dia + " / " + mes + " / " + ano ;
    }

}