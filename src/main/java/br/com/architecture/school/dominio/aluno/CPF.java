package br.com.architecture.school.dominio.aluno;

public class CPF {

	private String numero;

	public CPF(String numero) {
		if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("CPF inv�lido");

		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

}