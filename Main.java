import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Login");
            System.out.println("3 - Cadastrar tarefa");
            System.out.println("4 - Relatório");
            System.out.println("5 - Listar usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n=== Cadastro de Usuário ===");

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    Usuario novoUsuario =
                            new Usuario(nome, email, senha);

                    usuarios.add(novoUsuario);

                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 2:

    System.out.println("\n=== Login ===");

    System.out.print("Email: ");
    String emailLogin = sc.nextLine();

    System.out.print("Senha: ");
    String senhaLogin = sc.nextLine();

    boolean loginRealizado = false;

    for (Usuario u : usuarios) {

        if (u.getEmail().equals(emailLogin)
                && u.getSenha().equals(senhaLogin)) {

            loginRealizado = true;
            break;
        }
    }

    if (loginRealizado) {
        System.out.println("Login realizado com sucesso!");
    } else {
        System.out.println("Email ou senha inválidos!");
    }

    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}