package school;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.architecture.school.dominio.aluno.CPF;

public class CPFTest {

	
	
	@Test
	void naoDeveriaCriarCPFComNumerosInvalidos() {
		
		assertThrows(IllegalArgumentException.class, () -> new CPF(null));
		
		assertThrows(IllegalArgumentException.class, () -> new CPF(""));
		
		assertThrows(IllegalArgumentException.class, () -> new CPF("123456789"));
	}
	
	
	@Test
	void deveriaPermitirCriarCPFComNumeroValido() {
		
		String numero = "832.163.880-50";
		CPF cpf = new CPF(numero);
		assertEquals(numero, cpf.getNumero());
	}
	
	
}
