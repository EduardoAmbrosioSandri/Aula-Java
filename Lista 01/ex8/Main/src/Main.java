import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();

        if (ehPrimo(num1)){
            System.out.println(num1 + " é um número primo.");
        }
        else {
            System.out.println(num1 + " não é um número primo.");
        }
    }
    public  static boolean ehPrimo(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}