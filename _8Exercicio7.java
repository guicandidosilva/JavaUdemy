import java.util.Scanner;

public class _8Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque a primeira coordenda:");
        double x = sc.nextDouble();
        System.out.println("Coloque a segunda coordenada:");
        double y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Coordenadas estão no Quadrante 1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Coordenadas estão no Quadrante 2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Coordenadas estão no Quadrante 3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Coordenadas estão no Quadrante 4");
        }
        else {
            System.out.println("Origem");
        }

        sc.close();
    }
}
