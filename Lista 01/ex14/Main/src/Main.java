import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = sc.nextLine();

        int contadorVogais = contarVogais(input);

        System.out.println("Número de vogais na palavra: " + contadorVogais);

        sc.close();
    }

    public static int contarVogais(String str) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vogais.indexOf(str.charAt(i)) != -1) {
                contador++;
            }
        }

        return contador;
    }
}