package br.com.architecture.school.infra.aluno;

import java.util.List;

import br.com.architecture.school.dominio.aluno.Aluno;
import br.com.architecture.school.dominio.aluno.CPF;
import br.com.architecture.school.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunoEmMemoria implements RepositorioDeAlunos {

	@Override
	public void matricular(Aluno aluno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
