import java.util.Scanner;

public class _8Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double imposto;
        double v1 = 8.00;
        double v2 = 18.00;
        double v3 = 28.00;


        System.out.println("        RENDA                     IMPOSTO DE RENDA");
        System.out.println("0,00 a R$ 2000,00                      Isento");
        System.out.println("R$ 2000,01 até R$ 3000,00                8%");
        System.out.println("R$ 3000,01 até R$ 4500,00                18%");
        System.out.println("acima de R$ 4500,00                      28%");

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();

        if (salario <= 2000.00){
            System.out.println("Está ISENTO de Imposto de Renda");
        }
        else if (salario > 2000.00 && salario <= 3000.00){
            imposto = (salario - 2000.00) * (v1 / 100);
            System.out.printf("Pagará R$ %.2f%n", imposto);
        }
        else if (salario > 3000.00 && salario <= 4500.00){
            imposto = ((1000.00 * (v1 / 100)) + ((salario - 3000.00) * (v2 / 100)));
            System.out.printf("Pagará R$ %.2f%n", imposto);
        }
        else if (salario > 4500.00){
            imposto = (1000.00 * (v1 / 100)) +
                      (1500 * (v2 / 100)) +
                      ((salario - 4500.00) * (v3 / 100));
            System.out.printf("Pagará R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
