import java.util.Scanner;

public class _11Exercicio3 {
    public static void main(String[] args) {

        System.out.println("CODIGO    COMBUSTIVEL");
        System.out.println("1.        Álcool");
        System.out.println("2.        Gasolina");
        System.out.println("3.        Diesel");
        System.out.println("4.        Fim");
        System.out.println();
        System.out.println("Escolha o combustível:");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma1 = 0, soma2 = 0, soma3 = 0;

        while (x != 4){
            if (x == 1){
                soma1 += x;
                System.out.println();
                System.out.println("Digite um novo código:");
                x = sc.nextInt();
                System.out.println();
            }
            else if (x == 2){
                soma2 += x;
                System.out.println("Digite um novo código:");
                x = sc.nextInt();
                System.out.println();
            }
            else if (x == 3){
                soma3 += x;
                System.out.println("Digite um novo código:");
                x = sc.nextInt();
                System.out.println();
            }
            else if (x > 4){
                System.out.println("Digite um novo código");
                x = sc.nextInt();
                System.out.println();
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + soma1);
        System.out.println("Gasolina: " + soma2);
        System.out.println("Diesel: " + soma3);


        sc.close();
    }
}
