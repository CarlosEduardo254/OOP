import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "a76dk09";
        int validSenha = 0; //Variável para validação da senha

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        while (validSenha == 0){ // Loop  de validação da senha
            if (senhaCorreta.equals(senha)){
                System.out.println("ACESSO PERMITIDO");
                validSenha = 1;
            } else {
                System.out.println("SENHA INVÁLIDA");
                System.out.print("Digite novamente a senha: ");
                senha = scanner.nextLine();
            }
        }


    }
}