public class Main {
    public static void main(String[] args) {
    Cozinha cozinha = new Cozinha("Restaurante", 150, "Verde");

        System.out.println("Tipo: " + cozinha.getTipo());
        System.out.println("Quantidade de pessoas: " + cozinha.getQntdPessoas());
        System.out.println("Cor: " + cozinha.getCor());

    cozinha.cozinhar();
    cozinha.limpar();
    }
}