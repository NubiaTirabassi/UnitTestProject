package exemplo.com.Service;

import java.util.ArrayList;
import java.util.List;

import exemplo.com.model.Paciente;

public class PacienteService {

	private List<Paciente> pacientes = new ArrayList<>();

	public void adicionarPaciente(Paciente paciente) {
		pacientes.add(paciente);
	}

	public Paciente buscarPacientePorId(int id) {
		for (Paciente paciente : pacientes) {
			if (paciente.getId() == id) {
				return paciente;
			}
		}
		return null;
	}

	public List<Paciente> listarPacientes() {
		return pacientes;
	}

	public void atualizarPaciente(Paciente paciente) {
		Paciente pacienteExistente = buscarPacientePorId(paciente.getId());
		if (pacienteExistente != null) {
			pacienteExistente.setNome(paciente.getNome());
			pacienteExistente.setIdade(paciente.getIdade());
		}
	}

	public void excluirPaciente(int id) {
		Paciente pacienteExistente = buscarPacientePorId(id);
		if (pacienteExistente != null) {
			pacientes.remove(pacienteExistente);
		}

	}
}
