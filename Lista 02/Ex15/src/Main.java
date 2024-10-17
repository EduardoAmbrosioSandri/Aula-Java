public class Main {
    public static void main(String[] args) {
    Loja loja = new Loja("Lider", "Rua 5 de Julho", 44979947);

        System.out.println("Nome: " + loja.getNome());
        System.out.println("Endereço: " + loja.getEndereco());
        System.out.println("Telefone: " + loja.getTelefone());

    loja.abrir();
    loja.fechar();
    }
}