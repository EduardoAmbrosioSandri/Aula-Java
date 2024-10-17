import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();
        result = soma(num1, num2);
        System.out.println("A some de " + num1 + " e " + num2 + " é: " + result);



    }
    public static int soma(int a,int b){
        return a + b;
    }
}
