package br.com.pdcase.agendamento.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Colaboradores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idColaborador;
	private String nome;
	private String departamento;
	private String email;
	@OneToMany(mappedBy = "colaboradores", cascade = CascadeType.ALL)
	private List<Agendamentos> agendamentos;
	
	
	public Long getIdColaborador() {
		return idColaborador;
	}
	public void setIdColaborador(Long id) {
		this.idColaborador = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}	
