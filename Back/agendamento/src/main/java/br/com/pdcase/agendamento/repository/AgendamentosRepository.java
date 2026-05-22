package br.com.pdcase.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdcase.agendamento.entities.Agendamentos;

@Repository
public interface AgendamentosRepository extends JpaRepository<Agendamentos, Long> {
	
}
