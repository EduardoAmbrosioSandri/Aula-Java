import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite a sua idade:");
        idade = sc.nextInt();

        System.out.println("Seu nome é " + nome + " e sua idede é " + idade);


    }
}