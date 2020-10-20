package controller.action;

import java.util.List;

import model.bean.Paciente;
import model.business.PacienteBusiness;

public class PacienteAction extends MainAction {

	Paciente paciente;
	List<Paciente> listaPacientesForm;

	public String cadastrar() {
		PacienteBusiness pacienteBusiness = new PacienteBusiness();
		return pacienteBusiness.cadastrar(paciente);
	}
	
	public String listar() {
		PacienteBusiness pacienteBusiness = new PacienteBusiness();
		listaPacientesForm = pacienteBusiness.getTodos();
		return "success";
	}
	
	public String detalhar() {
		PacienteBusiness pacienteBusiness = new PacienteBusiness();
		paciente = pacienteBusiness.detalhar(paciente.getId());	
		return "success";
		}
	
	public String atualizar() {
		PacienteBusiness pacienteBusiness = new PacienteBusiness();
		pacienteBusiness.atualizar(paciente);
		return "success";
	}

	//Navega��o
	
	public String navegarCadastro() {
		return "success";	
	}
	
	//Getters & Setters
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getListaPacientesForm() {
		return listaPacientesForm;
	}

	public void setListaPacientesForm(List<Paciente> listaPacientesForm) {
		this.listaPacientesForm = listaPacientesForm;
	}
	
}