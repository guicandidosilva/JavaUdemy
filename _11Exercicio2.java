import java.util.Scanner;

public class _11Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("Digite a primeira coordenada:");
        x = sc.nextDouble();
        System.out.println("Digite a segunda coordenda:");
        y = sc.nextDouble();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0){
                System.out.println("primeiro");
                System.out.println();
                System.out.println("Digite uma nova primeira coordenada:");
                x = sc.nextDouble();
                System.out.println("Digite uma nova segunda coordenada");
                y = sc.nextDouble();
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
                System.out.println();
                System.out.println("Digite uma nova primeira coordenada:");
                x = sc.nextDouble();
                System.out.println("Digite uma nova segunda coordenada");
                y = sc.nextDouble();
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
                System.out.println();
                System.out.println("Digite uma nova primeira coordenada:");
                x = sc.nextDouble();
                System.out.println("Digite uma nova segunda coordenada");
                y = sc.nextDouble();
            }
            else if (x > 0 && y < 0){
                System.out.println("quarto");
                System.out.println();
                System.out.println("Digite uma nova primeira coordenada:");
                x = sc.nextDouble();
                System.out.println("Digite uma nova segunda coordenada");
                y = sc.nextDouble();
            }
        }

        sc.close();
    }
}
