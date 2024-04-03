package exemplo.com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exemplo.com.Service.PacienteService;
import exemplo.com.model.Paciente;



public class PacienteServiceIntegrationTest {

	private PacienteService pacienteService;

	
	private static int testContador = 0;
	private static int passContador = 0;

	@BeforeAll
	public static void testMenu() {
		System.out.println("************************");
		System.out.println("*    Testes Inciados   *");
		System.out.println("************************");
	}

	@BeforeEach
	public void setUp() {
		pacienteService = new PacienteService();
		System.out.print(++testContador + "º Teste Iniciado...");
	}

	// Excluir o MOCK
	@AfterEach
	public void tearDown() {
		pacienteService = null;
		++testContador;
		System.out.println("Pass");
	}

	@AfterAll
	public static void testRelatorio() {
		System.out.println("********************************");
		System.out.println("Total de Testes = " + testContador);
		System.out.println("Sucessos = " + passContador);
		System.out.println("Falhas = " + (testContador - passContador));
		float porcentagem = ((float) passContador / testContador) * 100;
		System.out.println("Porcentagem = " + porcentagem + "%");
		System.out.println("********************************");
	}

	// Adicionando o paciente
	@Order(1)
	@Test
	public void CRUDPaciente() {
		Paciente paciente1 = new Paciente(1, "João", 30);

		pacienteService.adicionarPaciente(paciente1);

		// Buscar por id
		Paciente pacienteBusca = pacienteService.buscarPacientePorId(1);

		assertEquals(paciente1, pacienteBusca);

		// Listar pacientes
		List<Paciente> pacientes = pacienteService.listarPacientes();
		assertEquals(1, pacientes.size());

		paciente1.setNome("Maria");
		paciente1.setIdade(40);
		pacienteService.atualizarPaciente(paciente1);
		Paciente pacienteAtualizado = pacienteService.buscarPacientePorId(1);
		assertEquals("Maria", pacienteAtualizado.getNome());
		assertEquals(40, pacienteAtualizado.getIdade());

		// Excluir paciente
		pacienteService.excluirPaciente(1);
		Paciente pacienteExcluido = pacienteService.buscarPacientePorId(1);
		assertNull(pacienteExcluido);
		++passContador;
	}

	@ParameterizedTest
	@Order(2)
	@CsvSource({ "1, João, 30, Maria, 40", "2, Maria,40, Ana, 22", "3, Ana, 22, Pedro, 18" })

	public void testeAtualizarPaciente(int id, String nomeAntigo, int idadeAntiga, String nomeNovo, int idadeNova) {
		// Adicionar paciente

		Paciente paciente = new Paciente(id, nomeAntigo, idadeAntiga);
		pacienteService.adicionarPaciente(paciente);

		// Atualizar Paciente
		paciente.setNome(nomeNovo);
		paciente.setIdade(idadeNova);
		pacienteService.atualizarPaciente(paciente);

		// Buscar Paciente

		Paciente pacienteAtualizado = pacienteService.buscarPacientePorId(id);
		assertEquals(nomeNovo, pacienteAtualizado.getNome());
		assertEquals(idadeNova, pacienteAtualizado.getIdade());
		++passContador;
	}
}
