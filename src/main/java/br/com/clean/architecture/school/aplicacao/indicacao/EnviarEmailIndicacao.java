package br.com.clean.architecture.school.aplicacao.indicacao;

import br.com.clean.architecture.school.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

	void enviarPara(Aluno indicado);
}
