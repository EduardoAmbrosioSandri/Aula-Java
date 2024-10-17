public class Main {
    public static void main(String[] args) {
    LivroDigital livro = new LivroDigital("Como fazer amigos e influenciar pessoas", "Dale Carnegie", "800mb");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Tamanho Arquivo: " + livro.getTamanhoArquivo());

    livro.abrir();
    livro.fechar();
    }
}