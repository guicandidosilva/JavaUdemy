import java.util.Scanner;

public class _8Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite um número:");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Seu número é negativo!");
        }
        else {
            System.out.println("Seu núemro não é negativo");
        }
        sc.close();
    }
}
