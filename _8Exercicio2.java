import java.util.Scanner;

public class _8Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        if (n %2==0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
