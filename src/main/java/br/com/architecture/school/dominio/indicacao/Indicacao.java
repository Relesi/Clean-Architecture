package br.com.architecture.school.dominio.indicacao;

import java.time.LocalDateTime;

import br.com.architecture.school.dominio.aluno.Aluno;

public class Indicacao {
	
	private Aluno indicado;
	private Aluno indicante;
	private LocalDateTime localDateTime;
	
	
	public Indicacao(Aluno indicado, Aluno indicante) {
		this.indicado = indicado;
		this.indicante = indicante;
		this.localDateTime = LocalDateTime.now();
	}


	public Aluno getIndicado() {
		return indicado;
	}


	public Aluno getIndicante() {
		return indicante;
	}


	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}


	
	
}
