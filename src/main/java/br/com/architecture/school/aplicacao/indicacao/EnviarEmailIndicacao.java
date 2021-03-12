package br.com.architecture.school.aplicacao.indicacao;

import br.com.architecture.school.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

	void enviarPara(Aluno indicado);
}
