package br.com.pdcase.agendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pdcase.agendamento.entities.Colaboradores;
import br.com.pdcase.agendamento.repository.ColaboradoresRepository;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradoresController {
	
	@Autowired
	ColaboradoresRepository repositoryColaboradores;
	
	@GetMapping("/buscar")
	public List<Colaboradores> buscarcolaboradores() {
			List<Colaboradores> colaboradores = repositoryColaboradores.findAll();
			return colaboradores;
			
	}
	
}
