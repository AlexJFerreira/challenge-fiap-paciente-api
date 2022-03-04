package com.fiap.challenge.paciente.api.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.challenge.paciente.api.dto.PacienteDTO;
import com.fiap.challenge.paciente.api.service.PacienteService;

@RestController
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping(value = "/pacientes/{pacienteId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PacienteDTO> recuperaDadosPaciente(@Valid @PathVariable("pacienteId") String pacienteId) {
		return pacienteService.recuperaPaciente(pacienteId);
	}
	
	@PatchMapping(value = "/pacientes/{pacienteId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PacienteDTO> atualizaDadosPaciente(@Valid @PathVariable("pacienteId") String pacienteId, @Valid @RequestBody PacienteDTO pacienteAlterado) {
		return pacienteService.atualizaDadosPaciente(pacienteId, pacienteAlterado);
	}

}
