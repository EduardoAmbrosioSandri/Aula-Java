public class Main {
    public static void main(String[] args) {
    Pessoa minhaPessoa = new Pessoa("Eduardo", 18, 179);

    System.out.println("Nome: " + minhaPessoa.getNome());
    System.out.println("Idade: " + minhaPessoa.getIdade());
    System.out.println("Altura: " + minhaPessoa.getAltura());

    minhaPessoa.apresentacao();
    }
}