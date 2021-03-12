package br.com.architecture.school.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.architecture.school.dominio.aluno.Aluno;
import br.com.architecture.school.dominio.aluno.AlunoNaoEncontrado;
import br.com.architecture.school.dominio.aluno.CPF;
import br.com.architecture.school.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunoEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);

	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return this.matriculados.stream()
				.filter(a -> a.getCpf().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
