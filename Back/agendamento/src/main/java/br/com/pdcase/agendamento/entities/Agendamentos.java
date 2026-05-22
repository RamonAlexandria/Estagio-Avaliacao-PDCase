package br.com.pdcase.agendamento.entities;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.pdcase.agendamento.controller.AgendamentosController;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Agendamentos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgendamento;
	@ManyToOne
	@JoinColumn(name = "sala_id")
	private Salas sala;
	@ManyToOne
	@JoinColumn(name = "colaborador_id")
	private Colaboradores colaboradores;
	private String titulo;
	private LocalDateTime dataAgendamento;
	private LocalDateTime horaInicio;
	private LocalDateTime horaFim;
	
	
	public Long getIdAgendamento() {
		return this.idAgendamento;
	}
	
	public void setIdAgendamento(Long idAgendamento) {
		this.idAgendamento = idAgendamento;
	}
	
	
	public Salas getSala() {
		return sala;
	}
	public void setSala(Salas sala) {
		this.sala = sala;
	}
	public Colaboradores getColaboradores() {
		return colaboradores;
	}
	public void setColaboradores(Colaboradores colaboradores) {
		this.colaboradores = colaboradores;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDateTime getData() {
		return dataAgendamento;
	}
	public void setData(LocalDateTime data) {
		this.dataAgendamento = data;
	}
	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalDateTime getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(LocalDateTime horaFim) {
		this.horaFim = horaFim;
	}
	
}
