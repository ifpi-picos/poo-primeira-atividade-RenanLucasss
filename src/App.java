import br.edu.ifpi.dominio.Aluno;
import br.edu.ifpi.dominio.Curso;
import br.edu.ifpi.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor("Eduardo");
        Curso c1 = new Curso("ADS", "Superior", 200, p1);
        Aluno a1 = new Aluno("Renan", null);
        Aluno a2 = new Aluno("Renan", null);
        
        System.out.println("Qtd de alunos: " + c1.getQuantidadeDeAlunosMatriculados());
        
        c1.realizarMatricula(a1);
        c1.realizarMatricula(a2);
        
        System.out.println("Qtd alunos: " + c1.getQuantidadeDeAlunosMatriculados());
        
        System.out.println("Nome do curso: " + c1.getNome() + ", professor: " + c1.getNomeProfessor());
    }

        
}