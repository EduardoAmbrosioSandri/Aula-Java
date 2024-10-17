import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:\n");
        int num1 = sc.nextInt();

        System.out.println("Digite um segundo número inteiro:\n");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = (double)num1 / num2;

        System.out.println("Soma" + soma);
        System.out.println("Subtração" + sub);
        System.out.println("Multiplicação" + mult);
        System.out.println("Divisão" + div);

    }


}
