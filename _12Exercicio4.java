import java.util.Scanner;

public class _12Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double divi = 0;

        for (int i = 0; i<3; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b == 0){
                System.out.println("Divisão impossível");
            }
            else if (b != 0) {
                divi = (a / b);
                System.out.println(divi);
            }
        }



        sc.close();
    }
}
