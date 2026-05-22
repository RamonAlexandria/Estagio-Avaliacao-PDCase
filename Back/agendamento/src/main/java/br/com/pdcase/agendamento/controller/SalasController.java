package br.com.pdcase.agendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pdcase.agendamento.entities.Salas;
import br.com.pdcase.agendamento.repository.SalasRepository;

@RestController
@RequestMapping("/salas")
public class SalasController {
	
	@Autowired
	SalasRepository salaRepository;

	@GetMapping("/buscar")
	public List<Salas> buscarTodasSalas() {
		List<Salas> todasSalas = salaRepository.findAll();
		return todasSalas;
	}
}
