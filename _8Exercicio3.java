import java.util.Scanner;

public class _8Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        if ( a > b) {
            if (a % b == 0) {
                System.out.println("São Multiplos");
            }
            else {
                System.out.println("Não sãi Multiplos");
            }
        }
        else if (b > a) {
            if (b % a == 0) {
                System.out.println("São Multiplos");
            }
            else {
                System.out.println("Não são Multiplos");
            }
        }
        sc.close();
    }
}
