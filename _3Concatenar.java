public class _3Concatenar {
    public static void main(String[] args) {

        double x = 56.56897;
        System.out.println("Resultado = " + x + " metros");


        //Concatenar vários elementos em um mesmo comando
        System.out.printf("Resultado = %.2f metros%n", x);

        //  %f = ponto flutuante
        //  %d = inteiro
        //  %s = texto
        //  %n = quebra de linha

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
