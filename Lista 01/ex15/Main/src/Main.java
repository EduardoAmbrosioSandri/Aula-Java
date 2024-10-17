import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int num1 = sc.nextInt();

        System.out.println("Escolha o método para calcular o fatorial:");
        System.out.println("1 - Iterativo");
        System.out.println("2 - Recursivo");
        System.out.print("Opção: ");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println("Fatorial (Iterativo) de " + num1 + " é: " + fatorialIterativo(num1));
        } else if (op == 2) {
            System.out.println("Fatorial (Recursivo) de " + num1 + " é: " + fatorialRecursivo(num1));
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }

    public static int fatorialIterativo(int n) {
        int fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int fatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorialRecursivo(n - 1);
        }
    }
}
