import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2, result = 0, op;
        String esc = "";
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Digite o primeiro numero: ");
            num1 = sc.nextInt();

            System.out.println("Digite o segundo numero: ");
            num2 = sc.nextInt();

            System.out.println("Qual operação deseja realizar? ");

            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            op = sc.nextInt();

            sc.nextLine();

            switch (op) {
                case 1:
                    result = num1 + num2;
                    System.out.println("O resultado da soma de " + num1 + " e " + num2 + " é " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("O resultado da subtração de " + num1 + " e " + num2 + " é " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("O resultado da multiplicação de " + num1 + " e " + num2 + " é " + result);
                    break;

                case 4:
                    result = num1 / num2;
                    System.out.println("O resultado da divisão de " + num1 + " e " + num2 + " é " + result);
                    break;

                default:
                    System.out.println("Operação inválida!");
            }
            System.out.println("Deseja realizar uma nova operação? S - Sim | N - Não");
            esc = sc.nextLine();
        }while (esc.equalsIgnoreCase("S"));

    }
}