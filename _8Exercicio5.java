import java.sql.SQLOutput;
import java.util.Scanner;

public class _8Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double precoTotal;

        System.out.println("CODIGO      ESPECIFICAÇÃO        PREÇO");
        System.out.println("1           Cachorro Quente      R$ 4,00");
        System.out.println("2           X-Salada             R$ 4,50");
        System.out.println("3           X-Bacon              R$ 5,00");
        System.out.println("4           Torrada simples      R$ 2,00");
        System.out.println("5           Refrigerante         R$ 1,50");
        System.out.println();
        System.out.println("Escolha um dos itens: ");
        int codigo = sc.nextInt();
        System.out.println("Quantos desse item pretende comprar?");
        int qtde = sc.nextInt();

        if (codigo == 1) {
            precoTotal = qtde * 4.00;
            System.out.printf("Total: R$ %.2f%n", precoTotal);
        }
        else if (codigo == 2){
            precoTotal = qtde * 4.50;
            System.out.printf("Total: R$ %.2f%n", precoTotal);
        }
        else if (codigo == 3) {
            precoTotal = qtde * 5.00;
            System.out.printf("Total: R$ %.2f%n", precoTotal);
        }
        else if (codigo == 4){
            precoTotal = qtde * 2.00;
            System.out.printf("Total: R$ %.2f%n", precoTotal);
        }
        else if (codigo == 5){
            precoTotal = qtde * 1.50;
            System.out.printf("Total: R$ %.2f%n", precoTotal);
        }
        else {
            System.out.println("Este código não existe no menu!");
        }

        sc.close();
    }
}
