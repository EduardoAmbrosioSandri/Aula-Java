public class Main {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("Harry Potter", "J. K. Rowling", 455);

        System.out.println("Título: " + meuLivro.getTitulo());
        System.out.println("Autor: " + meuLivro.getAutor());
        System.out.println("Número de Páginas: " + meuLivro.getNumeroDePaginas());

        meuLivro.abrir();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
    }
}