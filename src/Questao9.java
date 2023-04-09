import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // Entrada de dados, declaração de variáveis e Saída de dados fiz tudo junto e
        // misturado
        int grausf;
        System.out.println("Informe os Graus em Fahrenheit: ");
        grausf = teclado.nextInt();
        teclado.close();
        double grausc;
        grausc = 5 * ((grausf - 32) / 9);
        System.out.println("A temperatura está a: " + grausc + "° Celsius");

    }
}
