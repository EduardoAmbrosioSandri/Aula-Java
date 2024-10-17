public class Main {
    public static void main(String[] args) {
    Aluno aluno = new Aluno("Eduardo", 84862 , "Análise e Desenvolvimento de Sistemas", 7);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());

        System.out.println("Média do Aluno: " + aluno.getMedia());
    }
}