package com.fiap.challenge.paciente.api.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fiap.challenge.paciente.api.dto.PacienteDTO;
import com.fiap.challenge.paciente.api.mapper.PacienteMapper;
import com.fiap.challenge.paciente.api.model.HmvPaciente;
import com.fiap.challenge.paciente.api.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository repository;
	
    private final Logger logger = LoggerFactory.getLogger(PacienteService.class);
	final PacienteMapper mapper = Mappers.getMapper(PacienteMapper.class);

	
	public ResponseEntity<PacienteDTO> recuperaPaciente(final String pacienteId) {
		
		logger.info("Iniciando recuperacao de paciente com id {}",pacienteId);
		final Optional<HmvPaciente> paciente = repository.findById(Integer.parseInt(pacienteId));
		
		if(!paciente.isPresent()) {
			logger.info("Não encontrado paciente com id {}",pacienteId);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else { 
			logger.info("Encontrado paciente com id {}",pacienteId);
			return new ResponseEntity<>(mapper.pacienteEntityToDto(paciente.get()), HttpStatus.OK);			
		}
		
	}

	@Transactional
	public ResponseEntity<PacienteDTO> atualizaDadosPaciente(String pacienteId, PacienteDTO pacienteAlterado) {
		logger.info("Iniciando recuperacao de paciente com id {}",pacienteId);

		Optional<HmvPaciente> pacienteOptional = repository.findById(Integer.valueOf(pacienteId));
		
		if(!pacienteOptional.isPresent()) {
			logger.info("Não encontrado paciente com id {}",pacienteId);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			logger.info("Iniciando atualizacao de paciente com id {}",pacienteId);

			HmvPaciente paciente = pacienteOptional.get();
		    mapper.updatePacienteFromDto(pacienteAlterado, paciente);
		    repository.save(paciente);
		}
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
		
	}

}
