package com.fiap.challenge.paciente.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.challenge.paciente.api.model.HmvPaciente;

@Repository
public interface PacienteRepository  extends JpaRepository<HmvPaciente, Integer>{

}

