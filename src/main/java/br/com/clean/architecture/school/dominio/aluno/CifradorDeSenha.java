package br.com.clean.architecture.school.dominio.aluno;

public interface CifradorDeSenha {

	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
