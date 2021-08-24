import java.util.Scanner;

public class _11Exercicio1 {
    public static void main(String[] args) {

        System.out.println("Digite sua senha: ");

        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha Inválida");
            System.out.println("Digite novamente:");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
