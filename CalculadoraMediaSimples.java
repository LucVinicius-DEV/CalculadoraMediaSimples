// Este programa calcula a media simples de 2 valores
import java.util.Scanner;

public class CalculadoraMediaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite outro numero: ");
        double num2 = sc.nextDouble();

        double media = (num1 + num2) / 2;

        System.out.println("A media simples de " + num1 + " e " + num2 + " e: " + media);
        System.out.println("Fim do programa!");

        sc.close();
    }
}
