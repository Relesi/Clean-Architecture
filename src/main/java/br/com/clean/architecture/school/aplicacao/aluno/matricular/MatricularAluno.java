package br.com.clean.architecture.school.aplicacao.aluno.matricular;

import br.com.clean.architecture.school.dominio.aluno.Aluno;
import br.com.clean.architecture.school.dominio.aluno.RepositorioDeAlunos;




public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;

	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}

}
