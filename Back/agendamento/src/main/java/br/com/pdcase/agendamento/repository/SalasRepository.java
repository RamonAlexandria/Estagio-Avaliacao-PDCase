package br.com.pdcase.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdcase.agendamento.entities.Salas;

@Repository
public interface SalasRepository extends JpaRepository<Salas, Long> {
	
}
