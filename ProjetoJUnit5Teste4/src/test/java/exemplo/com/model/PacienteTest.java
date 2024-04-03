package exemplo.com.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PacienteTest {
	private Paciente paciente;
	
	//Mock de Paciente
	@BeforeEach
	public void setUp() {
		paciente = new Paciente(1, "João", 30);
		
	}
	
	@Test
	public void testGetId() {
		assertEquals(1, paciente.getId());
	}
	
	@Test
	public void testeSetId() {
		paciente.setId(2);
		assertEquals(2, paciente.getId());
	}
	
	@Test
	public void testeGetNome() {
		assertEquals("João", paciente.getNome());
	}
	@Test
	public void testSetNome() {
		paciente.setNome("Maria");
		assertEquals("Maria", paciente.getNome());
	}
	@Test
	public void testGetIdade() {
		assertEquals(30, paciente.getIdade());
	}
	
	
	@Test
	public void testSetIdade() {
		paciente.setIdade(40);
		assertEquals(40, paciente.getIdade());
	}

}
