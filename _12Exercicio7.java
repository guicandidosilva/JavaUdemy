import java.util.Scanner;

public class _12Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if (n > 0) {
                System.out.println(i + " " + (i * i)  + " " + (i * i * i));
            }
        }

        sc.close();
    }
}