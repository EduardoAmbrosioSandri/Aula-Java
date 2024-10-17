public class Main {
    public static void main(String[] args) {
    Cachorro meuCachorro = new Cachorro("Babi", "YorkShire Terrier", 1);

    System.out.println("Nome: " + meuCachorro.getNome());
    System.out.println("Raca: " + meuCachorro.getRaca());
    System.out.println("Idade: " + meuCachorro.getIdade());

    meuCachorro.latir();
    meuCachorro.correr();
    }
}