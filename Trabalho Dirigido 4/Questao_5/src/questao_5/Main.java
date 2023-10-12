package questao_5;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar data1 = new GregorianCalendar(2004, Calendar.MAY, 2);
        GregorianCalendar data2 = new GregorianCalendar(2010, Calendar.DECEMBER, 20);
        GregorianCalendar data3 = new GregorianCalendar(1997, Calendar.JULY, 25);
        ColecaoPessoa colecao = new ColecaoPessoa();

        System.out.println("Verificando se a coleção esta vazia: " + colecao.colecaoEstaVazia());

        Pessoa pessoa1 = new PessoaFisica("Carlos", "069.443.643-79", data1);
        Pessoa pessoa2 = new PessoaJuridica("John", "123456789123456789", data2);
        Pessoa pessoa3 = new PessoaFisica("Peter", "123456789", data3);


        System.out.println("Idade da pessoa 1: " + pessoa1.calcularIdade());
        System.out.println("Idade da pessoa 2: " + pessoa2.calcularIdade());
        System.out.println("Idade da pessoa 3: " + pessoa3.calcularIdade());

        System.out.println("Documento da pessoa 1 é valido: " + pessoa1.validarDocumento());
        System.out.println("Documento da pessoa 2 é valido: " + pessoa2.validarDocumento());
        System.out.println("Documento da pessoa 3 é valido: " + pessoa3.validarDocumento());

        System.out.println("Inserindo a primeira pessoa: " + colecao.inserir(pessoa1));
        System.out.println("Inserindo a segunda pessoa: " + colecao.inserir(pessoa2));


        System.out.println(" DADOS DA COLEÇÃO ");
        colecao.imprimirDadosColecao();

        System.out.println("Atualizando a primeira posição: ");
        colecao.atualizar(1, pessoa3);

        System.out.println(" DADOS DA COLEÇÃO ");
        colecao.imprimirDadosColecao();

        System.out.println("Pesquisando pessoa: " + colecao.pesquisar(pessoa2));
        System.out.println("Removendo pessoa: " + colecao.remover(1));
        Pessoa teste_retorno = colecao.retornarObjeto(0);
        System.out.print(teste_retorno);


        System.out.println(" DADOS DA COLEÇÃO ");
        colecao.imprimirDadosColecao();


    }
}