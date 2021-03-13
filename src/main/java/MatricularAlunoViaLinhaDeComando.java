import br.com.architecture.school.aplicacao.aluno.matricular.MatricularAluno;
import br.com.architecture.school.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.architecture.school.infra.aluno.RepositorioDeAlunoEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano de tal ";
		String cpf = "123.456.789-10";
		String email = "fulano.tal@email.com";
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunoEmMemoria());
		matricular.executa(new MatricularAlunoDto(nome, cpf, email));
	}

}
