package model.business;

import java.util.List;
import model.dao.PacienteDao;
import model.bean.Paciente;

public class PacienteBusiness {

	public String cadastrar(Paciente paciente) {
		PacienteDao pacienteDao = new PacienteDao();
		return pacienteDao.cadastrar(paciente);
	}

	public List<Paciente> getTodos() {
		PacienteDao pacienteDao = new PacienteDao();
		return pacienteDao.geTodos();
	}

	public Paciente detalhar(int codigo) {
		PacienteDao pacienteDao = new PacienteDao();
		return pacienteDao.detalhar(codigo);
	}

	public String atualizar(Paciente paciente) {
		PacienteDao pacienteDao = new PacienteDao();
		return pacienteDao.atualizar(paciente);
	}

}
