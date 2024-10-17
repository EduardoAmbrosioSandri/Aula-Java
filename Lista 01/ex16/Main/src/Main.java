import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual temperatura deseja converter: ");
        double temp = sc.nextDouble();

        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");

        double CtF = (temp * 9/5) + 32;
        double FtC = (temp - 32) * 5/9;


        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("De Celsius para Fahrenheit: " + CtF + " Fahrenheit");
                break;

            case 2:
                System.out.println("De Fahrenheit para Celsius: " + FtC + " Celsius");
                break;

            default:
                System.out.println("Opção inválida...");
        }
    }

}