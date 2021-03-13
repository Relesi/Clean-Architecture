package br.com.architecture.school.aplicacao.aluno.matricular;

import br.com.architecture.school.dominio.aluno.Aluno;
import br.com.architecture.school.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

	private final RepositorioDeAlunos repositorio;

	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}

	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}

}
