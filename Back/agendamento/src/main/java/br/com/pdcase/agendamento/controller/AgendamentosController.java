package br.com.pdcase.agendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pdcase.agendamento.entities.Agendamentos;
import br.com.pdcase.agendamento.repository.AgendamentosRepository;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentosController {
		
		@Autowired
		AgendamentosRepository repositoryagendamentos;
		
		@GetMapping("/buscar")
		public List<Agendamentos> buscarAgendamentos() {
			List<Agendamentos> agendamentos = repositoryagendamentos.findAll();
			return agendamentos;
		}
}
		
		