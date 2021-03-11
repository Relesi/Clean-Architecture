package br.com.architecture.school.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {

	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlunosMatriculados();
}
