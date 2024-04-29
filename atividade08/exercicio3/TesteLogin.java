import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        Login login = new Login("usuario", "senha");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.next();

        System.out.print("Digite a senha: ");
        String senha = scanner.next();

        try {
            boolean logado = login.fazer_login(usuario, senha);
            if (logado) {
                System.out.println("Login realizado com sucesso!");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login." + e.getMessage());
        }

        scanner.close();
    }
}