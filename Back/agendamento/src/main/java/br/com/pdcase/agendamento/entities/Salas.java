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
public class Salas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSala;
	private String numeroDaSala;
	private Integer capacidade;
	private String recursos;
	@OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
	private List<Agendamentos> agendamentos;
	
	
	public Long getIdSala() {
		return idSala;
	}
	public void setIdSala(Long id) {
		this.idSala = id;
	}
	public String getNumeroDaSala() {
		return numeroDaSala;
	}
	public void setNumeroDaSala(String numeroDaSala) {
		this.numeroDaSala = numeroDaSala;
	}
	public Integer getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	public String getRecursos() {
		return recursos;
	}
	public void setRecursos(String recursos) {
		this.recursos = recursos;
	}
	
	
}
